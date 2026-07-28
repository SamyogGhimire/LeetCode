# Write your MySQL query statement below
select u.unique_id, e.name from Employees As e
left join EmployeeUNI as u
on u.id = e.id;