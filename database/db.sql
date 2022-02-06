-- 查看db 
¥l

-- 创建db
create database lighthouse;

-- 选择 db
\c lighthouse

-- 删除db
drop database lighthouse;

-- 创建table
create table student (
    ID int,
    StudentName varchar(255),
    Address varchar(255)
);

-- 查看table
\d student

-- 修改table
alter table student add age int;
alter table student drop column age;
alter table student add constraint PK primary key (id);
alter table student add constraint PK primary key (id);
alter table student alter column address set not null ;

-- 插入数据
insert into student (id,studentname,address) values ( 1,'张三','东京');
insert into student (id,studentname,address) values ( 2,'李四','大阪');
insert into student (id,studentname,address) values ( 3,'王五','京都');
insert into student (id,studentname,address) values ( 4,'王五','京都');

-- 查询数据
select  * from student;
select  studentname,address from student;
select  distinct studentname,address from student;
SELECT id, studentname, address FROM public.student order by id desc;
select * from student where studentname like '三';


-- 修改数据
update student set studentname = '赵六' where id = 4;

-- 删除数据
delete from student where id = 4;
delete from student;


select company.id, name, dept from company left outer join department on company.id = emp_id;
select company.id, name, dept from company full outer join department on company.id = emp_id;

select count(name) from student;
select avg(math) from student;
select sum(math) from student;

where name in ('satou','suzuki')
