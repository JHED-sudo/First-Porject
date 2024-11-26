show databases;
use vcdatabase;
create table Vehicle (Vehicle_Id int PRIMARY KEY, Owner Varchar(100), 
Category varchar(50), Type varchar(50), Make varchar(50) , Model varchar(50), Year varchar(20), 
Color varchar(20), Plate_Num varchar(20), Registration_Status varchar(10));
select * from vcdatabase.vehicle;
insert into Vehicle
values(1, 'Jhed B. Gabunada', 'SUV', 'Passenger', 'Toyota', 'RAV4', '2021', 'Blue', 'ABC1234', 'Active'),
(2, 'Bob Smith', 'Sedan', 'Passenger', 'Honda', 'Civic', '2018', 'Black', 'XYZ5678', 'Expired'),
(3, 'Carol White', 'Truck', 'Commercial', 'Ford', 'F-150', '2022', 'Red', 'JKL4321', 'Active'),
(4, 'David Green', 'Motorcycle', 'Passenger', 'Yamaha', 'YZF-R3', '2019', 'Green', 'MOTO987', 'Suspended'),
(5, 'Emma Brown', 'Van', 'Commercial', 'Mercedes-Benz', 'Sprinter', '2020', 'White', 'VAN6543', 'Active');
