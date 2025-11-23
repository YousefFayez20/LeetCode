# Write your MySQL query statement below
/*
Write an SQL query that reports the average experience years of all the employees for each project, rounded to 2 digits.
*/

select p.project_id, ROUND(AVG(e.experience_years),2) as average_years from Project p join Employee e on e.employee_id = p.employee_id group by p.project_id;