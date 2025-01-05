create table student(
StudentID serial primary key,
name text not null,
surname text not null,
age int not null,
sex text
);

select *
from student;

insert into student (name, surname, age, sex)
values ('Alice', 'Smith', 20, 'Female'),
('Bob', 'Johnson', 22, 'Male'),
('Charlie', 'Brown', 19, 'Male'),
('Diana', 'Lee', 21, 'Female'),
('Emily', 'Davis', 23, 'Female');

update student
set age = 24
where name = 'Emily'
and surname = 'Davis';

delete from student
where name = 'Charlie'
and surname = 'Brown';

select *
from student
where sex = 'Female';

select *
from student s
where surname like 'S%';