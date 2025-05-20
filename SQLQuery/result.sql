show databases;

use group024;

create table ResultApp(id int not null auto_increment, PRN int unique, Name varchar(30), C_Marks float, CPP_Marks float, Java_Marks float, primary key(id)); 

desc resultapp;


select * from ResultApp;