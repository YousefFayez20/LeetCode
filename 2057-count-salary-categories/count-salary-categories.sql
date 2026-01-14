# Write your MySQL query statement below
select c.category, COALESCE(t.accounts_count,0) as accounts_count
from ( SELECT 'Low Salary' AS category
    UNION ALL SELECT 'Average Salary'
    UNION ALL SELECT 'High Salary' ) c
    left join (
        select
        case
        when income < 20000 then 'Low Salary'
        when income >= 20000 and income <= 50000 then 'Average Salary'
        else 'High Salary'
        end as category,
        count(account_id) as accounts_count
        from accounts group by category
    ) t on c.category = t.category;