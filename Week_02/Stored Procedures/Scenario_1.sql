CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR acc IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings') LOOP
        UPDATE Accounts
        SET Balance = Balance + (Balance * 0.01)
        WHERE AccountID = acc.AccountID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('✅ Monthly interest (1%) applied to all savings accounts.');
END;
/
