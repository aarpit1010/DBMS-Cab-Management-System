-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: remotemysql.com
-- Generation Time: May 11, 2021 at 10:14 AM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `JYjwEkSAKs`
--

-- --------------------------------------------------------

--
-- Table structure for table `AdminT`
--

CREATE TABLE `AdminT` (
  `AdminID` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `AdminP` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `AdminT`
--

INSERT INTO `AdminT` (`AdminID`, `AdminP`) VALUES
('1', 'y');

-- --------------------------------------------------------

--
-- Table structure for table `BanDriver`
--

CREATE TABLE `BanDriver` (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `CarId` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `FatherName` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SecurityQuestion` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Type` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `aadhar` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ContactNo` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `DOB` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `BanDriver`
--

INSERT INTO `BanDriver` (`ID`, `CarId`, `Password`, `Name`, `FatherName`, `Gender`, `SecurityQuestion`, `Type`, `aadhar`, `ContactNo`, `DOB`) VALUES
('testR', '1', 'y', 'tggg', 'hhh', 'Male', 'aaa', 'Rickshaw', '1315', '1361', 'May 13, 2021');

-- --------------------------------------------------------

--
-- Table structure for table `BusT`
--

CREATE TABLE `BusT` (
  `BusId` int(11) NOT NULL,
  `Model` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Version` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Color` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `PlateNo` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `RegistrationDate` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ExpirationDate` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BusName` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Fromm` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Too` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `BusT`
--

INSERT INTO `BusT` (`BusId`, `Model`, `Version`, `Color`, `PlateNo`, `RegistrationDate`, `ExpirationDate`, `BusName`, `Fromm`, `Too`, `Assigned`) VALUES
(1, ' Double Decker', 'v2.0', 'Green', 'UP3267', '02-May-2011', '31-May-2021', 'BUS2', 'Prayagraj', 'Agra', 1),
(2, ' AC', 'v4.2', 'Black', 'HR1234', '07-May-2011', '31-May-2021', 'VolVo', 'Ghaziabad', 'Meerut', 1);

-- --------------------------------------------------------

--
-- Table structure for table `CarT`
--

CREATE TABLE `CarT` (
  `CarId` int(11) NOT NULL,
  `Model` varchar(50) DEFAULT NULL,
  `Version` varchar(50) DEFAULT NULL,
  `Color` varchar(50) DEFAULT NULL,
  `PlateNo` varchar(20) DEFAULT NULL,
  `RegistrationDate` varchar(50) DEFAULT NULL,
  `ExpirationDate` varchar(50) DEFAULT NULL,
  `CarName` varchar(50) DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `CarT`
--

INSERT INTO `CarT` (`CarId`, `Model`, `Version`, `Color`, `PlateNo`, `RegistrationDate`, `ExpirationDate`, `CarName`, `Assigned`) VALUES
(1, ' Sedan', 'v1.1', 'Blue', 'UP1234', '02-May-2021', '01-May-2031', 'Honda Civic', 1),
(2, ' m1', 'v1', 'blue', 'up3456', '03-May-2021', '08-May-2029', 'CarNew', 1),
(18, ' 2019', 'v 1.8', 'Black', 'IJK-2004', '12-Jun-2020', '19-Oct-2029', 'Mira', 1),
(19, ' 2020', 'v 6.4', 'White', 'IKA-1212', '12-May-2021', '04-May-2029', 'Suzuki Swift', 1),
(20, ' 2020', 'v 5.1', 'Black', 'IN', '12-May-2021', '04-May-2029', 'Scross', 1),
(21, ' 2020', 'v 9.9', 'Red', 'IND', '12-May-2021', '04-May-2029', 'Honda City', 1),
(22, ' 2020', 'v 7.1', 'White', 'JAN-1281', '02-May-2021', '04-Oct-2029', 'Cultus', 1),
(23, ' 2012', 'v 1.8', 'White', 'YHK-981', '02-May-2012', '11-May-2019', 'Scross', 1),
(24, ' 2014', 'v 6.7', 'Black', 'UJNZ-123', '12-Jun-2018', '03-Jun-2034', 'Swift', 1),
(25, ' 2016', 'v 7.41', 'Violet', 'XHT-94320', 'Jan 21, 2016', 'Jan 22, 2025', 'Toyota Corolla Grande', 1),
(26, ' Hatchback', 'v1.2', 'Aqua', 'UP6561', '12-May-2011', '12-May-2021', 'Verna', 1);

-- --------------------------------------------------------

--
-- Table structure for table `Driver`
--

CREATE TABLE `Driver` (
  `ID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `FatherName` varchar(50) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `SecurityQuestion` varchar(50) DEFAULT NULL,
  `Type` varchar(8) DEFAULT NULL,
  `aadhar` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `ContactNo` varchar(20) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Driver`
--

INSERT INTO `Driver` (`ID`, `Password`, `Name`, `FatherName`, `Gender`, `SecurityQuestion`, `Type`, `aadhar`, `ContactNo`, `DOB`) VALUES
('123', '1234', 'Driver1', 'Driver1 Father', 'Male', 'first', 'Car', '42501-812912-92', '0343-9128121', '08-May-1999'),
('alex1', '123', 'Alex', 'Patrick', 'Male', 'alex', 'Bus', '43987-1232123-8', '03045566789', '06-May-1995'),
('bd2', '1', 'bd2', 'bd2d', 'Male', 'bd2b', 'Bus', '465', '454654652', '06-May-2000'),
('charlie1', '121', 'Charlie', 'Rohn', 'Male', 'charlie', 'Rickshaw', '33202-5677687-9', '03232344232', '04-May-2018'),
('d11', '1', 'd11', 'd11d', 'Male', 'd11b', 'Car', '54', '876543', '06-May-2000'),
('d139', '139', 'driver1', 'ddr', 'Male', 'ddr2', 'Car', '3311', '123456', '10-Oct-2001'),
('d2c', '1', 'd2', 'd2dad', 'Male', 'd2bro', 'Car', '453', '8976543432', '06-May-1998'),
('d7', 'y', 'd7', 'abc', 'Male', 'abc', 'Car', '1', '1', 'May 14, 2014'),
('emily1', '121', 'Emily ', 'Wilson', 'Female', 'emily', 'Bus', '23213-5654321-6', '03009898907', '08-May-1994'),
('jack1', '12345', 'Jack', 'Wilson', 'Male', 'jack', 'Bus', '23213-5665654-4', '03009877654', '02-May-1987'),
('john1', '1234', 'john', 'adam', 'Male', 'Han', 'Rickshaw', '43251-121812-1', '0343-1291281', '19-May-1998'),
('nic', '123', 'TaxiDriv', 'TaxiDad', 'Male', 'TaxiBro', 'Car', '463546', '7989898985', '06-May-2000'),
('peter1', '1234', 'Peter', 'Ben', 'Male', 'peter', 'Car', '42501-121221-91', '0343912912', '05-May-1990'),
('rdriver', '123', 'ricky', 'ricky_dad', 'Male', 'ricky_bro', 'Rickshaw', '23456', '876543245', '05-May-1987'),
('steve1', 'rogers', 'Steve', 'Bucky', 'Male', 'steve', 'Car', '42501-71291-1', '03434801218', '02-Jun-1998'),
('testB', 'y', 'Bus_test', 'xyz', 'Male', 'xyz', 'Bus', '1', '1', 'May 31, 2021'),
('tony1', '9900', 'Tony', 'Havard', 'Male', 'tony', 'Car', '42501-912415-9', '0343-8080543', 'Apr 19, 1999');

-- --------------------------------------------------------

--
-- Table structure for table `DriverBusRT`
--

CREATE TABLE `DriverBusRT` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `BusId` int(11) DEFAULT NULL,
  `DriverAvail` tinyint(4) DEFAULT NULL,
  `Fromm` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Too` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Datee` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RideStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `StartTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `EndTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `BillStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Bill` double DEFAULT NULL,
  `NoOfPassengers` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `DriverBusRT`
--

INSERT INTO `DriverBusRT` (`ID`, `Username`, `BusId`, `DriverAvail`, `Fromm`, `Too`, `Datee`, `RideStatus`, `StartTime`, `EndTime`, `BillStatus`, `Bill`, `NoOfPassengers`) VALUES
(1, 'testB', 2, NULL, 'Ghaziabad', 'Meerut', '10/05/2021', 'Completed', '18:33', '18:33', 'Paid', 626.88, 3),
(2, 'testB', 2, 0, 'Ghaziabad', 'Meerut', '10/05/2021', 'Running', '18:56', '18:53', 'Paid', 877.6320000000001, 3);

-- --------------------------------------------------------

--
-- Table structure for table `DriverBusT`
--

CREATE TABLE `DriverBusT` (
  `SNo` int(11) NOT NULL,
  `DriverUsername` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `BusID` int(11) DEFAULT NULL,
  `Fromm` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Too` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `DriverBusT`
--

INSERT INTO `DriverBusT` (`SNo`, `DriverUsername`, `BusID`, `Fromm`, `Too`) VALUES
(1, 'testB', 2, 'Ghaziabad', 'Meerut');

-- --------------------------------------------------------

--
-- Table structure for table `DriverCarRT`
--

CREATE TABLE `DriverCarRT` (
  `ID` tinyint(4) NOT NULL,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `CarId` int(11) DEFAULT NULL,
  `DriverAvail` tinyint(4) DEFAULT NULL,
  `PUsername` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Fromm` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Too` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Datee` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RideStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `StartTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `EndTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `BillStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Bill` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `DriverCarRT`
--

INSERT INTO `DriverCarRT` (`ID`, `Username`, `CarId`, `DriverAvail`, `PUsername`, `Fromm`, `Too`, `Datee`, `RideStatus`, `StartTime`, `EndTime`, `BillStatus`, `Bill`) VALUES
(1, 'nic', 26, 0, 'kane1', 'Gurugram, Haryana', 'Allahabad, Uttar Pradesh', '10/05/2021', 'Completed', '20:57', '20:58', 'Paid', 488.9664);

-- --------------------------------------------------------

--
-- Table structure for table `DriverCarT`
--

CREATE TABLE `DriverCarT` (
  `SNo` int(11) NOT NULL,
  `DriverUsername` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `CarID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `DriverCarT`
--

INSERT INTO `DriverCarT` (`SNo`, `DriverUsername`, `CarID`) VALUES
(1, '123', 18),
(2, 'd139', 25),
(3, 'peter1', 19),
(4, 'tony1', 20),
(5, 'steve1', 21),
(8, 'd11', 2),
(10, 'd7', 1),
(11, 'nic', 26);

-- --------------------------------------------------------

--
-- Table structure for table `DriverRickshawRT`
--

CREATE TABLE `DriverRickshawRT` (
  `ID` tinyint(4) NOT NULL,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RickshawId` int(11) DEFAULT NULL,
  `DriverAvail` tinyint(4) DEFAULT NULL,
  `PUsername` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Fromm` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Too` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Datee` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RideStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `StartTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `EndTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `BillStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Bill` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `DriverRickshawT`
--

CREATE TABLE `DriverRickshawT` (
  `SNo` int(11) NOT NULL,
  `DriverUsername` varchar(50) NOT NULL,
  `RickshawID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `DriverRickshawT`
--

INSERT INTO `DriverRickshawT` (`SNo`, `DriverUsername`, `RickshawID`) VALUES
(2, 'rdriver', 1);

-- --------------------------------------------------------

--
-- Table structure for table `fuel`
--

CREATE TABLE `fuel` (
  `id` int(11) NOT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `fuel`
--

INSERT INTO `fuel` (`id`, `price`) VALUES
(1, 50.5);

-- --------------------------------------------------------

--
-- Table structure for table `PassengerBusRides`
--

CREATE TABLE `PassengerBusRides` (
  `SNo` int(11) NOT NULL,
  `iD` int(11) NOT NULL,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `VehicleId` int(11) DEFAULT NULL,
  `PUsername` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `PassengerBusRides`
--

INSERT INTO `PassengerBusRides` (`SNo`, `iD`, `Username`, `VehicleId`, `PUsername`) VALUES
(1, 1, 'testB', 2, 'abcd'),
(2, 1, 'testB', 2, 'bruce1'),
(3, 2, 'testB', 2, 'bruce1'),
(4, 2, 'testB', 2, 'abcd');

-- --------------------------------------------------------

--
-- Table structure for table `PassengerT`
--

CREATE TABLE `PassengerT` (
  `PID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `PPass` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PFName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PGender` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PSec` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `aadhar` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `ContactNo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `DOB` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `PassengerT`
--

INSERT INTO `PassengerT` (`PID`, `PPass`, `PName`, `PFName`, `PGender`, `PSec`, `aadhar`, `ContactNo`, `DOB`) VALUES
('abcd', 'y', 'abcdef', 'abc', 'Male', 'ab', '12', '1', 'Apr 13, 2021'),
('bruce1', '1234', 'Bruce', 'Wayne', 'Male', 'bruce', '42501-128912-8', '0342-8490123', '06-May-1999'),
('james1', '1234', 'James', 'David', 'Male', 'james', '42501-112812-12', '0343-8037980', '02-May-1987'),
('kane1', '1234', 'Kane', 'Williamson', 'Male', 'kane', '411414', '0131313', '02-Jun-2018'),
('noah1', '99012', 'Noah', 'Lucas', 'Male', 'noah', '42501-1213112-9', '0343-9120193', 'Mar 19, 1999'),
('oliver1', '1234', 'Oliver', 'Antonio', 'Male', 'oliver', '42501-12501-12', '0345-812741', '06-May-2018'),
('p1', '1', 'Pass1', 'P1d', 'Male', 'P1b', '45457457', '7485748557', '12-May-2000'),
('sherlock1', '123', 'Sherlock', 'Walter', 'Male', 'sherlock', '42501-812129-9', '0343801821', '08-May-1999');

-- --------------------------------------------------------

--
-- Table structure for table `repairhistory`
--

CREATE TABLE `repairhistory` (
  `date` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `driver_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `carID` tinyint(4) DEFAULT NULL,
  `request` varchar(180) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `repairhistory`
--

INSERT INTO `repairhistory` (`date`, `driver_id`, `carID`, `request`) VALUES
('2021-04-28::12:47:08', '123', 22, 'abcdef'),
('2021-05-10::21:22:30', 'nic', 26, 'bumper broken.'),
('2021-05-10::21:23:03', 'nic', 26, 'headlights flickering'),
('2021-05-10::21:25:20', 'testB', 2, 'Vehicle seviced');

-- --------------------------------------------------------

--
-- Table structure for table `RickshawT`
--

CREATE TABLE `RickshawT` (
  `RickshawId` int(11) NOT NULL,
  `Model` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Version` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Color` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PlateNo` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RegistrationDate` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `ExpirationDate` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RickshawName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Assigned` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `RickshawT`
--

INSERT INTO `RickshawT` (`RickshawId`, `Model`, `Version`, `Color`, `PlateNo`, `RegistrationDate`, `ExpirationDate`, `RickshawName`, `Assigned`) VALUES
(1, ' RST-1', 'v 1.0', 'Blue', 'UP001', '02-May-2021', '09-May-2026', 'Rick-1', 0),
(2, ' small', 'v1.0', 'red', 'NA', '07-May-2021', '06-May-2031', 'Rick_red', 1);

-- --------------------------------------------------------

--
-- Table structure for table `RideRealtime`
--

CREATE TABLE `RideRealtime` (
  `iD` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `VehicleId` tinyint(4) DEFAULT NULL,
  `PUsername` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Fromm` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Too` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Datee` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `RideStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `StartTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `EndTime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `BillStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Bill` double DEFAULT NULL,
  `NoOfPassengers` tinyint(4) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `RideRealtime`
--

INSERT INTO `RideRealtime` (`iD`, `Username`, `VehicleId`, `PUsername`, `Fromm`, `Too`, `Datee`, `RideStatus`, `StartTime`, `EndTime`, `BillStatus`, `Bill`, `NoOfPassengers`) VALUES
('B1', 'testB', 2, NULL, 'Ghaziabad', 'Meerut', '10/05/2021', 'Completed', '18:33', '18:33', 'Paid', 626.88, 3),
('B2', 'testB', 2, NULL, 'Ghaziabad', 'Meerut', '10/05/2021', 'Running', '18:56', '18:53', 'Paid', 877.6320000000001, 3),
('C1', 'nic', 26, 'kane1', 'Gurugram, Haryana', 'Allahabad, Uttar Pradesh', '10/05/2021', 'Completed', '20:57', '20:58', 'Paid', 488.9664, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `AdminT`
--
ALTER TABLE `AdminT`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `BanDriver`
--
ALTER TABLE `BanDriver`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `BusT`
--
ALTER TABLE `BusT`
  ADD PRIMARY KEY (`BusId`);

--
-- Indexes for table `CarT`
--
ALTER TABLE `CarT`
  ADD PRIMARY KEY (`CarId`),
  ADD UNIQUE KEY `CarId` (`CarId`);

--
-- Indexes for table `Driver`
--
ALTER TABLE `Driver`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID_UNIQUE` (`ID`);

--
-- Indexes for table `DriverBusRT`
--
ALTER TABLE `DriverBusRT`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `DUsername` (`Username`),
  ADD KEY `BuS_RT` (`BusId`);

--
-- Indexes for table `DriverBusT`
--
ALTER TABLE `DriverBusT`
  ADD PRIMARY KEY (`SNo`),
  ADD KEY `Bus_id` (`BusID`),
  ADD KEY `BDriver_username` (`DriverUsername`);

--
-- Indexes for table `DriverCarRT`
--
ALTER TABLE `DriverCarRT`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `CarId` (`CarId`),
  ADD KEY `Driver_usernameCarRT` (`Username`),
  ADD KEY `passenger` (`PUsername`);

--
-- Indexes for table `DriverCarT`
--
ALTER TABLE `DriverCarT`
  ADD PRIMARY KEY (`SNo`),
  ADD UNIQUE KEY `DriverUsername` (`DriverUsername`),
  ADD KEY `Car_id` (`CarID`);

--
-- Indexes for table `DriverRickshawRT`
--
ALTER TABLE `DriverRickshawRT`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Rickshaw_idRT` (`RickshawId`),
  ADD KEY `Driver_usernameRRT` (`Username`),
  ADD KEY `passenger_RRT` (`PUsername`);

--
-- Indexes for table `DriverRickshawT`
--
ALTER TABLE `DriverRickshawT`
  ADD PRIMARY KEY (`SNo`),
  ADD KEY `RDriver_username` (`DriverUsername`),
  ADD KEY `Rickshaw_id` (`RickshawID`);

--
-- Indexes for table `fuel`
--
ALTER TABLE `fuel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `PassengerBusRides`
--
ALTER TABLE `PassengerBusRides`
  ADD PRIMARY KEY (`SNo`),
  ADD KEY `D_Username` (`Username`),
  ADD KEY `p_username` (`PUsername`),
  ADD KEY `v_ID` (`VehicleId`),
  ADD KEY `ride_id` (`iD`);

--
-- Indexes for table `PassengerT`
--
ALTER TABLE `PassengerT`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `repairhistory`
--
ALTER TABLE `repairhistory`
  ADD UNIQUE KEY `date` (`date`),
  ADD KEY `Driver_id` (`driver_id`);

--
-- Indexes for table `RickshawT`
--
ALTER TABLE `RickshawT`
  ADD PRIMARY KEY (`RickshawId`);

--
-- Indexes for table `RideRealtime`
--
ALTER TABLE `RideRealtime`
  ADD PRIMARY KEY (`iD`),
  ADD KEY `Driver_user` (`Username`),
  ADD KEY `puser` (`PUsername`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `BusT`
--
ALTER TABLE `BusT`
  MODIFY `BusId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `CarT`
--
ALTER TABLE `CarT`
  MODIFY `CarId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `DriverBusRT`
--
ALTER TABLE `DriverBusRT`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `DriverBusT`
--
ALTER TABLE `DriverBusT`
  MODIFY `SNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `DriverCarRT`
--
ALTER TABLE `DriverCarRT`
  MODIFY `ID` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `DriverCarT`
--
ALTER TABLE `DriverCarT`
  MODIFY `SNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `DriverRickshawRT`
--
ALTER TABLE `DriverRickshawRT`
  MODIFY `ID` tinyint(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `DriverRickshawT`
--
ALTER TABLE `DriverRickshawT`
  MODIFY `SNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `PassengerBusRides`
--
ALTER TABLE `PassengerBusRides`
  MODIFY `SNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `RickshawT`
--
ALTER TABLE `RickshawT`
  MODIFY `RickshawId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `DriverBusRT`
--
ALTER TABLE `DriverBusRT`
  ADD CONSTRAINT `BuS_RT` FOREIGN KEY (`BusId`) REFERENCES `BusT` (`busid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `DUsername` FOREIGN KEY (`Username`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `DriverBusT`
--
ALTER TABLE `DriverBusT`
  ADD CONSTRAINT `BDriver_username` FOREIGN KEY (`DriverUsername`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Bus_id` FOREIGN KEY (`BusID`) REFERENCES `BusT` (`busid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `DriverCarRT`
--
ALTER TABLE `DriverCarRT`
  ADD CONSTRAINT `CarId` FOREIGN KEY (`CarId`) REFERENCES `CarT` (`carid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Driver_usernameCarRT` FOREIGN KEY (`Username`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `passenger` FOREIGN KEY (`PUsername`) REFERENCES `PassengerT` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `DriverCarT`
--
ALTER TABLE `DriverCarT`
  ADD CONSTRAINT `Car_id` FOREIGN KEY (`CarID`) REFERENCES `CarT` (`carid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Driver_username` FOREIGN KEY (`DriverUsername`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `DriverRickshawRT`
--
ALTER TABLE `DriverRickshawRT`
  ADD CONSTRAINT `Driver_usernameRRT` FOREIGN KEY (`Username`) REFERENCES `Driver` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `Rickshaw_idRT` FOREIGN KEY (`RickshawId`) REFERENCES `RickshawT` (`rickshawid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `passenger_RRT` FOREIGN KEY (`PUsername`) REFERENCES `PassengerT` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `DriverRickshawT`
--
ALTER TABLE `DriverRickshawT`
  ADD CONSTRAINT `RDriver_username` FOREIGN KEY (`DriverUsername`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Rickshaw_id` FOREIGN KEY (`RickshawID`) REFERENCES `RickshawT` (`rickshawid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `PassengerBusRides`
--
ALTER TABLE `PassengerBusRides`
  ADD CONSTRAINT `D_Username` FOREIGN KEY (`Username`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `p_username` FOREIGN KEY (`PUsername`) REFERENCES `PassengerT` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ride_id` FOREIGN KEY (`iD`) REFERENCES `DriverBusRT` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `v_ID` FOREIGN KEY (`VehicleId`) REFERENCES `BusT` (`busid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `repairhistory`
--
ALTER TABLE `repairhistory`
  ADD CONSTRAINT `Driver_id` FOREIGN KEY (`driver_id`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `RideRealtime`
--
ALTER TABLE `RideRealtime`
  ADD CONSTRAINT `Driver_user` FOREIGN KEY (`Username`) REFERENCES `Driver` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `puser` FOREIGN KEY (`PUsername`) REFERENCES `PassengerT` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
