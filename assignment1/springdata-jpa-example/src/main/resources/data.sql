insert into student(name,address_aid) values("Human","1001");
insert into student(name,address_aid) values("Chethana","1002");
insert into student(name,address_aid) values("Kalana","1003");

insert into address(aid,a_name) values(1001,"Kurunegala");
insert into address(aid,a_name) values(1002,"Kadawatha");
insert into address(aid,a_name) values(1003,"Galle");

insert into laptop(l_id,l_name,student_stu_id) values(10001,"HP",1);
insert into laptop(l_id,l_name,student_stu_id) values(10002,"Dell",2);
insert into laptop(l_id,l_name,student_stu_id) values(10003,"Acer",2);

insert into project(p_id,p_label) values(11,"EAG-ERP");
insert into project(p_id,p_label) values(12,"EAG-BI");
insert into project(p_id,p_label) values(13,"SIBOS");

insert into telephone(t_id,t_no,student_stu_id) values(111,071548655,1);
insert into telephone(t_id,t_no,student_stu_id) values(222,071548656,1);

insert into student_project(joint_student_id,joint_project_id) values(2,11);
insert into student_project(joint_student_id,joint_project_id) values(1,13);
