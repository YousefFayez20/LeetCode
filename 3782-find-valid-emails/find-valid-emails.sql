# Write your MySQL query statement below
select user_id, email from users where email like '%@%.com'
and email not like '%@%@%' 
and  SUBSTRING_INDEX(email, '@', 1) REGEXP '^[A-Za-z0-9_]+$'
and SUBSTRING_INDEX(SUBSTRING_INDEX(email, '@', -1), '.com', 1) REGEXP '^[A-Za-z]+$'
order by user_id;