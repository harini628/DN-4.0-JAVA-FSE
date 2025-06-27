-- Accounts table
CREATE TABLE Accounts (
    AccountID     NUMBER PRIMARY KEY,
    CustomerID    NUMBER,
    AccountType   VARCHAR2(20), 
    Balance       NUMBER
);

-- Employees table
CREATE TABLE Employees (
    EmployeeID    NUMBER PRIMARY KEY,
    Name          VARCHAR2(100),
    Department    VARCHAR2(50),
    Salary        NUMBER
);

-- Insert 
INSERT INTO Accounts VALUES (1001, 1, 'Savings', 5000);
INSERT INTO Accounts VALUES (1002, 2, 'Savings', 8000);
INSERT INTO Accounts VALUES (1003, 3, 'Current', 10000);
INSERT INTO Accounts VALUES (1004, 4, 'Savings', 3000);

INSERT INTO Employees VALUES (1, 'Ravi Kumar', 'Finance', 50000);
INSERT INTO Employees VALUES (2, 'Sneha Reddy', 'HR', 45000);
INSERT INTO Employees VALUES (3, 'Arun Das', 'Finance', 60000);
INSERT INTO Employees VALUES (4, 'Meena Iyer', 'Tech', 70000);

COMMIT;
