CREATE TABLE users (
Full_Name VARCHAR(255),
Username VARCHAR(255),
aadhaar_number VARCHAR(255),
passport VARCHAR(255),
password VARCHAR(255));

select * from users









CREATE TABLE localflights (
  FlightID VARCHAR PRIMARY KEY,
  Time TIME,
  FlightDate DATE ,
  DepartureCity VARCHAR(255),
  LandingCity VARCHAR(255),
  EconomySeats INT,
  BusinessSeats INT,
  TimeDuration INT );
  
  select * from localflights
  
  

CREATE TABLE internationalflights (
  FlightID VARCHAR PRIMARY KEY,
  Time TIME,
  FlightDate DATE ,
  DepartureCity VARCHAR(255),
  LandingCity VARCHAR(255),
  EconomySeats INT,
  BusinessSeats INT,
  TimeDuration INT );
  drop table Internationalflights
 
INSERT INTO localflights (FlightID, Time, FlightDate, DepartureCity, LandingCity, EconomySeats, BusinessSeats, TimeDuration)
VALUES ('BK001', '10:00-12:00', '20-12-2021', 'Kochi', 'Hyderbad', 30, 10, 2),
       ('B002', '01:00-03:00', '20-12-2021', 'Kochi', 'Mumbai', 25, 7, 4),
       ('B003', '10:00-01:00', '20-12-2021', 'Chennai', 'Kolkata', 22, 6, 3),
       ('E004', '02:00-05:00', '20-12-2021', 'Kochi', 'Chennai', 18, 5, 3),
       ('T005', '10:00-12:00', '20-12-2021', 'Mumbai', 'Banglore', 21, 9, 2),
       ('A006', '10:00-12:00', '20-12-2021', 'Banglore', 'Mumbai', 17, 8, 2);
	   
INSERT INTO internationalflights (FlightID, Time, FlightDate, DepartureCity, LandingCity, EconomySeats, BusinessSeats, TimeDuration)
VALUES('PC001', '10:00-12:00', '20-12-2021', 'Kochi', 'Dubai', 30, 10, 2),
('PA002', '01:00-03:00', '20-12-2021', 'Delhi', 'UK', 25, 7, 4),
('PI003', '10:00-01:00', '20-12-2021', 'Banglore', 'Sharja', 22, 2, 3),
('PS004', '02:00-05:00', '20-12-2021', 'Chennai', 'Dubai', 18, 0, 3),
('PF005', '10:00-12:00', '20-12-2021', 'Mumbai', 'China', 21, 9, 2),
('PT006', '10:00-12:00', '20-12-2021', 'Delhi', 'Paris', 17, 1, 2)
drop table internationalflights
  
  SELECT * from localflights;
  select * from internationalflights