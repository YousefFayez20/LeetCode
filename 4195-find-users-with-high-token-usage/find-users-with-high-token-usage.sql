# Write your MySQL query statement below
select user_id, count(prompt) as  prompt_count , Round(AVG(tokens),2) as avg_tokens
from prompts group by user_id having count(prompt) > 2 and MAX(tokens) > AVG(tokens)
order by AVG(tokens) desc, user_id;
