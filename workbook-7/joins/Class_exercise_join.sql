-- 1. question
SELECT  ProductName
FROM Products
Where UnitPrice = (SELECT max(UnitPrice)
                 FROM products);
                 
  -- 2. Question
  SELECT OrderID, ShipName, ShipAddress
  FROM Orders
  WHERE ShipVia = (
  SELECT ShipperID
  FROM Shippers
  WHERE CompanyName = "Federal Shipping"
  );
  
  
  -- 3. 
  SELECT OrderID
  FROM `Order Details`
  WHERE ProductID = (
  SELECT ProductID
  FROM Products
  WHERE ProductName = "Sasquatch Ale"
  );
  
  
  -- 4.
  SELECT FirstName, LastName
  FROM Employees
  WHERE EmployeeID = (
  SELECT EmployeeID
  FROM Orders
  WHERE OrderID = "10266"
  );
  
  
  -- 5.
  SELECT CompanyName
  FROM Customers
  WHERE CustomerID = (
  SELECT CustomerID
  FROM orders 
  WHERE OrderID = "10266"
  );
  
  
  -- 6.
  