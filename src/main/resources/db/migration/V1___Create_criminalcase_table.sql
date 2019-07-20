create table `criminal_case`(
  `id` int not null primary key auto_increment,
  `case_name` varchar(255) not null,
  `case_time` bigint not null,
  `procuratorate_id` int
)