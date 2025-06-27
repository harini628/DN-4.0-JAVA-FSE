CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account   IN NUMBER,
    amount       IN NUMBER
) AS
    insufficient_funds EXCEPTION;
    v_balance NUMBER;
BEGIN
    -- Check balance of source account
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = from_account;

    IF v_balance < amount THEN
        RAISE insufficient_funds;
    ELSE
        -- Deduct from source
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = from_account;

        -- Add to destination
        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = to_account;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('₹' || amount || ' transferred from Account ' || from_account || ' to Account ' || to_account);
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('One or both account IDs not found.');
    WHEN insufficient_funds THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient funds in source account.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/


--sql.main

EXEC TransferFunds(1002, 1003, 1000);
