-- user Authentication purpose

create table user_auth(uid int primary key AUTO_INCREMENT, Uname varchar(30) not null, Upass varchar(16) not null, Uemail varchar(30) not null, UaccType varchar(10) not null);

-- course
create table courses(course_id int primary key, course_name varchar(10), recommend_period_day int, total_point int);