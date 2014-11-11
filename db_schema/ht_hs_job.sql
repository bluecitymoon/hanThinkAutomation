CREATE DATABASE  IF NOT EXISTS `ht` /*!40100 DEFAULT CHARACTER SET gb2312 */;
USE `ht`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: ht
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hs_job`
--

DROP TABLE IF EXISTS `hs_job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hs_job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `autoJobRunning` tinyint(1) DEFAULT NULL,
  `clientEnd` varchar(255) DEFAULT NULL,
  `clientIp` varchar(255) DEFAULT NULL,
  `dbName` varchar(255) DEFAULT NULL,
  `dbPassword` varchar(255) DEFAULT NULL,
  `dbUsernname` varchar(255) DEFAULT NULL,
  `lastGrabEnd` varchar(255) DEFAULT NULL,
  `lastGrabStart` varchar(255) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT NULL,
  `mode` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `restartInHours` int(11) DEFAULT NULL,
  `start` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `stop` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hs_job`
--

LOCK TABLES `hs_job` WRITE;
/*!40000 ALTER TABLE `hs_job` DISABLE KEYS */;
INSERT INTO `hs_job` VALUES (1,0,'/hanthinkserver/service1.asmx','http://hanthink.gnway.org:88','测试帐套','E1CCjc7z+m3nmqvYlGnc+LcM8t4=','Admin','2014-11-11 14:35:07','2014-11-11 14:35:05',0,'debug','威震天','shyf1356',1,'00:34','未启动','23:59','authan','AC1356'),(2,0,'/hanthinkserver/service1.asmx','http://hanthink.gnway.org:88','测试帐套','E1CCjc7z+m3nmqvYlGnc+LcM8t4=','Admin',NULL,NULL,0,'debug','威震天','shyf1356',1,'00:34','未启动','23:59','authan','AC1356'),(3,0,'/hanthinkserver/service1.asmx','http://hanthink.gnway.org:88','测试帐套','E1CCjc7z+m3nmqvYlGnc+LcM8t4=','Admin',NULL,NULL,0,'debug','威震天','shyf1356',1,'00:34','未启动','23:59','authan','AC1356'),(4,0,'/hanthinkserver/service1.asmx','http://hanthink.gnway.org:88','测试帐套','E1CCjc7z+m3nmqvYlGnc+LcM8t4=','Admin',NULL,NULL,0,'debug','威震天','shyf1356',1,'00:34','未启动','23:59','authan','AC1356'),(5,0,'/hanthinkserver/service1.asmx','http://hanthink.gnway.org:88','测试帐套','E1CCjc7z+m3nmqvYlGnc+LcM8t4=','Admin',NULL,NULL,0,'debug','威震天','shyf1356',1,'00:34','未启动','23:59','authan','AC1356');
/*!40000 ALTER TABLE `hs_job` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-11 14:39:33
