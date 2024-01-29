-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-01-2024 a las 10:12:27
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vaigo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `CIUDADES`
--

CREATE TABLE `CIUDADES` (
  `ID` int(11) NOT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `CIUDAD` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EXCURSION`
--

CREATE TABLE `EXCURSION` (
  `ID` int(11) NOT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `FEC_INICIO` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `DURACION` timestamp NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `HABITACION`
--

CREATE TABLE `HABITACION` (
  `ID` int(11) NOT NULL,
  `ESTADO` char(1) DEFAULT NULL CHECK (`ESTADO` in ('D','O')),
  `INICIO` date DEFAULT NULL,
  `ID_HOTEL` int(11) NOT NULL,
  `FIN` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `HISTORIALVIAJES`
--

CREATE TABLE `HISTORIALVIAJES` (
  `ID` int(11) NOT NULL,
  `ID_USUARIO` int(11) NOT NULL,
  `ID_VIAJE` int(11) NOT NULL,
  `COMENTARIO` varchar(200) DEFAULT NULL,
  `NUMPERSONAS` int(11) DEFAULT NULL,
  `Precio_total` double DEFAULT NULL,
  `Id_itinerario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `HOTEL`
--

CREATE TABLE `HOTEL` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `ID_TIPOHOTEL` int(11) NOT NULL,
  `PRECIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ITINERARIO`
--

CREATE TABLE `ITINERARIO` (
  `ID` int(11) NOT NULL,
  `ID_EXCURSION` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `PAIS`
--

CREATE TABLE `PAIS` (
  `ID` int(11) NOT NULL,
  `PAIS` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `PAIS`
--

INSERT INTO `PAIS` (`ID`, `PAIS`) VALUES
(1, 'Andalucía'),
(2, 'Aragón'),
(3, 'Asturias'),
(4, 'Islas Baleares'),
(5, 'Canarias'),
(6, 'Cantabria'),
(7, 'Castilla y León'),
(8, 'Castilla-La Mancha'),
(9, 'Cataluña'),
(10, 'Extremadura'),
(11, 'Galicia'),
(12, 'Madrid'),
(13, 'Murcia'),
(14, 'Navarra'),
(15, 'País Vasco'),
(16, 'La Rioja'),
(17, 'Comunidad Valenciana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TERRENO`
--

CREATE TABLE `TERRENO` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TIPOHOTEL`
--

CREATE TABLE `TIPOHOTEL` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TRANSPORTE`
--

CREATE TABLE `TRANSPORTE` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL,
  `CLIMA` varchar(30) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `USUARIOS`
--

CREATE TABLE `USUARIOS` (
  `ID` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `CORREO` varchar(30) NOT NULL,
  `IMGPERFIL` varchar(200) DEFAULT NULL,
  `PASSWORD` varchar(10) NOT NULL,
  `ROL` char(1) DEFAULT NULL CHECK (`ROL` in ('A','O')),
  `FREGISTRO` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `VIAJES`
--

CREATE TABLE `VIAJES` (
  `ID` int(11) NOT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `IDA` date NOT NULL,
  `VUELTA` date NOT NULL,
  `ID_TERRENO` int(11) NOT NULL,
  `ID_HOTEL` int(11) NOT NULL,
  `ID_TRANSPORTE` int(11) NOT NULL,
  `ID_VIAJESIMAGENES` int(11) NOT NULL,
  `PUNTUACION` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `VIAJESIMAGENES`
--

CREATE TABLE `VIAJESIMAGENES` (
  `ID` int(11) NOT NULL,
  `URL` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `CIUDADES`
--
ALTER TABLE `CIUDADES`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PAIS` (`ID_PAIS`);

--
-- Indices de la tabla `EXCURSION`
--
ALTER TABLE `EXCURSION`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PAIS` (`ID_PAIS`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `HABITACION`
--
ALTER TABLE `HABITACION`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `HABITACION_HABITACION__fk` (`ID_HOTEL`);

--
-- Indices de la tabla `HISTORIALVIAJES`
--
ALTER TABLE `HISTORIALVIAJES`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `HISTORIALVIAJES_ibfk_1` (`ID_USUARIO`),
  ADD KEY `HISTORIALVIAJES_ibfk_2` (`ID_VIAJE`),
  ADD KEY `HISTORIALVIAJES_ibfk_3` (`Id_itinerario`);

--
-- Indices de la tabla `HOTEL`
--
ALTER TABLE `HOTEL`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_TIPOHOTEL` (`ID_TIPOHOTEL`),
  ADD KEY `ID_PAIS` (`ID_PAIS`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `ITINERARIO`
--
ALTER TABLE `ITINERARIO`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_EXCURSION` (`ID_EXCURSION`);

--
-- Indices de la tabla `PAIS`
--
ALTER TABLE `PAIS`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `TERRENO`
--
ALTER TABLE `TERRENO`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `TIPOHOTEL`
--
ALTER TABLE `TIPOHOTEL`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `TRANSPORTE`
--
ALTER TABLE `TRANSPORTE`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `USUARIOS`
--
ALTER TABLE `USUARIOS`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `VIAJES`
--
ALTER TABLE `VIAJES`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PAIS` (`ID_PAIS`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`),
  ADD KEY `ID_TERRENO` (`ID_TERRENO`),
  ADD KEY `ID_HOTEL` (`ID_HOTEL`),
  ADD KEY `ID_TRANSPORTE` (`ID_TRANSPORTE`),
  ADD KEY `ID_VIAJESIMAGENES` (`ID_VIAJESIMAGENES`);

--
-- Indices de la tabla `VIAJESIMAGENES`
--
ALTER TABLE `VIAJESIMAGENES`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `CIUDADES`
--
ALTER TABLE `CIUDADES`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `EXCURSION`
--
ALTER TABLE `EXCURSION`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `HABITACION`
--
ALTER TABLE `HABITACION`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `HISTORIALVIAJES`
--
ALTER TABLE `HISTORIALVIAJES`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `HOTEL`
--
ALTER TABLE `HOTEL`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ITINERARIO`
--
ALTER TABLE `ITINERARIO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `PAIS`
--
ALTER TABLE `PAIS`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `TERRENO`
--
ALTER TABLE `TERRENO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `TIPOHOTEL`
--
ALTER TABLE `TIPOHOTEL`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `TRANSPORTE`
--
ALTER TABLE `TRANSPORTE`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `USUARIOS`
--
ALTER TABLE `USUARIOS`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `VIAJES`
--
ALTER TABLE `VIAJES`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `VIAJESIMAGENES`
--
ALTER TABLE `VIAJESIMAGENES`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `CIUDADES`
--
ALTER TABLE `CIUDADES`
  ADD CONSTRAINT `CIUDADES_ibfk_1` FOREIGN KEY (`ID_PAIS`) REFERENCES `PAIS` (`ID`);

--
-- Filtros para la tabla `EXCURSION`
--
ALTER TABLE `EXCURSION`
  ADD CONSTRAINT `EXCURSION_ibfk_1` FOREIGN KEY (`ID_PAIS`) REFERENCES `PAIS` (`ID`),
  ADD CONSTRAINT `EXCURSION_ibfk_2` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `CIUDADES` (`ID`);

--
-- Filtros para la tabla `HABITACION`
--
ALTER TABLE `HABITACION`
  ADD CONSTRAINT `HABITACION_HABITACION__fk` FOREIGN KEY (`ID_HOTEL`) REFERENCES `HOTEL` (`ID`);

--
-- Filtros para la tabla `HISTORIALVIAJES`
--
ALTER TABLE `HISTORIALVIAJES`
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `USUARIOS` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_2` FOREIGN KEY (`ID_VIAJE`) REFERENCES `VIAJES` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_3` FOREIGN KEY (`Id_itinerario`) REFERENCES `ITINERARIO` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `HOTEL`
--
ALTER TABLE `HOTEL`
  ADD CONSTRAINT `HOTEL_ibfk_1` FOREIGN KEY (`ID_TIPOHOTEL`) REFERENCES `TIPOHOTEL` (`ID`),
  ADD CONSTRAINT `HOTEL_ibfk_2` FOREIGN KEY (`ID_PAIS`) REFERENCES `PAIS` (`ID`),
  ADD CONSTRAINT `HOTEL_ibfk_3` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `CIUDADES` (`ID`);

--
-- Filtros para la tabla `ITINERARIO`
--
ALTER TABLE `ITINERARIO`
  ADD CONSTRAINT `ITINERARIO_ibfk_1` FOREIGN KEY (`ID_EXCURSION`) REFERENCES `EXCURSION` (`ID`) ON DELETE CASCADE;

--
-- Filtros para la tabla `VIAJES`
--
ALTER TABLE `VIAJES`
  ADD CONSTRAINT `VIAJES_ibfk_1` FOREIGN KEY (`ID_PAIS`) REFERENCES `PAIS` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_2` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `CIUDADES` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_3` FOREIGN KEY (`ID_TERRENO`) REFERENCES `TERRENO` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_5` FOREIGN KEY (`ID_HOTEL`) REFERENCES `HOTEL` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_6` FOREIGN KEY (`ID_TRANSPORTE`) REFERENCES `TRANSPORTE` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_7` FOREIGN KEY (`ID_VIAJESIMAGENES`) REFERENCES `VIAJESIMAGENES` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
