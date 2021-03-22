begin
   execute immediate 'drop table admin';
exception
   when others then null;
end;
/

create table admin(
admin_id number(10) not null primary key,
admin_name varchar2(255) not null,
admin_nic varchar2(255) not null,
admin_mobile_no varchar2(255) not null,
admin_password varchar2(255) not null);

insert into admin(admin_name,admin_password,admin_nic,admin_mobile_no,admin_id)values('Kamal','K123456','9613v','07623423423463','001');
insert into admin(admin_name,admin_password,admin_nic,admin_mobile_no,admin_id)values('Jane','J123456','9623v','07629423433463','002');
insert into admin(admin_name,admin_password,admin_nic,admin_mobile_no,admin_id)values('kusal','123456','9673v','076294','003');

begin
   execute immediate 'drop table staff';
exception
   when others then null;
end;
/

create table staff(
staff_id number(10) not null primary key,
emp_reg_no number(10) not null,
emp_dep_no number(10) not null,
emp_name varchar2(255) not null,
emp_designation varchar2(255) not null,
enter_type varchar2(255) not null,
emp_gender varchar2(255) not null,
emp_salary varchar2(255) not null,
emp_effective_date varchar2(255) not null);

create sequence staff_seq start with 1 increment by 1;

insert into staff(staff_id,emp_reg_no,emp_dep_no,emp_name,emp_designation,enter_type,emp_gender,emp_salary,emp_effective_date)values(staff_seq.NEXTVAL,?,?,?,?,?,?,?,?);

begin
   execute immediate 'drop table timeslot';
exception
   when others then null;
end;
/

create table timeslot(
time_slot_id number(10) not null primary key,
emp_reg_no number(10) not null,
emp_name varchar2(255) not null,
enter_type varchar2(255) not null,
doctor_fee varchar2(255) not null,
start_time varchar2(255) not null,
end_time  varchar2(255) not null,
start_date varchar2(255) not null,
end_date  varchar2(255) not null);

create sequence timeslot_seq start with 1 increment by 1;

insert into timeslot(time_slot_id,emp_reg_no,emp_name,enter_type,doctor_fee,start_time,end_time,start_date,end_date)values(timeslot_seq.NEXTVAL,?,?,?,?,?,?,?,?);


begin
   execute immediate 'drop table patient';
exception
   when others then null;
end;
/

create table patient(
pat_id number(10) not null primary key,
pat_name varchar2(255) not null,
pat_nic varchar2(255) not null,
pat_mobile_no varchar2(255) not null,
pat_password varchar2(255) not null,
pat_blood_grp varchar2(255) not null);

create sequence pat_seq start with 1 increment by 1;

insert into patient(pat_id,pat_name,pat_nic,pat_mobile_no,pat_password,pat_blood_grp)values(pat_seq.NEXTVAL,?,?,?,?);


begin
   execute immediate 'drop table appointment';
exception
   when others then null;
end;
/

create table appointment(
apt_id number(10) not null primary key,
docName varchar2(255) not null,
enterType varchar2(255) not null,
patTime varchar2(255) not null,
patDate varchar2(255) not null,
patnumber varchar2(255) not null,
patname varchar2(255) not null);

create sequence apt_seq start with 1 increment by 1;
insert into appointment(apt_id,docName,enterType,patTime,patDate,patnumber,patname)values(apt_seq.NEXTVAL,?,?,?,?,?,?);



