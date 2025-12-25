# Write your MySQL query statement below
select d.name as Department  , e.name as Employee , e.salary as Salary  from employee e join department d
on e.departmentId = d.id join (select departmentId , MAX(salary) AS max_salary
from employee group by departmentId
) m
on e.departmentId = m.departmentId and e.salary = m.max_salary;
