CREATE DATABASE  IF NOT EXISTS `vehicle` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `vehicle`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: vehicle
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admint`
--

DROP TABLE IF EXISTS `admint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admint` (
  `AdminID` varchar(8) DEFAULT NULL,
  `AdminP` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admint`
--

LOCK TABLES `admint` WRITE;
/*!40000 ALTER TABLE `admint` DISABLE KEYS */;
INSERT INTO `admint` VALUES ('\"1\"','\"y\"'),('1','y');
/*!40000 ALTER TABLE `admint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bust`
--

DROP TABLE IF EXISTS `bust`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bust` (
  `BusId` tinyint DEFAULT NULL,
  `Model` varchar(5) DEFAULT NULL,
  `Version` varchar(5) DEFAULT NULL,
  `Color` varchar(6) DEFAULT NULL,
  `PlateNo` varchar(8) DEFAULT NULL,
  `RegistrationDate` varchar(11) DEFAULT NULL,
  `ExpirationDate` varchar(11) DEFAULT NULL,
  `BusName` varchar(12) DEFAULT NULL,
  `Assigned` tinyint DEFAULT NULL,
  `Fromm` varchar(16) DEFAULT NULL,
  `Too` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bust`
--

LOCK TABLES `bust` WRITE;
/*!40000 ALTER TABLE `bust` DISABLE KEYS */;
/*!40000 ALTER TABLE `bust` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `CarId` tinyint DEFAULT NULL,
  `Model` varchar(50) DEFAULT NULL,
  `Version` varchar(50) DEFAULT NULL,
  `Color` varchar(50) DEFAULT NULL,
  `PlateNo` varchar(20) DEFAULT NULL,
  `RegistrationDate` varchar(50) DEFAULT NULL,
  `ExpirationDate` varchar(50) DEFAULT NULL,
  `CarName` varchar(50) DEFAULT NULL,
  `Assigned` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (17,' 2012','v 1.6','White','YZ-0121','05-May-2012','09-May-2021','Civic Honda',1),(18,' 2015','v 1.8','Black','IJK-2004','12-Jun-2012','19-Oct-2021','Mira',1),(19,' 2011','v 6.4','White','IKA-1212','12-May-2012','04-May-2029','Suzuki Swift',1),(20,' 2015','v 5.1','Black','PA','12-May-2012','04-May-2029','Shahzore',0),(21,' 2017','v 9.9','Red','PAK','12-May-2012','04-May-2029','Honda City',1),(22,' 2012','v 7.1','White','JAN-1281','02-May-2011','04-Oct-2029','Cultus',1),(23,' 2012','v 1.8','White','YHK-981','02-May-2012','11-May-2019','Shahzore',1),(24,' 2014','v 6.7','Black','UJNZ-123','12-Jun-2018','03-Jun-2034','Swift',1),(25,' 2016','v 7.41','Violet','XHT-94320','Jan 21, 2016','Jan 22, 2025','Toyota Corolla Grande',1);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver` (
  `ID` varchar(9) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `FatherName` varchar(50) DEFAULT NULL,
  `Age` varchar(10) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `SecurityQuestion` varchar(50) DEFAULT NULL,
  `Type` varchar(8) DEFAULT NULL,
  `CNIC` varchar(15) DEFAULT NULL,
  `ContactNo` varchar(20) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES ('ikram1','1234','Ikram Nisar','Nisar Ali','20','Male','Mj','Car','42501-81281-1','03348129121','04-May-1996'),('mujahid01','1234','Mujahid Khaqan','Khaqan Abbasi','29','Male','Anas','Car','42501-121221-91','0343912912','05-May-1990'),('ali121','121','Ali Ahmed','Ahmed Raza','24','Male','Raza','Rickshaw','33202-5677687-9','03232344232','04-May-2018'),('khan1','12345','Ali Khan','Aziz Malik','32','Male','aqeel','Bus','23213-5665654-4','03009877654','02-May-1987'),('jav123','123','Javeria','Ch Aslam','23','Female','Raj','Bus','43987-1232123-8','03045566789','06-May-1995'),('moiz121','121','Moiz Yousuf ','Yousuf Ali','26','Male','Rajpoot','Bus','23213-5654321-6','03009898907','08-May-1994'),('ali1','1234','Ali','Ahmed','29','Male','Han','Rickshaw','43251-121812-1','0343-1291281','19-May-1998'),('123','1234','123','123','abc','Male','Ali','Car','42501-812912-92','0343-9128121','08-May-1999'),('qaiser123','pakistan','Qaiser Abbas','Mazhar Abbas','19','Male','Tasawar','Car','42501-71291-1','03434801218','02-Jun-1998'),('parvez34','9900','Parvez Khan','Zaman Ali','19','Male','Muaz','Car','42501-912415-9','0343-8080543','Apr 19, 1999'),('uzair123','901','Uzair','Kamran','19','Male','Shahzad','Car','42501-9112812-8','0343-8037123','Apr 21, 1999');
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverbusrt`
--

DROP TABLE IF EXISTS `driverbusrt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverbusrt` (
  `ID` tinyint DEFAULT NULL,
  `Username` varchar(10) DEFAULT NULL,
  `DriverName` varchar(7) DEFAULT NULL,
  `BusPlate` varchar(7) DEFAULT NULL,
  `BusId` tinyint DEFAULT NULL,
  `BusName` varchar(5) DEFAULT NULL,
  `DriverAvail` tinyint DEFAULT NULL,
  `PUsername` varchar(0) DEFAULT NULL,
  `PName` varchar(0) DEFAULT NULL,
  `Fromm` varchar(11) DEFAULT NULL,
  `Too` varchar(12) DEFAULT NULL,
  `Datee` varchar(0) DEFAULT NULL,
  `RideStatus` varchar(5) DEFAULT NULL,
  `StartTime` varchar(0) DEFAULT NULL,
  `EndTime` varchar(0) DEFAULT NULL,
  `BillStatus` varchar(50) DEFAULT NULL,
  `Bill` double DEFAULT NULL,
  `NoOfPassengers` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverbusrt`
--

LOCK TABLES `driverbusrt` WRITE;
/*!40000 ALTER TABLE `driverbusrt` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverbusrt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverbust`
--

DROP TABLE IF EXISTS `driverbust`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverbust` (
  `DriverUsername` varchar(10) DEFAULT NULL,
  `DriverName` varchar(12) DEFAULT NULL,
  `VehicleType` varchar(3) DEFAULT NULL,
  `BusPlate` varchar(8) DEFAULT NULL,
  `BusID` tinyint DEFAULT NULL,
  `BusName` varchar(12) DEFAULT NULL,
  `Fromm` varchar(12) DEFAULT NULL,
  `Too` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverbust`
--

LOCK TABLES `driverbust` WRITE;
/*!40000 ALTER TABLE `driverbust` DISABLE KEYS */;
INSERT INTO `driverbust` VALUES ('khan1','Ali Khan','Bus','PAU-1821',6,'Youngton','Gadap Town','Quaidabad'),('akram12','Akram Ali','Bus','BNI-912',7,'Buanzo','Landhi Town','Gulberg Town'),('alishba123','Alishba','Bus','MAH-891',8,'Huang','Orangi Town','S.I.T.E Town'),('jav123','Javeria','Bus','IZF-912',9,'Muang','Jamshed Town','Gulberg Town'),('moiz121','Moiz Yousuf ','Bus','RJA-912',10,'Baloch Times','Korangi Town','Orangi Town');
/*!40000 ALTER TABLE `driverbust` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drivercarrt`
--

DROP TABLE IF EXISTS `drivercarrt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drivercarrt` (
  `ID` tinyint NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) DEFAULT NULL,
  `DriverName` varchar(50) DEFAULT NULL,
  `CarPlate` varchar(50) DEFAULT NULL,
  `CarId` tinyint DEFAULT NULL,
  `CarName` varchar(50) DEFAULT NULL,
  `DriverAvail` tinyint DEFAULT NULL,
  `PUsername` varchar(50) DEFAULT NULL,
  `PName` varchar(50) DEFAULT NULL,
  `Fromm` varchar(50) DEFAULT NULL,
  `Too` varchar(50) DEFAULT NULL,
  `Datee` varchar(50) DEFAULT NULL,
  `RideStatus` varchar(50) DEFAULT NULL,
  `StartTime` varchar(20) DEFAULT NULL,
  `EndTime` varchar(20) DEFAULT NULL,
  `BillStatus` varchar(50) DEFAULT NULL,
  `Bill` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drivercarrt`
--

LOCK TABLES `drivercarrt` WRITE;
/*!40000 ALTER TABLE `drivercarrt` DISABLE KEYS */;
INSERT INTO `drivercarrt` VALUES (19,'zia12','Zia','YZ-0121',17,'Civic Honda',0,'fahad1','Fahad','Ashraf Colony','Bahria University','22/05/2018','Completed','11:40','11:41','Paid',100),(20,'123','123','JAN-1281',22,'Cultus',0,'abcd','abcdef','Dhoraji','Clifton','13/04/2021','AtPickUp','13:45','13:46','Paid',120),(21,'qaiser123','Qaiser Abbas','YHK-981',23,'Shahzore',0,'ikram123','Ikram Ali','4 Minaar','Clifton','16/06/2018','Completed','11:04','11:05','Paid',100),(22,'parvez34','Parvez Khan','UJNZ-123',24,'Swift',0,'ikram123','Ikram Ali','Clifton','Dhoraji','27/01/2019','Completed','14:39','14:44','Paid',120),(23,'uzair123','Uzair','XHT-94320',25,'Toyota Corolla Grande',0,'abcd','abcdef','Quaid-e-Azam Tomb','Sir Syed University','27/01/2019','Completed','15:06','15:07','Paid',120),(35,'123','123','JAN-1281',22,'Cultus',0,'abcd','abcdef','Ashraf Colony','Clifton',NULL,'Completed',NULL,'01:15','Paid',120),(36,'123','123','JAN-1281',22,'Cultus',0,'abcd','abcdef','Ashraf Colony','Bahria University','16/04/2021','Completed','02:02','02:03','Paid',360),(37,'123','123','JAN-1281',22,'Cultus',0,'abcd','abcdef','Dhoraji','DHA',NULL,'AtPickUp',NULL,NULL,NULL,NULL),(38,'123','123','JAN-1281',22,'Cultus',0,'abcd','abcdef','Ashraf Colony','Quaiabad',NULL,'Completed',NULL,'01:25','Paid',115);
/*!40000 ALTER TABLE `drivercarrt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drivercart`
--

DROP TABLE IF EXISTS `drivercart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drivercart` (
  `DriverUsername` varchar(9) DEFAULT NULL,
  `DriverName` varchar(14) DEFAULT NULL,
  `VehicleType` varchar(3) DEFAULT NULL,
  `CarPlate` varchar(9) DEFAULT NULL,
  `CarID` tinyint DEFAULT NULL,
  `CarName` varchar(21) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drivercart`
--

LOCK TABLES `drivercart` WRITE;
/*!40000 ALTER TABLE `drivercart` DISABLE KEYS */;
INSERT INTO `drivercart` VALUES ('zia12','Zia','Car','YZ-0121',17,'Civic Honda'),('mushtaq11','Mushtaq Ali','Car','IJK-2004',18,'Mira'),('ikram1','Ikram Nisar','Car','IKA-1212',19,'Suzuki Swift'),('mujahid01','Mujahid Khaqan','Car','PA',20,'Shahzore'),('humza1','Humza Ali','Car','PAK',21,'Honda City'),('123','123','Car','JAN-1281',22,'Cultus'),('qaiser123','Qaiser Abbas','Car','YHK-981',23,'Shahzore'),('parvez34','Parvez Khan','Car','UJNZ-123',24,'Swift'),('uzair123','Uzair','Car','XHT-94320',25,'Toyota Corolla Grande');
/*!40000 ALTER TABLE `drivercart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverrickshawrt`
--

DROP TABLE IF EXISTS `driverrickshawrt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverrickshawrt` (
  `ID` tinyint DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `DriverName` varchar(50) DEFAULT NULL,
  `RickshawPlate` varchar(20) DEFAULT NULL,
  `RickshawId` tinyint DEFAULT NULL,
  `RickshawName` varchar(50) DEFAULT NULL,
  `DriverAvail` tinyint DEFAULT NULL,
  `PUsername` varchar(50) DEFAULT NULL,
  `PName` varchar(50) DEFAULT NULL,
  `Fromm` varchar(50) DEFAULT NULL,
  `Too` varchar(50) DEFAULT NULL,
  `Datee` varchar(10) DEFAULT NULL,
  `RideStatus` varchar(50) DEFAULT NULL,
  `StartTime` varchar(50) DEFAULT NULL,
  `EndTime` varchar(50) DEFAULT NULL,
  `BillStatus` varchar(50) DEFAULT NULL,
  `Bill` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverrickshawrt`
--

LOCK TABLES `driverrickshawrt` WRITE;
/*!40000 ALTER TABLE `driverrickshawrt` DISABLE KEYS */;
INSERT INTO `driverrickshawrt` VALUES (10,'bahar121','Raj Bahar','MNH-1281',15,'Rozgar',0,'abcd','abcde','Clifton','Clifton','17/09/2018','Completed','20:47','20:48','Paid',105);
/*!40000 ALTER TABLE `driverrickshawrt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverrickshawt`
--

DROP TABLE IF EXISTS `driverrickshawt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverrickshawt` (
  `DriverUsername` varchar(50) DEFAULT NULL,
  `DriverName` varchar(50) DEFAULT NULL,
  `VehicleType` varchar(50) DEFAULT NULL,
  `RickshawPlate` varchar(20) DEFAULT NULL,
  `RickshawID` tinyint DEFAULT NULL,
  `RickshawName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverrickshawt`
--

LOCK TABLES `driverrickshawt` WRITE;
/*!40000 ALTER TABLE `driverrickshawt` DISABLE KEYS */;
INSERT INTO `driverrickshawt` VALUES ('ali121','Ali Ahmed','Rickshaw','HYA-1212',10,'Rozgar'),('hadi','Hadi','Rickshaw','PAN-124',12,'Rozgar'),('bahar121','Raj Bahar','Rickshaw','MNH-1281',15,'Rozgar'),('ali1','Ali','Rickshaw','UJN-128',16,'Sazgar');
/*!40000 ALTER TABLE `driverrickshawt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuel`
--

DROP TABLE IF EXISTS `fuel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fuel` (
  `id` int DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuel`
--

LOCK TABLES `fuel` WRITE;
/*!40000 ALTER TABLE `fuel` DISABLE KEYS */;
INSERT INTO `fuel` VALUES (1,1242);
/*!40000 ALTER TABLE `fuel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengerbusrides`
--

DROP TABLE IF EXISTS `passengerbusrides`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengerbusrides` (
  `iD` tinyint DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `DriverName` varchar(50) DEFAULT NULL,
  `VehiclePlate` varchar(50) DEFAULT NULL,
  `VehicleId` tinyint DEFAULT NULL,
  `VehicleName` varchar(50) DEFAULT NULL,
  `PUsername` varchar(50) DEFAULT NULL,
  `PName` varchar(50) DEFAULT NULL,
  `Fromm` varchar(50) DEFAULT NULL,
  `Too` varchar(50) DEFAULT NULL,
  `Datee` varchar(20) DEFAULT NULL,
  `RideStatus` varchar(50) DEFAULT NULL,
  `StartTime` varchar(50) DEFAULT NULL,
  `EndTime` varchar(50) DEFAULT NULL,
  `BillStatus` varchar(50) DEFAULT NULL,
  `Bill` varchar(50) DEFAULT NULL,
  `DriverContactNo` varchar(50) DEFAULT NULL,
  `PassengerContactNo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengerbusrides`
--

LOCK TABLES `passengerbusrides` WRITE;
/*!40000 ALTER TABLE `passengerbusrides` DISABLE KEYS */;
INSERT INTO `passengerbusrides` VALUES (4,' alishba123','Alishba','MAH-891',8,'Huang','humza990','Humza Siddique','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(5,' alishba123','Alishba','MAH-891',8,'Huang','yusuf1','Yusuf','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(6,' alishba123','Alishba','MAH-891',8,'Huang','fahad1','Fahad','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(7,' alishba123','Alishba','MAH-891',8,'Huang','humza990','Humza Siddique','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(8,' alishba123','Alishba','MAH-891',8,'Huang','ali1','Ali Ahmed','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(9,' alishba123','Alishba','MAH-891',8,'Huang','abcd','abcde','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(10,' alishba123','Alishba','MAH-891',8,'Huang','abcd','abcde','Orangi Town','S.I.T.E Town','','Built','','','','','','');
/*!40000 ALTER TABLE `passengerbusrides` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengert`
--

DROP TABLE IF EXISTS `passengert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengert` (
  `ID` tinyint DEFAULT NULL,
  `PID` varchar(50) DEFAULT NULL,
  `PPass` varchar(50) DEFAULT NULL,
  `PName` varchar(50) DEFAULT NULL,
  `PFName` varchar(50) DEFAULT NULL,
  `PAge` tinyint DEFAULT NULL,
  `PGender` varchar(50) DEFAULT NULL,
  `PSec` varchar(50) DEFAULT NULL,
  `CNIC` varchar(50) DEFAULT NULL,
  `ContactNo` varchar(50) DEFAULT NULL,
  `DOB` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengert`
--

LOCK TABLES `passengert` WRITE;
/*!40000 ALTER TABLE `passengert` DISABLE KEYS */;
INSERT INTO `passengert` VALUES (15,'fahad1','1234','Fahad','Ashfaq',19,'Male','Kashif','42501-128912-8','0342-8490123','06-May-1999'),(16,'humza990','1234','Humza Siddique','Siddique Akbar',17,'Male','Infaq Ali','42501-12501-12','0345-812741','06-May-2018'),(17,'yusuf1','1234','Yusuf','Zia',26,'Male','Kamal','42501-112812-12','0343-8037980','02-May-1987'),(18,'ali1','12345','Ali Ahmed','Ahmed Razzaq',20,'Male','Mujahid','42501-812129-9','0343801821','08-May-1999'),(19,'ikram123','1234','Ikram Ali','Ali',10,'Male','Mehdi','411414','0131313','02-Jun-2018'),(20,'ali9901','99012','Ali Abdullah','Abdullah',19,'Male','Mujahid','42501-1213112-9','0343-9120193','Mar 19, 1999'),(21,'abcd','y','abcdef','abc',20,'Male','ab','12','1','Apr 13, 2021');
/*!40000 ALTER TABLE `passengert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repairhistory`
--

DROP TABLE IF EXISTS `repairhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repairhistory` (
  `carID` tinyint DEFAULT NULL,
  `request` varchar(180) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repairhistory`
--

LOCK TABLES `repairhistory` WRITE;
/*!40000 ALTER TABLE `repairhistory` DISABLE KEYS */;
INSERT INTO `repairhistory` VALUES (22,'dndn');
/*!40000 ALTER TABLE `repairhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rickshawt`
--

DROP TABLE IF EXISTS `rickshawt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rickshawt` (
  `RickshawId` tinyint DEFAULT NULL,
  `Model` varchar(50) DEFAULT NULL,
  `Version` varchar(50) DEFAULT NULL,
  `Color` varchar(50) DEFAULT NULL,
  `PlateNo` varchar(20) DEFAULT NULL,
  `RegistrationDate` varchar(50) DEFAULT NULL,
  `ExpirationDate` varchar(50) DEFAULT NULL,
  `RickshawName` varchar(50) DEFAULT NULL,
  `Assigned` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rickshawt`
--

LOCK TABLES `rickshawt` WRITE;
/*!40000 ALTER TABLE `rickshawt` DISABLE KEYS */;
/*!40000 ALTER TABLE `rickshawt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderealtime`
--

DROP TABLE IF EXISTS `riderealtime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderealtime` (
  `iD` tinyint DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `DriverName` varchar(50) DEFAULT NULL,
  `VehiclePlate` varchar(20) DEFAULT NULL,
  `VehicleId` tinyint DEFAULT NULL,
  `VehicleName` varchar(50) DEFAULT NULL,
  `PUsername` varchar(50) DEFAULT NULL,
  `PName` varchar(50) DEFAULT NULL,
  `Fromm` varchar(50) DEFAULT NULL,
  `Too` varchar(50) DEFAULT NULL,
  `Datee` varchar(50) DEFAULT NULL,
  `RideStatus` varchar(50) DEFAULT NULL,
  `StartTime` varchar(50) DEFAULT NULL,
  `EndTime` varchar(50) DEFAULT NULL,
  `BillStatus` varchar(50) DEFAULT NULL,
  `Bill` double DEFAULT NULL,
  `DriverContactNo` varchar(50) DEFAULT NULL,
  `PassengerContactNo` varchar(50) DEFAULT NULL,
  `NoOfPassengers` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderealtime`
--

LOCK TABLES `riderealtime` WRITE;
/*!40000 ALTER TABLE `riderealtime` DISABLE KEYS */;
INSERT INTO `riderealtime` VALUES (35,'123','123','JAN-1281',22,'Cultus','abcd','abcdef','Ashraf Colony','Clifton',NULL,'Completed',NULL,'01:15','Unpaid',160,'0343-9128121','1',NULL),(36,'123','123','JAN-1281',22,'Cultus','abcd','abcdef','Ashraf Colony','Bahria University','16/04/2021','Completed','02:02','02:03','Paid',360,'0343-9128121','1',NULL),(37,'123','123','JAN-1281',22,'Cultus','abcd','abcdef','Dhoraji','DHA',NULL,'AtPickUp',NULL,NULL,NULL,NULL,'0343-9128121','1',NULL),(38,'123','123','JAN-1281',22,'Cultus','abcd','abcdef','Ashraf Colony','Quaiabad',NULL,'Completed',NULL,'01:25','Paid',115,'0343-9128121','1',NULL);
/*!40000 ALTER TABLE `riderealtime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `~tmpclp337151`
--

DROP TABLE IF EXISTS `~tmpclp337151`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `~tmpclp337151` (
  `CarId` tinyint DEFAULT NULL,
  `Model` varchar(5) DEFAULT NULL,
  `Version` varchar(7) DEFAULT NULL,
  `Color` varchar(3) DEFAULT NULL,
  `PlateNo` varchar(7) DEFAULT NULL,
  `RegistrationDate` varchar(10) DEFAULT NULL,
  `ExpirationDate` varchar(10) DEFAULT NULL,
  `CarName` varchar(12) DEFAULT NULL,
  `Assigned` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `~tmpclp337151`
--

LOCK TABLES `~tmpclp337151` WRITE;
/*!40000 ALTER TABLE `~tmpclp337151` DISABLE KEYS */;
/*!40000 ALTER TABLE `~tmpclp337151` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'vehicle'
--

--
-- Dumping routines for database 'vehicle'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-26 17:38:20
-- select * from repairhistory;
