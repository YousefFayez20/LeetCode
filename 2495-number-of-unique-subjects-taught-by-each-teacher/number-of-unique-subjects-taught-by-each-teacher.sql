# Write your MySQL query statement below
select teacher_id,count(Distinct subject_id) AS cnt from Teacher group by teacher_id;
