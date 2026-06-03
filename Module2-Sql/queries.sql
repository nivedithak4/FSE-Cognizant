show databases;
use training;
show tables;
select * from users;
select * from events;
select * from sessions;
select * from registrations;
select * from feedback;
select * from resources;

#1
select u.full_name,e.title,e.city,e.start_date
from users u
JOIN registrations r on u.user_id=r.user_id
JOIN events e on r.event_id=e.event_id
WHERE e.status='upcoming'
and u.city=e.city
order by e.start_date;

#2
select e.title,AVG(f.rating) as avg_rating,count(*) as feedback_ct
from events e
join feedback f on e.event_id=f.event_id
group by e.event_id,e.title
having count(*)>=10
order by avg_rating desc;

#3
select * from users u 
where u.user_id not in( 
select r.user_id from registrations r
where r.registration_date >= curdate() - interval 90 day);

#4
select e.title,count(*) as session_ct from events e 
join sessions s on e.event_id=s.event_id
where time(s.start_time) between '10:00:00' and '12:00:00' group by e.title;

#5
select e.city,count(distinct r.user_id) as dist_userreg from registrations r 
join events e on r.event_id=e.event_id 
group by e.city order by dist_userreg desc limit 5;

#6
select e.title ,count(r.resource_id) as res_ct from events e
left join resources r on e.event_id=r.event_id
group by e.title;

#7
select u.full_name,f.comments,e.title 
from feedback f
join users u on f.user_id=u.user_id
join events e on f.event_id = e.event_id
where rating<3;

#8
select e.title ,count(s.session_id) as session_ct
from events e
left join sessions s on e.event_id=s.event_id
where e.status='upcoming' group by e.title;

#9
select organizer_id,status,
count(*) as tot_events 
from events 
group by organizer_id,status;

#10
select e.title from events e
join registrations r on e.event_id = r.event_id
left join feedback f on e.event_id = f.event_id
where f.feedback_id is null
group by e.title; 

#11
select registration_date,count(user_id) as user_ct
from users 
where registration_date >= curdate()-interval 7 day
group by registration_date
order by registration_date;

#12
select e.title , count(*) as event_ct from events e
join sessions s on e.event_id=s.event_id
group by e.event_id,e.title
order by event_ct desc
limit 1;

#13
SELECT e.city,AVG(f.rating) AS avg_rating
FROM feedback f
JOIN events e
ON f.event_id = e.event_id
GROUP BY e.city;

#14
SELECT event_id, COUNT(*) AS total_registrations 
FROM Registrations 
GROUP BY event_id 
ORDER BY total_registrations DESC 
LIMIT 3;

#15
SELECT s1.session_id AS session_1, s2.session_id AS session_2, s1.event_id 
FROM Sessions s1 
JOIN Sessions s2 ON s1.event_id=s2.event_id AND s1.session_id<s2.session_id 
WHERE s1.start_time<s2.end_time AND s1.end_time>s2.start_time;

#16
SELECT * FROM Users 
WHERE registration_date>=DATE_SUB(CURDATE(), INTERVAL 30 DAY) 
AND user_id NOT IN (SELECT user_id FROM Registrations);

#17
SELECT speaker_name 
FROM Sessions 
GROUP BY speaker_name 
HAVING COUNT(session_id)>1;

#18
SELECT e.event_id, e.title 
FROM Events e 
LEFT JOIN Resources r ON e.event_id=r.event_id 
WHERE r.resource_id IS NULL;

#19
SELECT e.event_id, e.title, COUNT(DISTINCT r.registration_id) AS total_registrations, AVG(f.rating) AS avg_rating 
FROM Events e 
LEFT JOIN Registrations r ON e.event_id=r.event_id 
LEFT JOIN Feedback f ON e.event_id=f.event_id 
WHERE e.status='completed' 
GROUP BY e.event_id, e.title;

#20
SELECT u.user_id, u.full_name, COUNT(DISTINCT r.registration_id) AS events_attended, COUNT(DISTINCT f.feedback_id) AS feedback_submitted 
FROM Users u 
LEFT JOIN Registrations r ON u.user_id=r.user_id 
LEFT JOIN Feedback f ON u.user_id=f.user_id 
GROUP BY u.user_id, u.full_name;

#21
SELECT user_id, COUNT(feedback_id) AS feedback_count 
FROM Feedback 
GROUP BY user_id 
ORDER BY feedback_count DESC 
LIMIT 5;

#22
SELECT user_id, event_id, COUNT(*) AS registration_count 
FROM Registrations 
GROUP BY user_id, event_id 
HAVING COUNT(*)>1;

#23
SELECT DATE_FORMAT(registration_date, '%Y-%m') AS registration_month, COUNT(*) AS total_registrations 
FROM Registrations 
WHERE registration_date>=DATE_SUB(CURDATE(), INTERVAL 12 MONTH) 
GROUP BY registration_month 
ORDER BY registration_month;

#24
SELECT event_id, AVG(TIMESTAMPDIFF(MINUTE, start_time, end_time)) AS avg_duration_minutes 
FROM Sessions 
GROUP BY event_id;

#25
SELECT e.event_id, e.title 
FROM Events e 
LEFT JOIN Sessions s ON e.event_id=s.event_id 
WHERE s.session_id IS NULL;

