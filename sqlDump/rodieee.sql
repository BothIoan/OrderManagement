-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2020 at 11:30 AM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rodieee`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `client_name` varchar(50) NOT NULL,
  `client_address` varchar(1000) NOT NULL,
  `email` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `client_name`, `client_address`, `email`) VALUES
(0, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(3, 'Natalija Fumnanya', '2716 Poplar Lane', 'mappujyddif-6123@yopmail.com'),
(4, 'Manuel Ajla', '2016 Charla Lane', 'oppinnerrel-0199@yopmail.com'),
(5, 'Baldassare Adam', '2626 Gateway Avenue', 'wubitiduq-7648@yopmail.com'),
(6, 'Cloe Magda', '4041 Lowland Drive', 'cytehokem-1367@yopmail.com'),
(7, 'Barbora Shiloh', '328 Simpson Square', 'zozimmeciw-2548@yopmail.com'),
(8, 'Sostrate Mimi', '4714 Sunny Glen Lane', 'uppadadof-3128@yopmail.com'),
(9, 'Vaughn Aina', '461 Elkview Drive', 'pomakattes-5732@yopmail.com'),
(10, 'Egnatius Aodh', '1560 Wright Court', 'onnuzuhefe-1432@yopmail.com'),
(11, 'Xiuying Tamsyn', '3454 Diane Street', 'neculobyz-7672@yopmail.com'),
(12, 'Both petru', 'josef kadar', '@mail'),
(13, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(14, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(15, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(16, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(17, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(18, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(19, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(20, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(21, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(22, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(23, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(24, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(25, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(26, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(27, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(28, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(29, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(30, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(31, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(32, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(33, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(34, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(35, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(36, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(37, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(38, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(39, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(40, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(41, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(42, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(43, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES'),
(44, ' Ion Popescu', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(45, ' Luca George', ' Bucuresti', 'ONLY_FOR_UI_BASED_ENTRIES'),
(46, ' Sandu Vasile', ' Cluj-Napoca', 'ONLY_FOR_UI_BASED_ENTRIES');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `id` int(11) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`id`, `item_name`, `price`, `quantity`) VALUES
(1, 'banana', 2, 63),
(2, ' apple', 1, 5),
(3, ' peach', 2, 50),
(4, ' apple', 1, 20),
(5, ' orange', 2, 40),
(6, ' lemon', 2, 55),
(7, ' apple', 1, 20),
(8, ' peach', 2, 50),
(9, ' apple', 1, 20),
(10, ' orange', 2, 40),
(11, ' lemon', 2, 70),
(12, ' apple', 1, 20),
(13, ' peach', 2, 50),
(14, ' apple', 1, 20),
(15, ' orange', 2, 40),
(16, ' lemon', 2, 70),
(17, ' apple', 1, 20),
(18, ' peach', 2, 50),
(19, ' apple', 1, 20),
(20, ' orange', 2, 40),
(21, ' lemon', 2, 70),
(22, ' apple', 1, 20),
(23, ' peach', 2, 50),
(24, ' apple', 1, 20),
(25, ' orange', 2, 40),
(26, ' lemon', 2, 70),
(27, ' apple', 1, 20),
(28, ' peach', 2, 50),
(29, ' apple', 1, 20),
(30, ' orange', 2, 40),
(31, ' lemon', 2, 70),
(32, ' apple', 1, 20),
(33, ' peach', 2, 50),
(34, ' apple', 1, 20),
(35, ' orange', 2, 40),
(36, ' lemon', 2, 70),
(37, ' apple', 1, 20),
(38, ' peach', 2, 50),
(39, ' apple', 1, 20),
(40, ' orange', 2, 40),
(41, ' lemon', 2, 70),
(42, ' apple', 1, 20),
(43, ' peach', 2, 50),
(44, ' apple', 1, 20),
(45, ' orange', 2, 40),
(46, ' lemon', 2, 70),
(47, ' apple', 1, 20),
(48, ' peach', 2, 50),
(49, ' apple', 1, 20),
(50, ' orange', 2, 40),
(51, ' lemon', 2, 70);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `orderQuantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `client_id`, `product_id`, `orderQuantity`) VALUES
(6, 6, 1, 20),
(7, 7, 1, 16),
(9, 9, 1, 1),
(10, 15, 2, 5),
(11, 15, 6, 5),
(12, 15, 2, 5),
(13, 15, 6, 5),
(14, 15, 2, 5),
(15, 15, 6, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `orders` (`client_id`),
  ADD KEY `Fkey` (`product_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `Fkey` FOREIGN KEY (`product_id`) REFERENCES `item` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
