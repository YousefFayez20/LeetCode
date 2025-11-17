# Write your MySQL query statement below
select id from weather w where temperature > (select temperature from weather x where x.recordDate = w.recordDate-INTERVAL 1 DAY );
