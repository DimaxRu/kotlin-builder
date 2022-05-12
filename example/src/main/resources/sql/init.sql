DROP TABLE CUSTOMER IF EXISTS;
CREATE TABLE CUSTOMER (
    CUSTOMER_ID integer identity primary key,
    CUSTOMER_NAME varchar(50),
    CUSTOMER_ADDRESS varchar(255),
    CUSTOMER_CITY varchar(50),
    CUSTOMER_STATE varchar(50),
    CUSTOMER_ZIP_POSTAL varchar(30)
);

INSERT INTO CUSTOMER VALUES(1,'Sumit Ghosh','Garfa','Kolkata','West Bengal','700085')
INSERT INTO CUSTOMER VALUES(2,'Gourab Guha','Garia','Kolkata','West Bengal','700145')
INSERT INTO CUSTOMER VALUES(3,'Debina Guha','Kestopur','Kolkata','West Bengal','700185')
INSERT INTO CUSTOMER VALUES(4,'Debabrata Poddar','Birati','Kolkata','West Bengal','700285')
INSERT INTO CUSTOMER VALUES(5,'Amit Dharmale','Thane','Mumbai','Maharastra','400140')