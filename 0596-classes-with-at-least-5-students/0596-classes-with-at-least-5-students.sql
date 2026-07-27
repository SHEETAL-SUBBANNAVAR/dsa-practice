# Write your MySQL query statement below
SELECT class
  FROM Courses 
  GROUP BY CLASS
  HAVING COUNT(*) >= 5;