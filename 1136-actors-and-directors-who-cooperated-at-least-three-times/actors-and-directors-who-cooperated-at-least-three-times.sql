# Write your MySQL query statement below
select actor_id, director_id
FROM ActorDirector
group by actor_id , director_id
having count(actor_id) >= 3