--
-- Create database `springjdbcrowmapper`
--

CREATE DATABASE springjdbcrowmapper;

--
-- Table structure for table `employee_tbl`
--

CREATE TABLE `employee_tbl` (
  `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_FULLNAME` varchar(100) NOT NULL,
  `EMPLOYEE_DESIGNATION` varchar(100) NOT NULL,
  `EMPLOYEE_SALARY` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_tbl`
--

INSERT INTO `employee_tbl` (`EMPLOYEE_ID`, `EMPLOYEE_FULLNAME`, `EMPLOYEE_DESIGNATION`, `EMPLOYEE_SALARY`) VALUES
(1, 'Daniel Atlas', 'Technical Lead', '1300000.00'),
(2, 'Charlotte Neil', 'Technical Lead', '1100000.00'),
(3, 'Rakesh Mohan', 'Software Developer', '550000.00'),
(4, 'Jane Dow', 'Senior Software Developer', '970000.00'),
(5, 'Smith Greg', 'UI Developer', '1000000.00');

--
-- Selecting data from table `employee_tbl`
--

SELECT * FROM `employee_tbl`;