CREATE DATABASE  IF NOT EXISTS `taller` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `taller`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: taller
-- ------------------------------------------------------
-- Server version	8.3.0

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `cedula` varchar(20) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `correoElectronico` varchar(100) DEFAULT NULL,
  `fechaRegistro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('10101010','Sergio Monge','11111111','Heredia, Costa Rica','sergio@gmail.com','2024-04-01'),('20202020','Juliana Gonzalez','22222222','San Jose, Costa Rica','juliana@gmail.com','2024-04-02'),('30303030','Jhoel Quesada','33333333','San Jose, Costa Rica','jhoel@gmail.com','2024-04-03');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operarios`
--

DROP TABLE IF EXISTS `operarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operarios` (
  `id_operario` varchar(10) NOT NULL,
  `cedula` varchar(20) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `correoElectronico` varchar(100) DEFAULT NULL,
  `salario` float DEFAULT NULL,
  `fechaContratacion` date DEFAULT NULL,
  PRIMARY KEY (`id_operario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operarios`
--

LOCK TABLES `operarios` WRITE;
/*!40000 ALTER TABLE `operarios` DISABLE KEYS */;
INSERT INTO `operarios` VALUES ('1111','10101010','Operario 01','34343434','San Jose, Costa Rica','operario01@gmail.com',100000,'2024-04-01'),('2222','22222222','Operario 02','56565656','Cartago, Costa Rica','operario02@lubrifast.com',223000,'2024-04-03');
/*!40000 ALTER TABLE `operarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `codigo` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `cant_stock` int DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1001,'Producto 01','Descripcion Producto 01',10000,10),(1002,'Producto 02','Descripcion Producto 02',20000,20),(1003,'Producto 03','Descripcion Producto 03',30000,30),(1004,'Producto 04','Descripcion Producto 04',40000,40),(1005,'Producto 05','Descripcion Producto 05',50000,50);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registromantenimientos`
--

DROP TABLE IF EXISTS `registromantenimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registromantenimientos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cedula` varchar(20) DEFAULT NULL,
  `placa` varchar(10) DEFAULT NULL,
  `servicio` varchar(1024) DEFAULT NULL,
  `id_operario` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registromantenimientos`
--

LOCK TABLES `registromantenimientos` WRITE;
/*!40000 ALTER TABLE `registromantenimientos` DISABLE KEYS */;
INSERT INTO `registromantenimientos` VALUES (5,'10101010','AAA123','Cambio de aceite - Precio: 25000.0, Cambio de filtros - Precio: 5500.0','1111'),(6,'20202020','BBB123','Alineación y balanceo - Precio: 40000.0, Reparación de motor - Precio: 200000.0','2222'),(7,'30303030','CCC123','Diagnóstico electrónico - Precio: 10000.0','1111');
/*!40000 ALTER TABLE `registromantenimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `placa` varchar(10) NOT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `año` int DEFAULT NULL,
  `kilometraje` int DEFAULT NULL,
  `cedula` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES ('AAA123','Toyota','Rav4',2020,11000,'10101010'),('BBB123','Nissan','Kicks',2021,22000,'20202020'),('CCC123','Ford','Bronco',2023,33000,'30303030');
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventaproductos`
--

DROP TABLE IF EXISTS `ventaproductos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventaproductos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cedula` varchar(20) DEFAULT NULL,
  `totalpagado` float DEFAULT NULL,
  `tipopago` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventaproductos`
--

LOCK TABLES `ventaproductos` WRITE;
/*!40000 ALTER TABLE `ventaproductos` DISABLE KEYS */;
INSERT INTO `ventaproductos` VALUES (5,'10101010',30000,'EFECTIVO'),(6,'20202020',30000,'EFECTIVO');
/*!40000 ALTER TABLE `ventaproductos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventaservicios`
--

DROP TABLE IF EXISTS `ventaservicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventaservicios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cedula` varchar(20) DEFAULT NULL,
  `totalpagado` float DEFAULT NULL,
  `tipopago` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventaservicios`
--

LOCK TABLES `ventaservicios` WRITE;
/*!40000 ALTER TABLE `ventaservicios` DISABLE KEYS */;
INSERT INTO `ventaservicios` VALUES (5,'10101010',30500,'TARJETA'),(6,'20202020',240000,'TARJETA'),(7,'30303030',10000,'EFECTIVO');
/*!40000 ALTER TABLE `ventaservicios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-10 18:20:32
