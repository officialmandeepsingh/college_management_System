-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 20, 2018 at 08:29 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cms`
--

-- --------------------------------------------------------

--
-- Table structure for table `addstu`
--

CREATE TABLE `addstu` (
  `s_name` varchar(30) DEFAULT NULL,
  `f_name` varchar(30) DEFAULT NULL,
  `m_name` varchar(30) DEFAULT NULL,
  `contact` varchar(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `ten_marks` varchar(5) DEFAULT NULL,
  `sec_marks` varchar(5) DEFAULT NULL,
  `course` varchar(10) DEFAULT NULL,
  `sem` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `Name` varchar(25) NOT NULL,
  `F_name` varchar(25) NOT NULL,
  `M_name` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `Contact` varchar(25) NOT NULL,
  `adm_id` varchar(25) NOT NULL,
  `status` varchar(5) DEFAULT 'no',
  `type` varchar(45) NOT NULL,
  `DOB` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`Name`, `F_name`, `M_name`, `password`, `Contact`, `adm_id`, `status`, `type`, `DOB`) VALUES
('Accountant', 'abc', 'xyz', '123456', '9876543210', 'account', 'no', 'Accountant', '1997-04-15'),
('Kareena', 'Ravinder Kumar Khosla', 'Aruna Khosla', '42224222', '7355395121', 'kareena', 'no', 'Admin', '1998-11-22'),
('Librarian', 'abc', 'xyz', '123456', '9876543210', 'library', 'no', 'Librarian', '1996-07-12'),
('Mandeep', 'Amrik Singh', 'Ravinder Kaur', '42274227', '7837938605', 'mandeep', 'no', 'admin', '1996-07-12'),
('abc', 'abc', 'xyz', '123456', '9988776655', 'teacher', 'no', 'Teacher', '1994-04-12');

-- --------------------------------------------------------

--
-- Table structure for table `bkissue`
--

CREATE TABLE `bkissue` (
  `Bk_name` varchar(20) NOT NULL,
  `Bookid` varchar(20) NOT NULL,
  `bk_author` varchar(30) NOT NULL,
  `date_issue` date NOT NULL,
  `roll_no` varchar(20) NOT NULL,
  `s_name` varchar(30) NOT NULL,
  `s_course` varchar(10) NOT NULL,
  `sem` varchar(5) NOT NULL,
  `valid_bk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bkissue`
--

INSERT INTO `bkissue` (`Bk_name`, `Bookid`, `bk_author`, `date_issue`, `roll_no`, `s_name`, `s_course`, `sem`, `valid_bk`) VALUES
('ABC', 'sa005', 'XYZ', '2018-04-05', '4196', 'Balwinder Singh', 'BCA', '6', '2018-04-19'),
('ABC', 'sa005', 'XYZ', '2018-04-05', '4208', 'Gurpreet Kaur', 'BCA', '6', '2018-04-19'),
('Operating System', 'sa002', 'Asseem khanna', '2018-03-26', '4218', 'Poonam', 'BCA', '6', '2018-03-26'),
('SOFTWARE ENGINEERING', '1001', 'RAJESH ARORA', '2018-04-16', '4227', 'MANDEEP SINGH', 'BCA', '6', '2018-04-30');

-- --------------------------------------------------------

--
-- Table structure for table `bkreturn`
--

CREATE TABLE `bkreturn` (
  `Rollno` varchar(15) NOT NULL DEFAULT '',
  `Book_name` varchar(45) DEFAULT NULL,
  `Book_id` varchar(45) DEFAULT NULL,
  `date_issue` date DEFAULT NULL,
  `valid_bk` date DEFAULT NULL,
  `s_name` varchar(45) DEFAULT NULL,
  `course` varchar(45) DEFAULT NULL,
  `sem` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bkreturn`
--

INSERT INTO `bkreturn` (`Rollno`, `Book_name`, `Book_id`, `date_issue`, `valid_bk`, `s_name`, `course`, `sem`) VALUES
('4151', 'NMST ', 'sa005', '2018-03-26', '2018-03-26', 'akshay', 'BCA', '6'),
('4202', 'c++ oops', 'sa004', '2018-03-26', '2018-03-26', 'Tarunpreet', 'bca', '6'),
('4222', 'NMST ', 'sa005', '2018-03-24', '2018-03-24', 'kareena', 'bca', '6'),
('4227', 'computer network', 'sa001', '2018-03-17', '2018-03-17', 'm', 'b', 'b'),
('4227', 'computer network', 'sa001', '2018-03-26', '2018-03-26', 'Mandeep Singh', 'BCA', '6'),
('4227', 'NMST ', 'sa005', '2018-03-27', '2018-03-27', 'Mandeep Singh', 'BCA', '6'),
('4191', 'computer network', 'sa001', '2018-03-26', '2018-03-26', 'akhil', 'BCA', '6'),
('4222', 'Operating System', 'sa002', '2018-03-26', '2018-03-26', 'Kareena Khosla', 'BCA', '6'),
('4218', 'Operating System', 'sa002', '2018-03-26', '2018-03-26', 'Poonam', 'BCA', '6'),
('4227', 'c++ oops', 'sa004', '2018-03-28', '2018-03-28', 'Mandeep Singh', 'BCA', '6'),
('4227', 'c++ oops', 'sa004', '2018-03-28', '2018-03-28', 'Mandeep Singh', 'BCA', '6'),
('4227', 'OPERATING SYSTEM', 'SA002', '2018-04-17', '2018-05-01', 'MANDEEP SINGH', 'BCA', '6');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `Book_Id` varchar(20) NOT NULL,
  `Book_Name` varchar(50) NOT NULL,
  `Book_Author` varchar(50) NOT NULL,
  `Book_Publisher` varchar(50) NOT NULL,
  `Book_Edition` varchar(10) NOT NULL,
  `Book_quantity` varchar(10) NOT NULL,
  `Book_avail` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`Book_Id`, `Book_Name`, `Book_Author`, `Book_Publisher`, `Book_Edition`, `Book_quantity`, `Book_avail`) VALUES
