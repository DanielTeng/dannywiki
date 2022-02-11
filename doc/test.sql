drop table if exists `demo2`;
create table `demo2` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment '名称',
                        primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='测试';

insert into `demo2` (id, name) values (1, '测试2');
