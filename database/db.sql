-- postgresql 操作命令

-- 显示数据库
\l

-- 选择数据库
\c lighthouse

-- 显示当前数据库的所有表格
\d 
\d student

-- 退出数据库
\q

-- sql语法

-- 创建数据库
create database lighthouse;

-- 删除数据库
drop database lighthouse;

-- 创建表
create table student (
    id int primary key,
    name varchar(255) not null,
    math int
);

-- 删除表
drop table student;

-- 修改表
alter table student add english int;
alter table student drop column english;
alter table student add constraint PK primary key (id);
alter table student alter column name set not null;

-- 插入数据
insert into student (id,name,math) values (33012,'satou',61);
insert into student (id,name,math) values 
(33014,'suzuki',66),
(33015,'yamada',90);
insert into student values (33017,'kojima',3);
insert into student values (33018,'kojima',99);

-- 查询表
select * from student;
select name,math from student;
select distinct name from student;

select * from student where name = 'kojima';
select * from student where math >= 60;
select * from student where name != 'kojima';
select * from student where name <> 'kojima';
select * from student where name = 'kojima' and math > 60;
select * from student where name = 'kojima' or math > 60;
select * from student where name like '%a%';
select * from student where name in ('satou','suzuki');
select * from student where math between 60 and 80;

-- 查询并排序
select * from student order by math;
select * from student order by math desc ;

-- 查询函数
select count(name) from student;
select avg(math) from student;
select min(math) from student;
select max(math) from student;
select count(name),avg(math),min(math),max(math) from student;

-- 删除数据
delete from student where name = 'kojima';

-- 更新数据
update student set math = 80 where name = 'satou';

-- 表链接
select company.id,name,salary,department.dept from company full outer join department on company.id = department.emp_id; 
select company.id,name,salary,department.dept from company left outer join department on company.id = department.emp_id; 
select company.id,name,salary,department.dept from company right outer join department on company.id = department.emp_id; 
select company.id,name,salary,department.dept from company inner join department on company.id = department.emp_id; 

select name,sum(salary) from company group by name order by sum;
select name from company group by name having count(name)>1;