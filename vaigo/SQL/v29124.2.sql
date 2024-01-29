-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-01-2024 a las 21:43:40
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
-- Estructura de tabla para la tabla `ciudades`
--

CREATE TABLE `ciudades` (
  `ID` int(11) NOT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `CIUDAD` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudades`
--

INSERT INTO `ciudades` (`ID`, `ID_PAIS`, `CIUDAD`) VALUES
(1, 1, 'sevilla'),
(2, 1, 'malaga'),
(3, 1, 'cordoba'),
(4, 1, 'granada'),
(5, 1, 'almeria'),
(6, 1, 'cadiz'),
(7, 1, 'jaen'),
(8, 1, 'huelva'),
(9, 2, 'huesca'),
(10, 2, 'teruel'),
(11, 2, 'zaragoza'),
(12, 3, 'asturias'),
(13, 5, 'canarias'),
(14, 6, 'cantabria'),
(15, 8, 'albacete'),
(16, 8, 'ciudad-real'),
(17, 8, 'cuenca'),
(18, 8, 'guadalajara'),
(19, 8, 'toledo'),
(20, 7, 'avila'),
(21, 7, 'burgos'),
(22, 7, 'leon'),
(23, 7, 'palencia'),
(24, 7, 'salamanca'),
(25, 7, 'segovia'),
(26, 7, 'soria'),
(27, 7, 'valladolid'),
(28, 7, 'zamora'),
(29, 9, 'tarragona'),
(30, 9, 'barcelona'),
(31, 9, 'lerida'),
(32, 9, 'girona'),
(33, 17, 'alicante'),
(34, 17, 'castellon'),
(35, 17, 'valencia'),
(36, 10, 'badajoz'),
(37, 10, 'caceres'),
(38, 11, 'coruña'),
(39, 11, 'lugo'),
(40, 11, 'ourense'),
(41, 11, 'pontevedra'),
(42, 4, 'baleares'),
(43, 16, 'rioja'),
(44, 12, 'madrid'),
(45, 13, 'murcia'),
(46, 14, 'navarra'),
(47, 15, 'alava'),
(48, 15, 'vizcalla'),
(49, 15, 'guipuzcoa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `excursion`
--

CREATE TABLE `excursion` (
  `ID` int(11) NOT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `FEC_INICIO` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `DURACION` timestamp NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `excursion`
--

INSERT INTO `excursion` (`ID`, `ID_PAIS`, `ID_CIUDAD`, `TIPO`, `PRECIO`, `NOMBRE`, `FEC_INICIO`, `DURACION`) VALUES
(1, 1, 1, 'visita-catedral', 23.5, 'visita catedral sevilla', '2024-01-29 10:45:27', '2024-04-22 23:00:00'),
(2, 1, 1, 'kayak', 29.95, 'kayaking en sevilla', '2024-03-20 08:45:00', '2024-03-20 10:15:00'),
(3, 1, 1, 'visita-alcaraz', 10.95, 'visita real alcaraz sevilla', '2024-01-29 15:00:00', '2024-01-29 17:00:00'),
(4, 1, 2, 'puenting', 25, 'puenting malaga', '2024-05-13 07:30:00', '2024-05-13 08:00:00'),
(5, 1, 2, 'visita-castillo', 32.95, 'visita castillo gibralfaro', '2024-03-02 16:00:00', '2024-03-02 18:00:00'),
(6, 1, 2, 'visita-catedral', 30, 'visita catedral malaga', '2024-01-29 11:00:55', '0000-00-00 00:00:00'),
(7, 1, 3, 'visita-juderia', 12.49, 'visita juderia cordoba', '2024-01-29 11:02:18', '0000-00-00 00:00:00'),
(8, 1, 3, 'visita-centro-historico', 10.3, 'visita centro historico antigu', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(9, 1, 3, 'escalada', 40, 'escalada espiel cordoba ', '2024-01-29 11:54:10', '0000-00-00 00:00:00'),
(10, 1, 4, 'visita-alambra', 22.5, 'visita alambra granada', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(11, 1, 4, 'visita-albayzin', 29.49, 'visita albayzin granada', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(12, 1, 4, 'barranquismo', 35, 'barranquismo lentegui granada', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(13, 1, 5, 'rappel', 20, 'rappel abrucena almeria', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(14, 1, 5, 'visita-cabo.gata', 15.49, 'visita cabo gata almeria', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(15, 1, 5, 'visita-alcazaba', 34.99, 'visita conjunto alcazaba almer', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(16, 1, 6, 'visita-catedral', 28.5, 'visita catedral cadiz ', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(17, 1, 6, 'senderismo', 35.5, 'senderismo benamahoma cadiz', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(18, 1, 6, 'visita-playa-victoria', 10.2, 'visita playa victoria cadiz', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(19, 1, 7, 'escalada-cerro-golondrina', 45.6, 'escalada cedro golondrina jaen', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(20, 1, 7, 'visita-catedral', 20.7, 'visita catedral jaen', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(21, 1, 7, 'senderismo-sierra-cazorla', 50, 'senderismo sierra cazorla jaen', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(22, 1, 8, 'visita-muelle-tinto', 23.99, 'visita muelle tinto ', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(23, 1, 8, 'visita-plaza-monjas', 30, 'visita plaza monjas huelva', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(24, 1, 8, 'paracaidismo', 120, 'paracaidismo aeronave la julia', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(25, 2, 9, 'visita-parque', 23.5, 'visita parque ordesa huesca', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(26, 2, 9, 'visita-muralla', 30.7, 'visita muralla finestres huesc', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(27, 2, 9, 'senderismo selva', 22.8, 'senderismo selva oza huesca', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(28, 2, 10, 'visita-museo', 45, 'visita museo minero teruel', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(29, 2, 10, 'visita-catedral', 12.5, 'visita catedral amantes teruel', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(30, 2, 10, 'senderismo', 10.5, 'senderismo ruta parrizal becei', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(31, 2, 11, 'visita-basilica', 34.9, 'visita basilica zaragoza', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(32, 2, 11, 'visita-plaza', 32.9, 'visita plaza seo lavador zarag', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(33, 2, 11, 'senderismo', 34.7, 'senderismo ruta hoz seca zarag', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(34, 3, 12, 'visita-museo', 35, 'visita museo molinos asturias', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(35, 3, 12, 'canoa', 30, 'canoa lago ccovadonga asturias', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(36, 3, 12, 'visita iglesia', 12, 'visita iglesia santa maria nar', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(38, 4, 42, 'buceo', 70, 'buceo islas baleares', '2024-01-29 12:31:25', '0000-00-00 00:00:00'),
(39, 4, 42, 'visita-alcudia', 23, 'visita alcudia old town balear', '2024-01-29 12:31:38', '0000-00-00 00:00:00'),
(40, 4, 42, 'visita-castillo', 34, 'visita castillo bellver balear', '2024-01-29 12:31:47', '0000-00-00 00:00:00'),
(41, 5, 13, 'visita-volcan', 70, 'visita volcan teide canarias', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(42, 5, 13, 'apnea', 23, 'apnea islas canarias', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(43, 5, 13, 'senderismo', 45, 'senderismo timanfaya islas can', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(44, 6, 14, 'visita-gaudi', 23, 'visita capricho gaudi cantabri', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(45, 6, 14, 'visita palacio', 65, 'visita palacio magdalena canta', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(46, 6, 14, 'visita-cabo', 10, 'visita cabo mayor cantabria', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(47, 7, 20, 'vista-catedral', 12, 'visita catedral avila', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(48, 7, 20, 'fotografia', 69.99, 'fotografia muralla avila', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(49, 7, 20, 'vista-postes', 45, 'visita postes avila', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(50, 7, 21, 'senderismo-cartuja', 25, 'senderismo cartuja miraflores ', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(51, 7, 21, 'visita-catedral', 15, 'visita catedral burgos', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(52, 7, 21, 'visita-monasterio', 23, 'visita monasterio huelgas burg', '2024-01-29 12:41:46', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialviajes`
--

CREATE TABLE `historialviajes` (
  `ID` int(11) NOT NULL,
  `ID_USUARIO` int(11) NOT NULL,
  `ID_VIAJE` int(11) NOT NULL,
  `NUMPERSONAS` int(11) DEFAULT NULL,
  `Precio_total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `ID_TIPOHOTEL` int(11) NOT NULL,
  `PRECIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itinerario`
--

CREATE TABLE `itinerario` (
  `ID` int(11) NOT NULL,
  `ID_EXCURSION` int(11) NOT NULL,
  `ID_HISTORIALVIAJES` int(11) NOT NULL,
  `COMENTARIO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `ID` int(11) NOT NULL,
  `PAIS` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`ID`, `PAIS`) VALUES
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
-- Estructura de tabla para la tabla `terreno`
--

CREATE TABLE `terreno` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohotel`
--

CREATE TABLE `tipohotel` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transporte`
--

CREATE TABLE `transporte` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL,
  `CLIMA` varchar(30) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
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
-- Estructura de tabla para la tabla `viajes`
--

CREATE TABLE `viajes` (
  `ID` int(11) NOT NULL,
  `ID_PAIS` int(11) NOT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `IDA` date NOT NULL,
  `VUELTA` date NOT NULL,
  `ID_TERRENO` int(11) NOT NULL,
  `ID_HOTEL` int(11) NOT NULL,
  `ID_TRANSPORTE` int(11) NOT NULL,
  `ID_VIAJESIMAGENES` int(11) NOT NULL,
  `PUNTUACION` double DEFAULT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viajesimagenes`
--

CREATE TABLE `viajesimagenes` (
  `ID` int(11) NOT NULL,
  `URL` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudades`
--
ALTER TABLE `ciudades`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PAIS` (`ID_PAIS`);

--
-- Indices de la tabla `excursion`
--
ALTER TABLE `excursion`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PAIS` (`ID_PAIS`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `historialviajes`
--
ALTER TABLE `historialviajes`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `HISTORIALVIAJES_ibfk_1` (`ID_USUARIO`),
  ADD KEY `HISTORIALVIAJES_ibfk_2` (`ID_VIAJE`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_TIPOHOTEL` (`ID_TIPOHOTEL`),
  ADD KEY `ID_PAIS` (`ID_PAIS`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `itinerario`
--
ALTER TABLE `itinerario`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_EXCURSION` (`ID_EXCURSION`),
  ADD KEY `ITINERARIO_ibfk_2` (`ID_HISTORIALVIAJES`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `terreno`
--
ALTER TABLE `terreno`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `tipohotel`
--
ALTER TABLE `tipohotel`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `transporte`
--
ALTER TABLE `transporte`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `viajes`
--
ALTER TABLE `viajes`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PAIS` (`ID_PAIS`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`),
  ADD KEY `ID_TERRENO` (`ID_TERRENO`),
  ADD KEY `ID_HOTEL` (`ID_HOTEL`),
  ADD KEY `ID_TRANSPORTE` (`ID_TRANSPORTE`),
  ADD KEY `ID_VIAJESIMAGENES` (`ID_VIAJESIMAGENES`);

--
-- Indices de la tabla `viajesimagenes`
--
ALTER TABLE `viajesimagenes`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudades`
--
ALTER TABLE `ciudades`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `excursion`
--
ALTER TABLE `excursion`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT de la tabla `historialviajes`
--
ALTER TABLE `historialviajes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hotel`
--
ALTER TABLE `hotel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `itinerario`
--
ALTER TABLE `itinerario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `terreno`
--
ALTER TABLE `terreno`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipohotel`
--
ALTER TABLE `tipohotel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `transporte`
--
ALTER TABLE `transporte`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `viajes`
--
ALTER TABLE `viajes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `viajesimagenes`
--
ALTER TABLE `viajesimagenes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ciudades`
--
ALTER TABLE `ciudades`
  ADD CONSTRAINT `CIUDADES_ibfk_1` FOREIGN KEY (`ID_PAIS`) REFERENCES `pais` (`ID`);

--
-- Filtros para la tabla `excursion`
--
ALTER TABLE `excursion`
  ADD CONSTRAINT `EXCURSION_ibfk_1` FOREIGN KEY (`ID_PAIS`) REFERENCES `pais` (`ID`),
  ADD CONSTRAINT `EXCURSION_ibfk_2` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudades` (`ID`);

--
-- Filtros para la tabla `historialviajes`
--
ALTER TABLE `historialviajes`
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuarios` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_2` FOREIGN KEY (`ID_VIAJE`) REFERENCES `viajes` (`ID`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD CONSTRAINT `HOTEL_ibfk_1` FOREIGN KEY (`ID_TIPOHOTEL`) REFERENCES `tipohotel` (`ID`),
  ADD CONSTRAINT `HOTEL_ibfk_2` FOREIGN KEY (`ID_PAIS`) REFERENCES `pais` (`ID`),
  ADD CONSTRAINT `HOTEL_ibfk_3` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudades` (`ID`);

--
-- Filtros para la tabla `itinerario`
--
ALTER TABLE `itinerario`
  ADD CONSTRAINT `ITINERARIO_ibfk_1` FOREIGN KEY (`ID_EXCURSION`) REFERENCES `excursion` (`ID`) ON DELETE NO ACTION,
  ADD CONSTRAINT `ITINERARIO_ibfk_2` FOREIGN KEY (`ID_HISTORIALVIAJES`) REFERENCES `historialviajes` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `viajes`
--
ALTER TABLE `viajes`
  ADD CONSTRAINT `VIAJES_ibfk_1` FOREIGN KEY (`ID_PAIS`) REFERENCES `pais` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_2` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudades` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_3` FOREIGN KEY (`ID_TERRENO`) REFERENCES `terreno` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_5` FOREIGN KEY (`ID_HOTEL`) REFERENCES `hotel` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_6` FOREIGN KEY (`ID_TRANSPORTE`) REFERENCES `transporte` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_7` FOREIGN KEY (`ID_VIAJESIMAGENES`) REFERENCES `viajesimagenes` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
