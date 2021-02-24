drop database if exists mybatis_study;
create database mybatis_study character set utf8mb4;

use mybatis_study;

drop table if exists user;
create table user(
                     id int primary key auto_increment,
                     username varchar(20) not null unique comment '账号',
                     password varchar(20) not null comment '密码',
                     nickname varchar(20) comment '用户昵称',
                     sex bit default 0 comment '性别，0/false为女，1/true为男',
                     birthday date comment '生日',
                     head varchar(50) comment '头像地址',
                     create_time timestamp default now() comment '创建日期，默认为插入时的日期'
) comment '用户表';

drop table if exists article;
create table article(
                        id int primary key auto_increment,
                        title varchar(20) not null comment '文章标题',
                        content mediumtext not null comment '文章内容',
                        view_count int default 0 comment '文章浏览量',
                        user_id int comment '外键：用户id',
                        create_time timestamp default now() comment '创建日期，默认为插入时的日期',
                        foreign key(user_id) references user(id)
) comment '文章表';

insert into user(username, password) values ('a1', '11');
insert into user(username, password) values ('a2', '12');
insert into user(username, password) values ('b', '2');
insert into user(username, password) values ('c', '3');

insert into article(title, content, user_id) value ('快速排序', 'public ...', 1);
insert into article(title, content, user_id) value ('冒泡排序', 'private ...', 1);
insert into article(title, content, user_id) value ('选择排序', 'private ...', 1);
insert into article(title, content, user_id) value ('归并排序', 'public ...', 2);
insert into article(title, content, user_id) value ('插入排序', 'protected ...', 2);
insert into article(title, content, user_id) value ('希尔排序', 'protected ...', 3);
insert into article(title, content, user_id) value ('List', 'public ...', 4);
insert into article(title, content, user_id) value ('Set', 'public ...', 4);
insert into article(title, content, user_id) value ('Map', 'public ...', 4);