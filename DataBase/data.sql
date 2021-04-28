-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AdminT`
--

DROP TABLE IF EXISTS `AdminT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AdminT` (
  `AdminID` varchar(8) DEFAULT NULL,
  `AdminP` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AdminT`
--

LOCK TABLES `AdminT` WRITE;
/*!40000 ALTER TABLE `AdminT` DISABLE KEYS */;
INSERT INTO `AdminT` VALUES ('adeel619',9901);
/*!40000 ALTER TABLE `AdminT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BusT`
--

DROP TABLE IF EXISTS `BusT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BusT` (
  `BusId` tinyint(4) DEFAULT NULL,
  `Model` varchar(5) DEFAULT NULL,
  `Version` varchar(5) DEFAULT NULL,
  `Color` varchar(6) DEFAULT NULL,
  `PlateNo` varchar(8) DEFAULT NULL,
  `RegistrationDate` varchar(11) DEFAULT NULL,
  `ExpirationDate` varchar(11) DEFAULT NULL,
  `BusName` varchar(12) DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL,
  `Fromm` varchar(16) DEFAULT NULL,
  `Too` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BusT`
--

LOCK TABLES `BusT` WRITE;
/*!40000 ALTER TABLE `BusT` DISABLE KEYS */;
INSERT INTO `BusT` VALUES (6,' 2018','v 2.8','Blue','PAU-1821','25-Oct-2012','19-Oct-2021','Youngton',1,'Gadap Town','Quaidabad'),(7,' 2017','v 8.0','Blue','BNI-912','29-Sep-2012','23-Jul-2021','Buanzo',1,'Landhi Town','Gulberg Town'),(8,' 2016','v 1.6','Yellow','MAH-891','10-Sep-2012','23-Jul-2021','Huang',1,'Orangi Town','S.I.T.E Town'),(9,' 2018','v 8.1','White','IZF-912','13-Jan-2012','23-Jul-2021','Muang',1,'Jamshed Town','Gulberg Town'),(10,' 1980','v 1.1','White','RJA-912','13-Jan-2012','23-Jul-2021','Baloch Times',1,'Korangi Town','Orangi Town'),(11,' 2013','v 1.9','Blue','MAN-192','10-Jan-2012','13-Jul-2019','UHA-911',0,'Shah Faisal Town','Liaquatabad Town'),(12,' 2014','v 3.5','Red','KBL-2266','14-Jan-2012','20-Jul-2019','Mazda',0,'Orangi Town','Bin Qasim Town'),(13,'2010','v 1.7','Black','MNA-1000','14-Jan-2012','20-Jul-2019','Espaco',0,'Kemari','Bin Qasim Town');
/*!40000 ALTER TABLE `BusT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CarT`
--

DROP TABLE IF EXISTS `CarT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CarT` (
  `CarId` tinyint(4) DEFAULT NULL,
  `Model` varchar(5) DEFAULT NULL,
  `Version` varchar(6) DEFAULT NULL,
  `Color` varchar(6) DEFAULT NULL,
  `PlateNo` varchar(9) DEFAULT NULL,
  `RegistrationDate` varchar(12) DEFAULT NULL,
  `ExpirationDate` varchar(12) DEFAULT NULL,
  `CarName` varchar(21) DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CarT`
--

LOCK TABLES `CarT` WRITE;
/*!40000 ALTER TABLE `CarT` DISABLE KEYS */;
INSERT INTO `CarT` VALUES (17,' 2012','v 1.6','White','YZ-0121','05-May-2012','09-May-2021','Civic Honda',1),(18,' 2015','v 1.8','Black','IJK-2004','12-Jun-2012','19-Oct-2021','Mira',1),(19,' 2011','v 6.4','White','IKA-1212','12-May-2012','04-May-2029','Suzuki Swift',1),(20,' 2015','v 5.1','Black','PA','12-May-2012','04-May-2029','Shahzore',1),(21,' 2017','v 9.9','Red','PAK','12-May-2012','04-May-2029','Honda City',1),(22,' 2012','v 7.1','White','JAN-1281','02-May-2011','04-Oct-2029','Cultus',1),(23,' 2012','v 1.8','White','YHK-981','02-May-2012','11-May-2019','Shahzore',1),(24,' 2014','v 6.7','Black','UJNZ-123','12-Jun-2018','03-Jun-2034','Swift',1),(25,' 2016','v 7.41','Violet','XHT-94320','Jan 21, 2016','Jan 22, 2025','Toyota Corolla Grande',1);
/*!40000 ALTER TABLE `CarT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Driver`
--

DROP TABLE IF EXISTS `Driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Driver` (
  `ID` varchar(9) DEFAULT NULL,
  `Password` varchar(8) DEFAULT NULL,
  `Name` varchar(14) DEFAULT NULL,
  `FatherName` varchar(13) DEFAULT NULL,
  `Age` varchar(3) DEFAULT NULL,
  `Gender` varchar(6) DEFAULT NULL,
  `SecurityQuestion` varchar(7) DEFAULT NULL,
  `Type` varchar(8) DEFAULT NULL,
  `CNIC` varchar(15) DEFAULT NULL,
  `ContactNo` varchar(12) DEFAULT NULL,
  `DOB` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Driver`
--

LOCK TABLES `Driver` WRITE;
/*!40000 ALTER TABLE `Driver` DISABLE KEYS */;
INSERT INTO `Driver` VALUES ('ikram1','1234','Ikram Nisar','Nisar Ali','20','Male','Mj','Car','42501-81281-1','03348129121','04-May-1996'),('mujahid01','1234','Mujahid Khaqan','Khaqan Abbasi','29','Male','Anas','Car','42501-121221-91','0343912912','05-May-1990'),('ali121','121','Ali Ahmed','Ahmed Raza','24','Male','Raza','Rickshaw','33202-5677687-9','03232344232','04-May-2018'),('khan1','12345','Ali Khan','Aziz Malik','32','Male','aqeel','Bus','23213-5665654-4','03009877654','02-May-1987'),('jav123','123','Javeria','Ch Aslam','23','Female','Raj','Bus','43987-1232123-8','03045566789','06-May-1995'),('moiz121','121','Moiz Yousuf ','Yousuf Ali','26','Male','Rajpoot','Bus','23213-5654321-6','03009898907','08-May-1994'),('ali1','1234','Ali','Ahmed','29','Male','Han','Rickshaw','43251-121812-1','0343-1291281','19-May-1998'),('123','1234','123','123','abc','Male','Ali','Car','42501-812912-92','0343-9128121','08-May-1999'),('qaiser123','pakistan','Qaiser Abbas','Mazhar Abbas','19','Male','Tasawar','Car','42501-71291-1','03434801218','02-Jun-1998'),('parvez34','9900','Parvez Khan','Zaman Ali','19','Male','Muaz','Car','42501-912415-9','0343-8080543','Apr 19, 1999'),('uzair123','901','Uzair','Kamran','19','Male','Shahzad','Car','42501-9112812-8','0343-8037123','Apr 21, 1999');
/*!40000 ALTER TABLE `Driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DriverBusRT`
--

DROP TABLE IF EXISTS `DriverBusRT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DriverBusRT` (
  `ID` tinyint(4) DEFAULT NULL,
  `Username` varchar(10) DEFAULT NULL,
  `DriverName` varchar(7) DEFAULT NULL,
  `BusPlate` varchar(7) DEFAULT NULL,
  `BusId` tinyint(4) DEFAULT NULL,
  `BusName` varchar(5) DEFAULT NULL,
  `DriverAvail` tinyint(4) DEFAULT NULL,
  `PUsername` varchar(0) DEFAULT NULL,
  `PName` varchar(0) DEFAULT NULL,
  `Fromm` varchar(11) DEFAULT NULL,
  `Too` varchar(12) DEFAULT NULL,
  `Datee` varchar(0) DEFAULT NULL,
  `RideStatus` varchar(5) DEFAULT NULL,
  `StartTime` varchar(0) DEFAULT NULL,
  `EndTime` varchar(0) DEFAULT NULL,
  `BillStatus` varchar(0) DEFAULT NULL,
  `Bill` varchar(0) DEFAULT NULL,
  `NoOfPassengers` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DriverBusRT`
--

LOCK TABLES `DriverBusRT` WRITE;
/*!40000 ALTER TABLE `DriverBusRT` DISABLE KEYS */;
INSERT INTO `DriverBusRT` VALUES (4,'alishba123','Alishba','MAH-891',8,'Huang',1,'','','Orangi Town','S.I.T.E Town','','Built','','','','',0);
/*!40000 ALTER TABLE `DriverBusRT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DriverBusT`
--

DROP TABLE IF EXISTS `DriverBusT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DriverBusT` (
  `DriverUsername` varchar(10) DEFAULT NULL,
  `DriverName` varchar(12) DEFAULT NULL,
  `VehicleType` varchar(3) DEFAULT NULL,
  `BusPlate` varchar(8) DEFAULT NULL,
  `BusID` tinyint(4) DEFAULT NULL,
  `BusName` varchar(12) DEFAULT NULL,
  `Fromm` varchar(12) DEFAULT NULL,
  `Too` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DriverBusT`
--

LOCK TABLES `DriverBusT` WRITE;
/*!40000 ALTER TABLE `DriverBusT` DISABLE KEYS */;
INSERT INTO `DriverBusT` VALUES ('khan1','Ali Khan','Bus','PAU-1821',6,'Youngton','Gadap Town','Quaidabad'),('akram12','Akram Ali','Bus','BNI-912',7,'Buanzo','Landhi Town','Gulberg Town'),('alishba123','Alishba','Bus','MAH-891',8,'Huang','Orangi Town','S.I.T.E Town'),('jav123','Javeria','Bus','IZF-912',9,'Muang','Jamshed Town','Gulberg Town'),('moiz121','Moiz Yousuf ','Bus','RJA-912',10,'Baloch Times','Korangi Town','Orangi Town');
/*!40000 ALTER TABLE `DriverBusT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DriverCarRT`
--

DROP TABLE IF EXISTS `DriverCarRT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DriverCarRT` (
  `ID` tinyint(4) DEFAULT NULL,
  `Username` varchar(9) DEFAULT NULL,
  `DriverName` varchar(12) DEFAULT NULL,
  `CarPlate` varchar(9) DEFAULT NULL,
  `CarId` tinyint(4) DEFAULT NULL,
  `CarName` varchar(21) DEFAULT NULL,
  `DriverAvail` tinyint(4) DEFAULT NULL,
  `PUsername` varchar(8) DEFAULT NULL,
  `PName` varchar(9) DEFAULT NULL,
  `Fromm` varchar(17) DEFAULT NULL,
  `Too` varchar(19) DEFAULT NULL,
  `Datee` varchar(10) DEFAULT NULL,
  `RideStatus` varchar(9) DEFAULT NULL,
  `StartTime` varchar(5) DEFAULT NULL,
  `EndTime` varchar(5) DEFAULT NULL,
  `BillStatus` varchar(4) DEFAULT NULL,
  `Bill` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DriverCarRT`
--

LOCK TABLES `DriverCarRT` WRITE;
/*!40000 ALTER TABLE `DriverCarRT` DISABLE KEYS */;
INSERT INTO `DriverCarRT` VALUES (19,'zia12','Zia','YZ-0121',17,'Civic Honda',0,'fahad1','Fahad','Ashraf Colony','Bahria University','22/05/2018','Completed','11:40','11:41','Paid',100),(20,'123','123','JAN-1281',22,'Cultus',0,'abcd','abcdef','Dhoraji','Clifton','13/04/2021','AtPickUp','13:45','13:46','Paid',120),(21,'qaiser123','Qaiser Abbas','YHK-981',23,'Shahzore',0,'ikram123','Ikram Ali','4 Minaar','Clifton','16/06/2018','Completed','11:04','11:05','Paid',100),(22,'parvez34','Parvez Khan','UJNZ-123',24,'Swift',0,'ikram123','Ikram Ali','Clifton','Dhoraji','27/01/2019','Completed','14:39','14:44','Paid',120),(23,'uzair123','Uzair','XHT-94320',25,'Toyota Corolla Grande',0,'abcd','abcdef','Quaid-e-Azam Tomb','Sir Syed University','27/01/2019','Completed','15:06','15:07','Paid',120);
/*!40000 ALTER TABLE `DriverCarRT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DriverCarT`
--

DROP TABLE IF EXISTS `DriverCarT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DriverCarT` (
  `DriverUsername` varchar(9) DEFAULT NULL,
  `DriverName` varchar(14) DEFAULT NULL,
  `VehicleType` varchar(3) DEFAULT NULL,
  `CarPlate` varchar(9) DEFAULT NULL,
  `CarID` tinyint(4) DEFAULT NULL,
  `CarName` varchar(21) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DriverCarT`
--

LOCK TABLES `DriverCarT` WRITE;
/*!40000 ALTER TABLE `DriverCarT` DISABLE KEYS */;
INSERT INTO `DriverCarT` VALUES ('zia12','Zia','Car','YZ-0121',17,'Civic Honda'),('mushtaq11','Mushtaq Ali','Car','IJK-2004',18,'Mira'),('ikram1','Ikram Nisar','Car','IKA-1212',19,'Suzuki Swift'),('mujahid01','Mujahid Khaqan','Car','PA',20,'Shahzore'),('humza1','Humza Ali','Car','PAK',21,'Honda City'),('123','123','Car','JAN-1281',22,'Cultus'),('qaiser123','Qaiser Abbas','Car','YHK-981',23,'Shahzore'),('parvez34','Parvez Khan','Car','UJNZ-123',24,'Swift'),('uzair123','Uzair','Car','XHT-94320',25,'Toyota Corolla Grande');
/*!40000 ALTER TABLE `DriverCarT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DriverRickshawRT`
--

DROP TABLE IF EXISTS `DriverRickshawRT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DriverRickshawRT` (
  `ID` tinyint(4) DEFAULT NULL,
  `Username` varchar(8) DEFAULT NULL,
  `DriverName` varchar(9) DEFAULT NULL,
  `RickshawPlate` varchar(8) DEFAULT NULL,
  `RickshawId` tinyint(4) DEFAULT NULL,
  `RickshawName` varchar(6) DEFAULT NULL,
  `DriverAvail` tinyint(4) DEFAULT NULL,
  `PUsername` varchar(4) DEFAULT NULL,
  `PName` varchar(5) DEFAULT NULL,
  `Fromm` varchar(7) DEFAULT NULL,
  `Too` varchar(7) DEFAULT NULL,
  `Datee` varchar(10) DEFAULT NULL,
  `RideStatus` varchar(9) DEFAULT NULL,
  `StartTime` varchar(5) DEFAULT NULL,
  `EndTime` varchar(5) DEFAULT NULL,
  `BillStatus` varchar(4) DEFAULT NULL,
  `Bill` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DriverRickshawRT`
--

LOCK TABLES `DriverRickshawRT` WRITE;
/*!40000 ALTER TABLE `DriverRickshawRT` DISABLE KEYS */;
INSERT INTO `DriverRickshawRT` VALUES (10,'bahar121','Raj Bahar','MNH-1281',15,'Rozgar',0,'abcd','abcde','Clifton','Clifton','17/09/2018','Completed','20:47','20:48','Paid',105);
/*!40000 ALTER TABLE `DriverRickshawRT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DriverRickshawT`
--

DROP TABLE IF EXISTS `DriverRickshawT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DriverRickshawT` (
  `DriverUsername` varchar(8) DEFAULT NULL,
  `DriverName` varchar(9) DEFAULT NULL,
  `VehicleType` varchar(8) DEFAULT NULL,
  `RickshawPlate` varchar(8) DEFAULT NULL,
  `RickshawID` tinyint(4) DEFAULT NULL,
  `RickshawName` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DriverRickshawT`
--

LOCK TABLES `DriverRickshawT` WRITE;
/*!40000 ALTER TABLE `DriverRickshawT` DISABLE KEYS */;
INSERT INTO `DriverRickshawT` VALUES ('ali121','Ali Ahmed','Rickshaw','HYA-1212',10,'Rozgar'),('hadi','Hadi','Rickshaw','PAN-124',12,'Rozgar'),('bahar121','Raj Bahar','Rickshaw','MNH-1281',15,'Rozgar'),('ali1','Ali','Rickshaw','UJN-128',16,'Sazgar');
/*!40000 ALTER TABLE `DriverRickshawT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PassengerBusRides`
--

DROP TABLE IF EXISTS `PassengerBusRides`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PassengerBusRides` (
  `iD` tinyint(4) DEFAULT NULL,
  `Username` varchar(11) DEFAULT NULL,
  `DriverName` varchar(7) DEFAULT NULL,
  `VehiclePlate` varchar(7) DEFAULT NULL,
  `VehicleId` tinyint(4) DEFAULT NULL,
  `VehicleName` varchar(5) DEFAULT NULL,
  `PUsername` varchar(8) DEFAULT NULL,
  `PName` varchar(14) DEFAULT NULL,
  `Fromm` varchar(11) DEFAULT NULL,
  `Too` varchar(12) DEFAULT NULL,
  `Datee` varchar(0) DEFAULT NULL,
  `RideStatus` varchar(5) DEFAULT NULL,
  `StartTime` varchar(0) DEFAULT NULL,
  `EndTime` varchar(0) DEFAULT NULL,
  `BillStatus` varchar(0) DEFAULT NULL,
  `Bill` varchar(0) DEFAULT NULL,
  `DriverContactNo` varchar(0) DEFAULT NULL,
  `PassengerContactNo` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PassengerBusRides`
--

LOCK TABLES `PassengerBusRides` WRITE;
/*!40000 ALTER TABLE `PassengerBusRides` DISABLE KEYS */;
INSERT INTO `PassengerBusRides` VALUES (4,' alishba123','Alishba','MAH-891',8,'Huang','humza990','Humza Siddique','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(5,' alishba123','Alishba','MAH-891',8,'Huang','yusuf1','Yusuf','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(6,' alishba123','Alishba','MAH-891',8,'Huang','fahad1','Fahad','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(7,' alishba123','Alishba','MAH-891',8,'Huang','humza990','Humza Siddique','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(8,' alishba123','Alishba','MAH-891',8,'Huang','ali1','Ali Ahmed','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(9,' alishba123','Alishba','MAH-891',8,'Huang','abcd','abcde','Orangi Town','S.I.T.E Town','','Built','','','','','',''),(10,' alishba123','Alishba','MAH-891',8,'Huang','abcd','abcde','Orangi Town','S.I.T.E Town','','Built','','','','','','');
/*!40000 ALTER TABLE `PassengerBusRides` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PassengerT`
--

DROP TABLE IF EXISTS `PassengerT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PassengerT` (
  `ID` tinyint(4) DEFAULT NULL,
  `PID` varchar(8) DEFAULT NULL,
  `PPass` varchar(5) DEFAULT NULL,
  `PName` varchar(14) DEFAULT NULL,
  `PFName` varchar(14) DEFAULT NULL,
  `PAge` tinyint(4) DEFAULT NULL,
  `PGender` varchar(4) DEFAULT NULL,
  `PSec` varchar(9) DEFAULT NULL,
  `CNIC` varchar(15) DEFAULT NULL,
  `ContactNo` varchar(12) DEFAULT NULL,
  `DOB` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PassengerT`
--

LOCK TABLES `PassengerT` WRITE;
/*!40000 ALTER TABLE `PassengerT` DISABLE KEYS */;
INSERT INTO `PassengerT` VALUES (15,'fahad1','1234','Fahad','Ashfaq',19,'Male','Kashif','42501-128912-8','0342-8490123','06-May-1999'),(16,'humza990','1234','Humza Siddique','Siddique Akbar',17,'Male','Infaq Ali','42501-12501-12','0345-812741','06-May-2018'),(17,'yusuf1','1234','Yusuf','Zia',26,'Male','Kamal','42501-112812-12','0343-8037980','02-May-1987'),(18,'ali1','12345','Ali Ahmed','Ahmed Razzaq',20,'Male','Mujahid','42501-812129-9','0343801821','08-May-1999'),(19,'ikram123','1234','Ikram Ali','Ali',10,'Male','Mehdi','411414','0131313','02-Jun-2018'),(20,'ali9901','99012','Ali Abdullah','Abdullah',19,'Male','Mujahid','42501-1213112-9','0343-9120193','Mar 19, 1999'),(21,'abcd','y','abcdef','abc',20,'Male','ab','12','1','Apr 13, 2021');
/*!40000 ALTER TABLE `PassengerT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RickshawT`
--

DROP TABLE IF EXISTS `RickshawT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RickshawT` (
  `RickshawId` tinyint(4) DEFAULT NULL,
  `Model` varchar(5) DEFAULT NULL,
  `Version` varchar(5) DEFAULT NULL,
  `Color` varchar(6) DEFAULT NULL,
  `PlateNo` varchar(9) DEFAULT NULL,
  `RegistrationDate` varchar(11) DEFAULT NULL,
  `ExpirationDate` varchar(11) DEFAULT NULL,
  `RickshawName` varchar(6) DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RickshawT`
--

LOCK TABLES `RickshawT` WRITE;
/*!40000 ALTER TABLE `RickshawT` DISABLE KEYS */;
INSERT INTO `RickshawT` VALUES (10,' 2010','v 1.1','Yellow','HYA-1212','02-May-2011','04-Sep-2029','Rozgar',1),(11,' 2011','v 8.1','Black','KJM-129','02-May-2012','04-Sep-2029','Rozgar',0),(12,' 2011','v 9.1','Red','PAN-124','02-May-2012','04-Sep-2029','Rozgar',1),(13,' 2010','v 5.1','Yellow','MJ-901','29-Sep-2012','14-Jul-2021','Sazgar',0),(14,' 2009','v 5.5','White','INA-1921','29-Sep-2012','09-Jul-2021','Rozgar',0),(15,' 2011','v 1.8','Yellow','MNH-1281','29-Sep-2012','23-Jul-2021','Rozgar',1),(16,' 2017','v 1.7','White','UJN-128','05-May-2012','27-May-2018','Sazgar',1),(17,' 2019','v 1.0','Black','NJK-12812','01-May-2011','31-May-2018','Sazgar',0),(18,'2012','v 1.1','White','MAN-129','01-Aug-2018','01-Aug-2028','Sazgar',0);
/*!40000 ALTER TABLE `RickshawT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RideRealtime`
--

DROP TABLE IF EXISTS `RideRealtime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RideRealtime` (
  `iD` tinyint(4) DEFAULT NULL,
  `Username` varchar(10) DEFAULT NULL,
  `DriverName` varchar(12) DEFAULT NULL,
  `VehiclePlate` varchar(9) DEFAULT NULL,
  `VehicleId` tinyint(4) DEFAULT NULL,
  `VehicleName` varchar(21) DEFAULT NULL,
  `PUsername` varchar(8) DEFAULT NULL,
  `PName` varchar(9) DEFAULT NULL,
  `Fromm` varchar(17) DEFAULT NULL,
  `Too` varchar(19) DEFAULT NULL,
  `Datee` varchar(10) DEFAULT NULL,
  `RideStatus` varchar(9) DEFAULT NULL,
  `StartTime` varchar(5) DEFAULT NULL,
  `EndTime` varchar(5) DEFAULT NULL,
  `BillStatus` varchar(6) DEFAULT NULL,
  `Bill` smallint(6) DEFAULT NULL,
  `DriverContactNo` varchar(12) DEFAULT NULL,
  `PassengerContactNo` varchar(12) DEFAULT NULL,
  `NoOfPassengers` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RideRealtime`
--

LOCK TABLES `RideRealtime` WRITE;
/*!40000 ALTER TABLE `RideRealtime` DISABLE KEYS */;
INSERT INTO `RideRealtime` VALUES (19,'zia12','Zia','YZ-0121',17,'Civic Honda','fahad1','Fahad','Ashraf Colony','Bahria University','22/05/2018','Completed','11:40','11:41','Paid',100,'03348129129','0342-8490123',1),(4,'alishba123','Alishba','MAH-891',8,'Huang','','','Orangi Town','S.I.T.E Town','22/05/2018','Running','14:38','14:38','Unpaid',50,'03455555432','',8),(20,'123','123','JAN-1281',22,'Cultus','abcd','abcdef','Dhoraji','Clifton','13/04/2021','AtPickUp','13:45','13:46','Paid',120,'0343-9128121','1',1),(21,'qaiser123','Qaiser Abbas','YHK-981',23,'Shahzore','ikram123','Ikram Ali','4 Minaar','Clifton','16/06/2018','Completed','11:04','11:05','Paid',100,'03434801218','0131313',1),(10,'bahar121','Raj Bahar','MNH-1281',15,'Rozgar','abcd','abcde','Clifton','Clifton','17/09/2018','Completed','20:47','20:48','Paid',105,'03334545677','1',1),(22,'parvez34','Parvez Khan','UJNZ-123',24,'Swift','ikram123','Ikram Ali','Clifton','Dhoraji','27/01/2019','Completed','14:39','14:44','Paid',120,'0343-8080543','0131313',1),(23,'uzair123','Uzair','XHT-94320',25,'Toyota Corolla Grande','abcd','abcdef','Quaid-e-Azam Tomb','Sir Syed University','27/01/2019','Completed','15:06','15:07','Paid',120,'0343-8037123','1',1);
/*!40000 ALTER TABLE `RideRealtime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `~TMPCLP337151`
--

DROP TABLE IF EXISTS `~TMPCLP337151`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `~TMPCLP337151` (
  `CarId` tinyint(4) DEFAULT NULL,
  `Model` varchar(5) DEFAULT NULL,
  `Version` varchar(7) DEFAULT NULL,
  `Color` varchar(3) DEFAULT NULL,
  `PlateNo` varchar(7) DEFAULT NULL,
  `RegistrationDate` varchar(10) DEFAULT NULL,
  `ExpirationDate` varchar(10) DEFAULT NULL,
  `CarName` varchar(12) DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `~TMPCLP337151`
--

LOCK TABLES `~TMPCLP337151` WRITE;
/*!40000 ALTER TABLE `~TMPCLP337151` DISABLE KEYS */;
INSERT INTO `~TMPCLP337151` VALUES (5,'a','a','','','','','',0),(1,' 2010','DLX 1.3','Red','RIP-112','24-02-2015','24-02-2020','Suzuki Swift',0);
/*!40000 ALTER TABLE `~TMPCLP337151` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `~TMPCLP611911`
--

DROP TABLE IF EXISTS `~TMPCLP611911`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `~TMPCLP611911` (
  `RickshawId` tinyint(4) DEFAULT NULL,
  `Model` varchar(1) DEFAULT NULL,
  `Version` varchar(2) DEFAULT NULL,
  `Color` varchar(1) DEFAULT NULL,
  `PlateNo` varchar(1) DEFAULT NULL,
  `RegistrationDate` varchar(1) DEFAULT NULL,
  `ExpirationDate` varchar(1) DEFAULT NULL,
  `RickshawName` varchar(1) DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `~TMPCLP611911`
--

LOCK TABLES `~TMPCLP611911` WRITE;
/*!40000 ALTER TABLE `~TMPCLP611911` DISABLE KEYS */;
INSERT INTO `~TMPCLP611911` VALUES (6,'a','aa','a','a','a','a','a',0);
/*!40000 ALTER TABLE `~TMPCLP611911` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-22 15:20:30
