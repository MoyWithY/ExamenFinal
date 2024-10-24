-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: db_examenfinal
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `fecha_nacimiento` varchar(255) NOT NULL,
  `fecha_registro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKkfsp0s1tflm1cwlj8idhqsad0` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'quispe','kevin','1123','moises.quispe147@hotmail.com','2024-10-02','2024-10-24 06:04:26'),(3,'quispe','kevin','qrqrqqrqr','kevin.quispe147@hotmail.com','2024-10-09','2024-10-24 06:04:26'),(4,'Pérez','Carlos','','carlos.perez@ejemplo.com','1990-05-15 00:00:00','2024-07-24 05:00:00'),(5,'González','María','','maria.gonzalez@ejemplo.com','1992-07-20 00:00:00','2024-07-24 05:00:00'),(6,'Martínez','Juan','','juan.martinez@ejemplo.com','1988-03-10 00:00:00','2024-07-24 05:00:00'),(7,'López','Ana','','ana.lopez@ejemplo.com','1995-01-25 00:00:00','2024-07-24 05:00:00'),(8,'Hernández','Luis','','luis.hernandez@ejemplo.com','1993-11-15 00:00:00','2024-07-24 05:00:00'),(9,'Ramírez','Sofía','','sofia.ramirez@ejemplo.com','1991-09-30 00:00:00','2024-07-24 05:00:00'),(10,'Díaz','Diego','','diego.diaz@ejemplo.com','1987-12-05 00:00:00','2024-07-24 05:00:00'),(11,'García','Valentina','','valentina.garcia@ejemplo.com','1994-06-18 00:00:00','2024-07-24 05:00:00'),(12,'Morales','Andrés','','andres.morales@ejemplo.com','1996-04-22 00:00:00','2024-07-24 05:00:00'),(13,'Torres','Lucía','','lucia.torres@ejemplo.com','1990-08-28 00:00:00','2024-07-24 05:00:00'),(24,'asd','qwe','1234','asd@gmail.com','2001-12-12 00:00:00','2023-06-12 05:00:00'),(25,'quispe','kevin','1231244124','asdquispe147@hotmail.com','2024-08-29',NULL),(27,'quispe','kevin','141414114','12347@hotmail.com','2024-10-03',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-24  4:26:10
