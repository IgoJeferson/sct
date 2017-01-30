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
-- Table structure for table `sct_alunos`
--

DROP TABLE IF EXISTS `sct_alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sct_alunos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(45) NOT NULL,
  `RA` int(11) NOT NULL,
  `curso_ID` int(11) DEFAULT NULL,
  `nota_ALUNO_ID` int(11) DEFAULT NULL,
  `nota_DISCIPLINA_ID` int(11) DEFAULT NULL,
  `USUARIO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_sbbk7pcw9j64toqq9dhsaajg9` (`curso_ID`),
  KEY `FK_sy3pg9tyliap5pf0ofv42kpwa` (`nota_ALUNO_ID`,`nota_DISCIPLINA_ID`),
  KEY `FK_pnt09ct5527766bbj9anarm32` (`USUARIO_ID`),
  CONSTRAINT `FK_pnt09ct5527766bbj9anarm32` FOREIGN KEY (`USUARIO_ID`) REFERENCES `sct_usuarios` (`ID`),
  CONSTRAINT `FK_sbbk7pcw9j64toqq9dhsaajg9` FOREIGN KEY (`curso_ID`) REFERENCES `sct_cursos` (`ID`),
  CONSTRAINT `FK_sy3pg9tyliap5pf0ofv42kpwa` FOREIGN KEY (`nota_ALUNO_ID`, `nota_DISCIPLINA_ID`) REFERENCES `sct_notas` (`ALUNO_ID`, `DISCIPLINA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sct_alunos`
--

LOCK TABLES `sct_alunos` WRITE;
/*!40000 ALTER TABLE `sct_alunos` DISABLE KEYS */;
INSERT INTO `sct_alunos` VALUES (1,'Igo Jeferson Barros Coelho',30967,1,NULL,NULL,6),(2,'Phillipe',31040,1,NULL,NULL,7),(3,'Giuliana Lira Monteiro',31489,1,NULL,NULL,8);
/*!40000 ALTER TABLE `sct_alunos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-29 21:44:15
