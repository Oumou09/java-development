SELECT e.id, e.first_name, e.last_name, p.description, p.min_val, p.max_val
FROM Employee e
JOIN pay_grade p ON e.pay_grade_id = p.id;