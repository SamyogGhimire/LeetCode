# Write your MySQL query statement below
select Person.email from Person 
Group by email
having count(email) > 1;