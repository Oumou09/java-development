-- 1.
SELECT Products.ProductID, Products.ProductName, Categories.CategoryName, Products.UnitPrice
FROM northwind.products
JOIN Categories ON Products.categoryID = Categories.CategoryID
ORDER BY Categories.CategoryName, Products.ProductName;


-- 2.
SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Suppliers.CompanyName
FROM northwind.Products 
JOIN Suppliers ON Products.ProductID = Suppliers.SupplierID
WHERE Products.UnitPrice > 75
ORDER BY Products.ProductName;


-- 3. 
SELECT p.ProductID, p.ProductName, c.CategoryName, p.UnitPrice
FROM northwind.Products p
JOIN Categories c ON p.categoryID = c.CategoryID
JOIN Suppliers s ON p.ProductID = s.SupplierID
ORDER BY p.ProductName;



-- 4.
SELECT p.ProductID, p.ProductName, c.CategoryName
FROM northwind.Products p
JOIN Categories c ON p.categoryID = c.CategoryID
WHERE p.UnitPrice = (
SELECT MAX(UnitPrice)
FROM Products
);


-- 5.
SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName AS ShippingCompany
FROM Orders o
JOIN Shippers s ON o.ShipVia = s.ShipperID
WHERE o.ShipCountry = "Germany";


-- 6.
SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
FROM Orders o
JOIN `Order Details` od ON o.OrderID = od.OrderID
JOIN Products p On od.ProductID = p.ProductID
WHERE p.ProductName = "Sasquatch Ale";