('1001', 'SOFTWARE ENGINEERING', 'RAJESH ARORA', 'SHREE', 'SIXETH', '45', '5'),
('sa001', 'computer network', 'Asseem khanna', 'shree', '2017', '10', '10'),
('sa002', 'Operating System', 'Asseem khanna', 'shree', '2017', '10', '10'),
('sa004', 'c++ oops', 'Asseem khanna', 'shree', '2016', '10', '10'),
('sa005', 'ABC', 'XYZ', 'SHREE', '2016', '10', '1');

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `course` varchar(10) NOT NULL,
  `sem` varchar(5) NOT NULL,
  `fee` float(7,2) NOT NULL,
  `fund` float(7,2) NOT NULL,
  `exam_fee` float(7,2) NOT NULL,
  `adm_fee` float(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`course`, `sem`, `fee`, `fund`, `exam_fee`, `adm_fee`) VALUES
('BCA', '6', 5500.00, 1200.00, 1200.00, 0.00),
('BCA', '5', 9460.00, 1000.00, 1200.00, 0.00),
('BCA', '4', 9500.00, 1000.00, 1200.00, 0.00),
('BCA', '3', 13050.00, 1000.00, 1200.00, 0.00),
('BCA', '2', 200.00, 1000.00, 1200.00, 0.00),
('BCA', '1', 13850.00, 1000.00, 1200.00, 0.00),
('B.COM', '1', 12000.00, 1000.00, 0.00, 100.00),
('BCA', '5', 9460.00, 1000.00, 1200.00, 0.00),
('MCA', '3', 49000.00, 1500.00, 0.00, 2500.00);

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `roll_no` varchar(15) NOT NULL,
  `s_name` varchar(45) NOT NULL,
  `subcode` varchar(45) NOT NULL,
  `subname` varchar(45) NOT NULL,
  `ttl_m` float NOT NULL,
  `min_m` float NOT NULL,
  `obt_m` float NOT NULL,
  `course` varchar(45) NOT NULL,
  `sem` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`roll_no`, `s_name`, `subcode`, `subname`, `ttl_m`, `min_m`, `obt_m`, `course`, `sem`) VALUES
('4227', 'mandeep singh', 'Paper-1', 'Computer Graphics', 75, 26, 52, '', ''),
('4222', 'Kareena Khosla', 'Paper-2', 'Software Engg.', 75, 26, 42, 'BCA', '6'),
('4191', 'akhil', 'Paper-1', 'Computer Graphics', 75, 26, 44, 'BCA', '6'),
('4191', 'akhil', 'Paper-2', 'Software Engg.', 75, 26, 40, 'BCA', '6'),
('4191', 'akhil', 'Paper-3', 'Lab Comp. Graphics', 50, 17, 40, 'BCA', '6'),
('4218', 'Poonam', 'Paper-1', 'Computer Graphics', 75, 26, 33, 'BCA', '6'),
('4218', 'Poonam', 'Paper-2', 'Software Engg.', 75, 26, 43, 'BCA', '6'),
('4218', 'Poonam', 'Paper-3', 'Lab Comp. Graphics', 50, 13, 43, 'BCA', '6'),
('4202', 'tarun', 'Paper-2', 'Software Engg.', 75, 26, 52, 'BCA', '6'),
('4191', 'akhil', '7001', 'PROJECT', 200, 150, 180, 'BCA', '6'),
('4157', 'sapna', 'PAPER-1', 'COMPUTER GRAPHICS', 75, 26, 52, 'BCA', '6'),
('4157', 'sapna', 'PAPER-2', 'SOFTWARE ENGG.', 75, 26, 52, 'BCA', '6'),
('4157', 'sapna', 'PAPER-3', 'LAB COMP. GRAPHICS', 50, 16, 45, 'BCA', '6');

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `Roll_no` varchar(15) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `course` varchar(10) NOT NULL,
  `sem` varchar(3) NOT NULL,
  `fee` float(10,2) NOT NULL,
  `late_fee` float(10,2) NOT NULL,
  `adm_fee` float(10,2) NOT NULL,
  `exam_fee` float(10,2) NOT NULL,
  `total_fee` float(10,2) NOT NULL,
  `date` varchar(25) DEFAULT NULL,
  `serial_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payments`
