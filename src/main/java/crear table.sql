/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Albert Gonzalez
 * Created: Oct 25, 2019
 */

CREATE TABLE `clients` (
  `codi` int(11) NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `adreca` varchar(30) DEFAULT NULL,
  `codiPostal` int(11) DEFAULT NULL,
  `poblacio` varchar(30) DEFAULT NULL,
  `limitCredit` double DEFAULT NULL,
  `dataUltimaCompra` date DEFAULT NULL,
  PRIMARY KEY (`codi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


