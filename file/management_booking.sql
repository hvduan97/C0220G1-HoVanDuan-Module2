CREATE DATABASE  IF NOT EXISTS `management_booking` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `management_booking`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: management_booking
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `admin_notification`
--

DROP TABLE IF EXISTS `admin_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_notification` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sender_notification_id` int DEFAULT NULL,
  `handler_notification_id` int DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  `seen` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sender_notification_id` (`sender_notification_id`),
  KEY `handler_notification_id` (`handler_notification_id`),
  CONSTRAINT `admin_notification_ibfk_1` FOREIGN KEY (`sender_notification_id`) REFERENCES `user_notification` (`id`),
  CONSTRAINT `admin_notification_ibfk_2` FOREIGN KEY (`handler_notification_id`) REFERENCES `user_notification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_notification`
--

LOCK TABLES `admin_notification` WRITE;
/*!40000 ALTER TABLE `admin_notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asset`
--

DROP TABLE IF EXISTS `asset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asset` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `number_using` int DEFAULT NULL,
  `number_fixed` int DEFAULT NULL,
  `number_availability` int DEFAULT NULL,
  `total` int DEFAULT NULL,
  `detail` varchar(500) DEFAULT NULL,
  `price` varchar(50) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asset`
--

LOCK TABLES `asset` WRITE;
/*!40000 ALTER TABLE `asset` DISABLE KEYS */;
INSERT INTO `asset` VALUES (1,'Máy chiếu',0,0,100,100,'Sony','3000000','https://www.sieuthivienthong.com/imgs/art/p_30150_OPTOMA-SA500.jpg',0),(2,'Loa, mic',0,0,100,100,'Sony','500000','https://cf.shopee.vn/file/a47975c258db2ee5903b5776f51d3a61',0),(3,'Giấy note',0,0,100,100,'Sony','10000','https://cdn.vmax.vn/pub/media/catalog/product/cache/8872124951f387c8ded3f228faa55bea/g/i/giay-note-pronoti-76x76mm-3x3-hong-neon-min_1.jpg',0),(4,'Bút',0,0,100,100,'Sony','15000','https://anlocviet.vn/upload/product/butlongdauthienlongflexofficefopm095-4614.jpg',0),(5,'Laptop',0,0,100,100,'Sony','15000000','https://www.notebookcheck.net/uploads/tx_nbc2/MicrosoftSurfaceLaptop3-15__1__02.JPG',0),(6,'Bàn',0,0,100,100,'Sony','500000','https://noithatdailoi.com/wp-content/uploads/ban-gap-gon-chan-sat-dl02-6-1.jpg',0),(7,'Bảng',0,0,100,100,'Sony','400000','https://bangtot.vn/wp-content/uploads/2018/10/bang-tu-trang-han-quoc-viet-but-da.jpg',0),(8,'Ghế',0,0,100,100,'Sony','100000','https://hoaphat.net.vn/wp-content/uploads/ghe-gap-van-phong-G11.jpg',0);
/*!40000 ALTER TABLE `asset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_date`
--

DROP TABLE IF EXISTS `booking_date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_date` (
  `booking_date_id` int NOT NULL AUTO_INCREMENT,
  `start_day` datetime DEFAULT NULL,
  `end_day` datetime DEFAULT NULL,
  PRIMARY KEY (`booking_date_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_date`
--

LOCK TABLES `booking_date` WRITE;
/*!40000 ALTER TABLE `booking_date` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_room`
--

DROP TABLE IF EXISTS `booking_room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_room` (
  `id_booking` int NOT NULL,
  `description_meeting` varchar(255) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  `id_room` int DEFAULT NULL,
  `users` int DEFAULT NULL,
  `booking_status` varchar(50) DEFAULT NULL,
  `create_booking_day` date DEFAULT NULL,
  `start_day` date DEFAULT NULL,
  `end_day` date DEFAULT NULL,
  `request_other` varchar(100) DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  PRIMARY KEY (`id_booking`),
  KEY `id_room` (`id_room`),
  KEY `users` (`users`),
  CONSTRAINT `booking_room_ibfk_2` FOREIGN KEY (`id_room`) REFERENCES `room` (`id`),
  CONSTRAINT `booking_room_ibfk_3` FOREIGN KEY (`users`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_room`
--

LOCK TABLES `booking_room` WRITE;
/*!40000 ALTER TABLE `booking_room` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meeting_room_asset`
--

DROP TABLE IF EXISTS `meeting_room_asset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meeting_room_asset` (
  `quantity_user` int DEFAULT NULL,
  `id_room` int DEFAULT NULL,
  `id_asset` int DEFAULT NULL,
  KEY `id_room` (`id_room`),
  KEY `id_asset` (`id_asset`),
  CONSTRAINT `meeting_room_asset_ibfk_1` FOREIGN KEY (`id_room`) REFERENCES `room` (`id`),
  CONSTRAINT `meeting_room_asset_ibfk_2` FOREIGN KEY (`id_asset`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meeting_room_asset`
--

LOCK TABLES `meeting_room_asset` WRITE;
/*!40000 ALTER TABLE `meeting_room_asset` DISABLE KEYS */;
INSERT INTO `meeting_room_asset` VALUES (1,1,1),(1,1,2),(1,1,3),(1,1,4),(1,1,6),(1,1,7),(1,1,8),(1,2,1),(1,2,3),(1,2,4),(1,2,5),(1,2,6),(1,2,8),(1,3,1),(1,3,2),(1,3,4),(1,3,5),(1,3,6),(1,3,8),(1,4,1),(1,4,3),(1,4,4),(1,4,6),(1,4,7),(1,4,8),(1,5,1),(1,5,4),(1,5,5),(1,5,6),(1,5,7),(1,5,8),(1,6,1),(1,6,2),(1,6,3),(1,6,4),(1,6,5),(1,6,6),(1,6,8),(1,7,1),(1,7,2),(1,7,4),(1,7,5),(1,7,6),(1,7,8),(1,8,1),(1,8,2),(1,8,3),(1,8,4),(1,8,5),(1,8,6),(1,8,7),(1,8,8),(1,9,1),(1,9,2),(1,9,3),(1,9,4),(1,9,5),(1,9,6),(1,9,8),(1,10,1),(1,10,2),(1,10,4),(1,10,5),(1,10,6),(1,10,7),(1,10,8),(1,11,1),(1,11,2),(1,11,3),(1,11,4),(1,11,6),(1,11,8),(1,12,1),(1,12,2),(1,12,3),(1,12,4),(1,12,5),(1,12,6),(1,12,7),(1,12,8),(1,13,1),(1,13,2),(1,13,4),(1,13,5),(1,13,6),(1,13,8),(1,14,1),(1,14,2),(1,14,3),(1,14,4),(1,14,5),(1,14,6),(1,14,8),(1,15,1),(1,15,2),(1,15,4),(1,15,5),(1,15,6),(1,15,7),(1,15,8),(1,16,1),(1,16,2),(1,16,4),(1,16,6),(1,16,8),(1,17,1),(1,17,2),(1,17,4),(1,17,5),(1,17,6),(1,17,7),(1,17,8),(1,18,1),(1,18,2),(1,18,4),(1,18,6),(1,18,7),(1,18,8),(1,19,1),(1,19,2),(1,19,3),(1,19,4),(1,19,6),(1,19,8),(1,20,1),(1,20,2),(1,20,4),(1,20,6),(1,20,7),(1,20,8);
/*!40000 ALTER TABLE `meeting_room_asset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification`
--

DROP TABLE IF EXISTS `notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notification` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(500) DEFAULT NULL,
  `request_date` datetime DEFAULT NULL,
  `repond_date` datetime DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `room_id` int DEFAULT NULL,
  `type_of_notification_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `room_id` (`room_id`),
  KEY `type_of_notification_id` (`type_of_notification_id`),
  CONSTRAINT `notification_ibfk_1` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`),
  CONSTRAINT `notification_ibfk_2` FOREIGN KEY (`type_of_notification_id`) REFERENCES `type_of_notification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification`
--

LOCK TABLES `notification` WRITE;
/*!40000 ALTER TABLE `notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `region` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1,'A'),(2,'B'),(3,'C');
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `area` float DEFAULT NULL,
  `floor` int DEFAULT NULL,
  `capacity` int DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  `id_type_room` int DEFAULT NULL,
  `id_region` int DEFAULT NULL,
  `id_status` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_type_room` (`id_type_room`),
  KEY `id_region` (`id_region`),
  KEY `id_status` (`id_status`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`id_type_room`) REFERENCES `type_room` (`id_type_room`),
  CONSTRAINT `room_ibfk_2` FOREIGN KEY (`id_region`) REFERENCES `region` (`id`),
  CONSTRAINT `room_ibfk_3` FOREIGN KEY (`id_status`) REFERENCES `status` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'Sub-Ex',22,2,19,0,4,2,2),(2,'Biodex',43,7,27,0,4,1,2),(3,'Keylex',13,9,22,0,1,2,2),(4,'Tampflex',14,7,14,0,4,3,2),(5,'Aerified',50,2,20,0,2,2,2),(6,'Quo Lux',45,4,31,0,4,2,2),(7,'Zontrax',21,9,22,0,2,1,1),(8,'Holdlamis',4,8,44,0,2,1,1),(9,'Zamit',29,2,3,0,1,2,2),(10,'Rank',17,7,6,0,3,2,2),(11,'Zamit',8,8,8,0,3,3,1),(12,'Bytecard',26,9,36,0,2,3,2),(13,'Lotstring',33,5,10,0,4,3,2),(14,'Job',46,4,19,0,3,3,2),(15,'Wrapsafe',44,6,50,0,3,2,2),(16,'Hatity',26,9,49,0,2,3,2),(17,'Job',7,8,26,0,4,3,2),(18,'Trippledex',20,6,1,0,3,3,1),(19,'Cardify',20,3,10,0,3,3,2),(20,'Voltsillam',37,1,9,0,3,1,2);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (1,'Đang sử dụng'),(2,'Chưa sử dụng');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_of_notification`
--

DROP TABLE IF EXISTS `type_of_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `type_of_notification` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type_of_notification_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_of_notification`
--

LOCK TABLES `type_of_notification` WRITE;
/*!40000 ALTER TABLE `type_of_notification` DISABLE KEYS */;
INSERT INTO `type_of_notification` VALUES (1,'Báo cáo'),(2,'Phản hồi'),(3,'Yêu cầu xử lý');
/*!40000 ALTER TABLE `type_of_notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_room`
--

DROP TABLE IF EXISTS `type_room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `type_room` (
  `id_type_room` int NOT NULL,
  `name_type_room` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_type_room`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_room`
--

LOCK TABLES `type_room` WRITE;
/*!40000 ALTER TABLE `type_room` DISABLE KEYS */;
INSERT INTO `type_room` VALUES (1,'Một lần'),(2,'Hàng ngày'),(3,'Hàng tuần'),(4,'Hàng tháng');
/*!40000 ALTER TABLE `type_room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `fullname` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Thái Nhật Quang','thainhatquang','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Admin',0,1),(2,'Lê Minh Huy','leminhhuy','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Scrum Master Team Cơm gà',0,2),(3,'Nguyễn Ngọc Sơn','nguyenngocson','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Scrum master Team  Project s ',0,2),(4,'Trần Chí Hiếu','tranchihieu','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Scrum master Team 5AE Siêu Nhân',0,2),(5,'Lê Ngọc Huy','lengochuy','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Quản lý nhân sự',0,2),(6,'Hồ Văn Duẩn','hovanduan','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Giám đốc',0,1),(7,'Nguyễn Chí Hiếu','nguyenchihieu','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Quản lý hành chính',0,2),(8,'Lê Hoàng Hà','lehoangha','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Trưởng phòng kế hoạch',0,2),(9,'Hồ Khánh Nguyên','hokhanhnguyen','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Quản lý kho',0,2),(10,'Cao Quốc Huy','caoquochuy','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Trưởng phòng đào tạo',0,2),(11,'Trần Thị Tố Tâm','tranthitotam','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Chủ Tịch',0,1),(12,'Trương Tấn Hải','truongtanhai','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Trường phòng IT',0,1),(13,'Hoàng Ngọc Thạch ','hoangngocthach','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Phó phòng IT',0,1),(14,'Trần Văn Thanh','tranvanthanh','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Trưởng Phòng Kế Toán',0,2),(15,'Nguyễn Văn Nhân','nguyenvannhan','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Phó chủ tịch',0,1),(16,'Nguyễn Nhung','nguyennhung','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Thư ký giám đốc',0,2),(17,'Kiều Sơn Hải','kieusonhai','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','Phó phòng kế toán',0,2),(18,'hai admin','hai_admin','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','admin',0,1),(19,'quang user','quang user','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','user',0,2),(20,'admin','admin','$2y$12$cGKHYfjVqOSEhvJWTxsEOOF3Oyfc6PUXyWI0LhN4jWb7HEpcrmBhC','admin',0,1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_notification`
--

DROP TABLE IF EXISTS `user_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_notification` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `notification_id` int DEFAULT NULL,
  `seen` tinyint(1) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `notification_id` (`notification_id`),
  CONSTRAINT `user_notification_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `user_notification_ibfk_2` FOREIGN KEY (`notification_id`) REFERENCES `notification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_notification`
--

LOCK TABLES `user_notification` WRITE;
/*!40000 ALTER TABLE `user_notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_notification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-07  9:59:47
