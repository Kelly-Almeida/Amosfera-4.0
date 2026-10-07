-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: atmosfera4.0
-- ------------------------------------------------------
-- Server version	8.4.11-0ubuntu0.26.04.1

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
-- Table structure for table `Registros`
--

DROP TABLE IF EXISTS `Registros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Registros` (
  `id_registro` bigint NOT NULL AUTO_INCREMENT,
  `id_dispositivo_fk` int NOT NULL,
  `timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `data_hora` datetime DEFAULT NULL,
  `temperatura` float DEFAULT NULL,
  `umidade` float DEFAULT NULL,
  `pressao` float DEFAULT NULL,
  `altitude` float DEFAULT NULL,
  `luminosidade` float DEFAULT NULL,
  `velocidade_vento` float DEFAULT NULL,
  `direcao_vento` int DEFAULT NULL,
  `intensidade_wifi` int DEFAULT NULL,
  PRIMARY KEY (`id_registro`),
  KEY `fk_dispositivo_registro` (`id_dispositivo_fk`),
  CONSTRAINT `fk_dispositivo_registro` FOREIGN KEY (`id_dispositivo_fk`) REFERENCES `Dispositivos` (`id_dispositivo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Registros`
--

LOCK TABLES `Registros` WRITE;
/*!40000 ALTER TABLE `Registros` DISABLE KEYS */;
INSERT INTO `Registros` VALUES (1,1,'2026-10-06 13:50:34','2026-10-06 10:50:34',34.9,70.4,0.91,20,30,45.9,4,100),(2,3,'2026-10-06 13:50:34','2026-10-06 10:50:34',20,20.8,0.93,40,35,45.9,2,40),(3,2,'2026-10-06 13:50:34','2026-10-06 10:50:34',15.3,90,0.92,10,40,42.9,3,20);
/*!40000 ALTER TABLE `Registros` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-10-06 17:36:23
