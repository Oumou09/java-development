SELECT o.id, o.sold_date, c.name, c.email
FROM `order` o
RIGHT JOIN customer c ON o.customer_id = c.id;