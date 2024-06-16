create database AllDetails;
use AllDetails;
CREATE TABLE Personal (
  Name varchar(50) NOT NULL,
  Father varchar(50) ,
  Gender varchar(50) ,
  Surname varchar(50) ,
  Father_Occuption varchar(50) ,
  Mobile_Number varchar(50) ,
  Father_Number varchar(50) ,
  Domicile varchar(50) ,
  CNIC varchar(50)  ,
  Dath_OF_Birth varchar(50) ,
  Email varchar(50) ,
  City varchar(50) ,
  Province varchar(50) ,
  Nationality varchar(50) ,
  Addres varchar(70) );
CREATE TABLE Education (
  Matric_Obtained varchar(100) ,
  Matric_Total varchar(100),
  Matric_Percentage varchar(100) ,
  Matric_Passing_Year varchar(100) ,
  Matric_Board varchar(100) ,
  Matric_College varchar(100) ,
  HSC_Obtained varchar(100) ,
  HSC_Total varchar(100) ,
  HSC_Percentage varchar(100) ,
  HSC_Passing_Year varchar(100)  ,
  HSC_Board varchar(100) ,
  HSC_College varchar(50) ,
  Other_Obtained varchar(100) ,
  Other_Total varchar(100) ,
  Other_Percentage varchar(100) ,
  Other_Passing_Year varchar(100) ,
  Other_Board varchar(100) ,
  Other_College varchar(100) , Seat_No varchar(50));
  create table pro(Program varchar(80) , Campus varchar(80));