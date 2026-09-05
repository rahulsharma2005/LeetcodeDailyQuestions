# Write your MySQL query statement below
select class
FROM Courses
group by class
having count(student) >= 5;
