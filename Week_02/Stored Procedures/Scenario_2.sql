CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept_name;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('✅ Bonus of ' || bonus_percent || '% applied to ' || dept_name || ' department.');
END;
/
