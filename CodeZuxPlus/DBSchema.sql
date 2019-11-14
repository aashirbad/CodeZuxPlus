-- user Authentication purpose

create table user_auth(uid int primary key AUTO_INCREMENT, Uname varchar(30) not null, Upass varchar(16) not null, Uemail varchar(30) not null, UaccType varchar(10) not null);

-- course
create table courses(course_id int primary key, course_name varchar(10), recommend_period_day int, total_point int);

-- course taken
create table course_taken (ref int primary key auto_increment,uid int not null,course_id int not null,course_name varchar(30),points int,days_done int);