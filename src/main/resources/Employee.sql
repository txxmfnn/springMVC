
create table EMPLOYEE
(
  empid  VARCHAR2(50) not null,
  name   VARCHAR2(50),
  salary NUMBER(5),
  sex    VARCHAR2(50),
  dep    VARCHAR2(50)
)
;
comment on table EMPLOYEE
  is 'Ա����';

prompt Loading EMPLOYEE...
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('1', 'joy', 1500, 'm', '�ۺϲ�');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('2', 'mano', 1800, 'f', '�ۺϲ�');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('3', 'cha', 2000, 'm', '�ۺϲ�');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('4', 'rose', 2100, 'm', '�ۺϲ�');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('5', 'phea', 1400, 'f', '������Դ��');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('6', 'arthur', 2100, 'm', '������Դ��');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('7', 'sasun', 1000, 'f', '������Դ��');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('8', 'jack', 4000, 'm', '������');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('9', 'maech', 3000, 'm', '������');
insert into EMPLOYEE (empid, name, salary, sex, dep)
values ('10', 'gab', 1900, 'm', '������Դ��');
commit;

