# Write your MySQL query statement below
select email As Email from person Group by email having count(email) > 1;