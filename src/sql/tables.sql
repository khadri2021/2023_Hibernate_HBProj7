
-- List Table script starts
drop table ORDERS;
drop table CUSTOMER1;

create table CUSTOMER1(
CUST_ID int PRIMARY KEY,
CUST_NAME varchar(30)
);
create table ORDERS(
CUST_ID int,
INDEX_TYPE int, 
ORDER_VALUES varchar(30),
KEY (CUST_ID),
CONSTRAINT FOREIGN KEY(CUST_ID) REFERENCES CUSTOMER1(CUST_ID)
);

select * from ORDERS;
select * from CUSTOMER1;

-- List Table script ends

-- Set Table script starts
drop table SIM_NUMBERS;
drop table PHONE_PROVIDER;

create table PHONE_PROVIDER(
PP_ID int PRIMARY KEY,
PP_NAME varchar(30)
);
create table SIM_NUMBERS(
PP_ID int, 
SIM_VALUES varchar(30),
KEY (PP_ID),
CONSTRAINT FOREIGN KEY(PP_ID) REFERENCES PHONE_PROVIDER(PP_ID)
);

select * from PHONE_PROVIDER;
select * from SIM_NUMBERS;

-- Set Table script ends

-- Map Table script starts
drop table HOD_DEPT;
drop table COLLEGE;

create table COLLEGE(
CLG_ID int PRIMARY KEY,
CLG_NAME varchar(30)
);
create table HOD_DEPT(
CLG_ID int, 
HOD_NAME varchar(30),
HOD_DEPT varchar(30),
KEY (CLG_ID),
CONSTRAINT FOREIGN KEY(CLG_ID) REFERENCES COLLEGE(CLG_ID)
);

select * from COLLEGE;
select * from HOD_DEPT;

-- Map Table script ends