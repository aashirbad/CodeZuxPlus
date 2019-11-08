-- user Authentication purpose

create table UAuth(uid int primary key AUTO_INCREMENT, Uname varchar(30) not null, Upass varchar(16) not null, Uemail varchar(30) not null, UaccType varchar(10) not null);
