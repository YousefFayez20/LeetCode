# Write your MySQL query statement below
select customer_id from customer_transactions group by customer_id having
SUM(CASE WHEN transaction_type = 'purchase' THEN 1 ELSE 0 END) >= 3
AND DATEDIFF(MAX(transaction_date), MIN(transaction_date)) >= 30
and SUM(CASE WHEN transaction_type = 'refund' THEN 1 ELSE 0 END) * 1.0
    / COUNT(*) < 0.2
    order by customer_id;



