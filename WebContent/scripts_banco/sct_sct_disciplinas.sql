-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: sct
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Table structure for table `sct_disciplinas`
--

DROP TABLE IF EXISTS `sct_disciplinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sct_disciplinas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `curso_ID` int(11) DEFAULT NULL,
  `professor_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_dflfrdwsgil6t6dmipy4few89` (`curso_ID`),
  KEY `FK_8iag9lhxclt6b8mle7jxrhejg` (`professor_ID`),
  CONSTRAINT `FK_8iag9lhxclt6b8mle7jxrhejg` FOREIGN KEY (`professor_ID`) REFERENCES `sct_professores` (`ID`),
  CONSTRAINT `FK_dflfrdwsgil6t6dmipy4few89` FOREIGN KEY (`curso_ID`) REFERENCES `sct_cursos` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sct_disciplinas`
--

LOCK TABLES `sct_disciplinas` WRITE;
/*!40000 ALTER TABLE `sct_disciplinas` DISABLE KEYS */;
INSERT INTO `sct_disciplinas` VALUES (1,'JAVA NA WEB',1,2),(2,'FUNDAMENTOS DA TECNOLOGIA JAVA E UML',1,1),(3,'METODOLOGIA DE DESENVOLVIMENTO ÃGIL',1,3),(4,'PERSISTÃNCIA EM JAVA (JDBC E JPA)',1,2);
/*!40000 ALTER TABLE `sct_disciplinas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-29 21:44:14
