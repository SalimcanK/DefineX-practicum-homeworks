DROP TABLE IF EXISTS invoice cascade;
DROP TABLE IF EXISTS customer cascade;
DROP TABLE IF EXISTS company cascade;

create table customer
(
    customer_id  bigint not null primary key,
    created_date timestamp(0) default now(),
    full_name    varchar(255)
);

create table company
(
    company_id  bigint not null primary key,
    industry varchar(255),
    company_name     varchar(255)
);

create table invoice
(
    invoice_id  bigint not null primary key,
    cost         bigint       default 0,
    created_date timestamp(0) default now(),
    company_id   bigint not null references company,
    customer_id  bigint not null references customer
);

INSERT INTO customer (customer_id,full_name,created_date)
VALUES
  (1,'Eleanor Verne','2018-06-04 00:04:48'),
  (2,'Clifford Adams','2021-11-27 20:13:01'),
  (3,'Emma Richards','2020-05-23 12:23:48'),
  (4,'Thomas Myers','2022-04-26 01:55:25'),
  (5,'Simeon Crocket','2023-06-14 22:48:04');

INSERT INTO company (company_id,company_name,industry)
VALUES
  (1,'Loval','COSMETIC'),
  (2,'Zava','FASHION'),
  (3,'Sovi','TECH');

INSERT INTO invoice (invoice_id,cost,created_date,customer_id,company_id)
VALUES
  (1000,2587,'2021-06-10 19:10:42',1,1),
  (1007,1080,'2021-06-09 14:59:36',1,1),
  (1014,172,'2023-06-28 09:03:38',2,1),
  (1021,2245,'2023-06-03 22:54:10',2,2),
  (1028,1886,'2023-06-19 23:38:55',3,2),
  (1035,2568,'2023-06-14 03:41:17',3,2),
  (1063,5690,'2022-06-24 22:27:06',5,3);
  
INSERT INTO invoice (invoice_id,cost,created_date,customer_id,company_id)
VALUES
  (1070,354,'2023-03-03 14:30:29',1,3),
  (1077,229,'2022-01-17 12:25:45',1,3),
  (1105,3180,'2023-05-27 13:10:34',3,1),
  (1112,1946,'2021-08-08 20:30:58',4,3),
  (1119,2675,'2023-10-10 23:50:38',4,1),
  (1126,11820,'2022-08-31 09:43:25',5,2),
  (1133,8300,'2021-06-02 01:15:22',5,2);
  
INSERT INTO invoice (invoice_id,cost,created_date,customer_id,company_id)
VALUES
  (1140,10290,'2023-09-20 03:03:56',1,2),
  (1168,274,'2021-04-08 15:20:31',3,3),
  (1175,893,'2021-10-18 02:27:21',3,3),
  (1182,2046,'2022-07-02 01:16:48',4,3);