--Creating table
CREATE TABLE Customers (
    CustomerID     NUMBER PRIMARY KEY,
    Name           VARCHAR2(100),
    Age            NUMBER,
    Balance        NUMBER,
    IsVIP          VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE Loans (
    LoanID         NUMBER PRIMARY KEY,
    CustomerID     NUMBER,
    InterestRate   NUMBER,
    DueDate        DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

--Inserting datas

INSERT INTO Customers VALUES (1, 'Amit Sharma', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Priya Verma', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Rohan Das', 70, 12000, 'FALSE');
INSERT INTO Customers VALUES (4, 'Sneha Kapoor', 35, 11000, 'FALSE');
INSERT INTO Customers VALUES (5, 'Arjun Mehta', 25, 5000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 8.5, SYSDATE + 10);  
INSERT INTO Loans VALUES (102, 2, 9.0, SYSDATE + 40);   
INSERT INTO Loans VALUES (104, 4, 10.0, SYSDATE + 25); 
INSERT INTO Loans VALUES (105, 5, 9.5, SYSDATE + 90);   
COMMIT;