--

INSERT INTO `payments` (`Roll_no`, `Name`, `course`, `sem`, `fee`, `late_fee`, `adm_fee`, `exam_fee`, `total_fee`, `date`, `serial_id`) VALUES
('4222', 'Kareena Khosla', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 1),
('4191', 'akhil', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 2),
('4191', 'akhil', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 3),
('4222', 'Kareena Khosla', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 4),
('4227', 'Mandeep Singh', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 5),
('4191', 'akhil', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 6),
('4227', 'Mandeep Singh', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, NULL, 7),
('4191', 'akhil', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, '2018-04-17', 8),
('4222', 'Kareena Khosla', 'BCA', '6', 5500.00, 0.00, 0.00, 1200.00, 6700.00, '2018-04-18', 9);

-- --------------------------------------------------------

--
-- Table structure for table `projadm`
--

CREATE TABLE `projadm` (
  `userid` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `projadm`
--

INSERT INTO `projadm` (`userid`, `password`) VALUES
('kareena', '4222'),
('mandeep', '4227');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `Stu_name` varchar(25) NOT NULL,
  `password` varchar(20) NOT NULL,
  `F_name` varchar(25) NOT NULL,
  `M_name` varchar(25) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `course` varchar(10) NOT NULL,
  `semm` varchar(10) NOT NULL,
  `roll_no` varchar(15) NOT NULL DEFAULT '',
  `stu_id` varchar(25) NOT NULL,
  `login` varchar(5) DEFAULT 'No',
  `DOB` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Stu_name`, `password`, `F_name`, `M_name`, `contact`, `course`, `semm`, `roll_no`, `stu_id`, `login`, `DOB`) VALUES
('tarun', '1', 'abc', 'xyz', '2s', 'BCA', '6', '4202', 'ab', 'no', '0000-00-00'),
('akhil', '123', 'ASHWANI ANAND ', 'SEEMA ANAND ', '96535-24766 ', 'BCA', '6', '4191', 'akhil', 'no', '0000-00-00'),
('akshay', '123', 'SUBHASH ', 'SUNITA ', '81462-94836 ', 'BCA', '6', '4151', 'akshay', 'no', '0000-00-00'),
('Balwinder Singh', '123', 'KANWALJIT SINGH ', 'SURJIT KAUR ', '9814270363 ', 'BCA', '6', '4196', 'balwinder', 'no', '0000-00-00'),
('Gurpreet Kaur', '123', 'JASBIR SINGH ', 'BALBIR KAUR ', '8558053376 ', 'BCA', '6', '4208', 'gurpreet', 'no', '0000-00-00'),
('Kareena Khosla', '4222', 'Ravinder Kumar Khosla', 'Aruna Khosla', '9876543210', 'BCA', '6', '4222', 'kareena', 'no', '0000-00-00'),
('Mandeep Singh', '4227', 'Amrik Singh', 'Ravinder Kaur', '7837938605', 'BCA', '6', '4227', 'msp', 'no', '0000-00-00'),
('Poonam', '123', 'RAVI KUMAR ', 'SANEH LATA ', '8699658573 ', 'BCA', '6', '4218', 'poonam', 'no', '0000-00-00'),
('sapna', '123', 'ATMARAM YADAV', 'PUSHPA YADAV', '94642-74626 ', 'BCA', '6', '4157', 'sapna', 'no', '0000-00-00'),
('Tarunpreet Singh', '123', 'SHARANJIT SINGH ', 'INDERJIT KAUR ', '9041055305 ', 'BCA', '6', '4202', 'tarun', 'no', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `subcode` varchar(10) DEFAULT NULL,
  `subname` varchar(45) NOT NULL,
  `Course` varchar(45) NOT NULL,
  `Semester` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `max_mark` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`subcode`, `subname`, `Course`, `Semester`, `type`, `max_mark`) VALUES
('Paper-1', 'Computer Graphics', 'BCA', '6', 'Theory', 75),
('Paper-2', 'Software Engg.', 'BCA', '6', 'Theory', 75),
('Paper-3', 'Lab Comp. Graphics', 'BCA', '6', 'Practical', 50),
('7001', 'project', 'BCA', '6', 'Practical', 200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`adm_id`);

--
-- Indexes for table `bkissue`
--
ALTER TABLE `bkissue`
  ADD PRIMARY KEY (`roll_no`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`Book_Id`),
  ADD UNIQUE KEY `Book_Id` (`Book_Id`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`serial_id`);

--
-- Indexes for table `projadm`
--
ALTER TABLE `projadm`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`stu_id`,`roll_no`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `payments`
--
ALTER TABLE `payments`
  MODIFY `serial_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
