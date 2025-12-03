# Write your MySQL query statement below

select class from courses group by class Having count(student) >= 5;
