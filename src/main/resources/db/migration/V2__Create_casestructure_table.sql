create table `case_structure`(
  `id` int primary key auto_increment,
  `objective_essentials` varchar(255) not null ,
  `subjective_essentials` varchar(255) not null,
  `criminal_case_id` int
)