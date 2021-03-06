create database donSystem
use donSystem
SELECT * FROM Beneficiary
create table Organization
(
OrgName varchar(50) primary key
)


create table Volunteer
(
VolunteerName varchar(50) primary key,
Age int,
availableStatus int,
OrgName varchar(50),
ProjName varchar(50),

Foreign key (OrgName) references [dbo].[Organization](OrgName),
Foreign key (ProjName) references [dbo].[Project](ProjName)
)

create table Project
(
ProjName varchar(50) primary key,
ProjDescription varchar(250),
ProjBudget int,
OrgName varchar(50),
TeamLead varchar(50),
Foreign key (OrgName) references [dbo].[Organization](OrgName)
)

create table Beneficiary
(
BenefName varchar(50) primary key,
Age int,
AssessmentMarks int,
Accessor varchar(50),
Accessor2 varchar(50)
)
INSERT Into Donation VALUES (1, 'Faiii' , 1, '2/2/2100', 'BOOm')
create table Donation
(
DonationID int primary key,
DonorName varchar(50),
DonationDate varchar(50),
ProjName varchar(50),
Foreign key (ProjName) references [dbo].[Project](ProjName),
FOREIGN KEY (ProjName) REFERENCES Project(ProjName)
)
create table Receiving
(
DisbursmentID int primary key,
--DonationID int,
RecDate varchar(50),
DonorName varchar(50),
BenefName varchar(50),
--typeOfDon int,
--Disbursmentdate varchar(10),
ProjName varchar(50),
Foreign key (ProjName) references [dbo].[Project](ProjName) ,
Foreign key (DonorName) references [dbo].[Donor](DonorName) ,
Foreign key (BenefName) references [dbo].[Beneficiary](BenefName),
)
drop table Disbursment
drop table fundReceiving
drop table otherReceiving
create Table fundReceiving
(
	
	amount int,
	disburseId int,
	Foreign key (disburseId) references [dbo].Receiving(DisbursmentID)
)

create Table otherReceiving
(
	
		item varchar(25),
		numOfItems int,
		disburseId int,
		Foreign key (disburseId) references [dbo].Receiving(DisbursmentID)
)

create table Donor
(
DonorName varchar(50) primary key,
Age int
)


create table Items
(
	DonationID int primary key,
	ItemName varchar(50),
	Amount int,
	AmountLeft int,
	Foreign key (DonationID) references [dbo].[Donation](DonationID),
)

create table Funds
(
	DonationID int primary key,
	Amount int,
	AmountLeft int,
	Fundstype int,
	Foreign key (DonationID) references [dbo].[Donation](DonationID),
)

create table Pledge
(
DonationID int primary key,
releasedate varchar(50),
pledgedate varchar(50),
Foreign key (DonationID) references [dbo].[Donation](DonationID),
)

create table Loan
(
DonationID int primary key,
returndate varchar(50),
Foreign key (DonationID) references [dbo].[Donation](DonationID),
)

create table Gift
(
DonationID int primary key,
Foreign key (DonationID) references [dbo].[Donation](DonationID),
)

create table counts
(
		donCount int,
		recCount int
)
INSERT Into Loan VALUES (0, '25/8/2011')

drop table Funds
drop table Loan
drop table Pledge
drop Table Items
drop table Donation

select *from Organization
select * from Project
select * from Volunteer
select *from Donor
select *from Beneficiary
select *from Donation
select *from Funds	
select *from Items
select *from Loan
select *from Pledge
select *from Receiving
select *from otherReceiving
select *from fundReceiving
select * from counts
delete from Organization where OrgName =''

 