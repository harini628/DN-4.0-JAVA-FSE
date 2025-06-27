DECLARE
    v_name VARCHAR2(100);
BEGIN
    FOR loan_rec IN (
        SELECT c.Name, l.DueDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: ' || loan_rec.Name || 
                             ', your loan is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-Mon-YYYY'));
    END LOOP;
END;
/
