-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 07-02-2024 a las 13:52:49
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

INSERT INTO `excursion` (`ID`, `ID_CIUDAD`, `TIPO`, `PRECIO`, `NOMBRE`, `FEC_INICIO`, `DURACION`) VALUES
(1, 1, 'visita-catedral', 23.5, 'visita catedral sevilla', '2024-01-29 10:45:27', '2024-04-22 23:00:00'),
(2, 1, 'kayak', 29.95, 'kayaking en sevilla', '2024-03-20 08:45:00', '2024-03-20 10:15:00'),
(3, 1, 'visita-alcaraz', 10.95, 'visita real alcaraz sevilla', '2024-01-29 15:00:00', '2024-01-29 17:00:00'),
(4, 2, 'puenting', 25, 'puenting malaga', '2024-05-13 07:30:00', '2024-05-13 08:00:00'),
(5, 2, 'visita-castillo', 32.95, 'visita castillo gibralfaro', '2024-03-02 16:00:00', '2024-03-02 18:00:00'),
(6, 2, 'visita-catedral', 30, 'visita catedral malaga', '2024-01-29 11:00:55', '0000-00-00 00:00:00'),
(7, 3, 'visita-juderia', 12.49, 'visita juderia cordoba', '2024-01-29 11:02:18', '0000-00-00 00:00:00'),
(8, 3, 'visita-centro-historico', 10.3, 'visita centro historico antigu', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(9, 3, 'escalada', 40, 'escalada espiel cordoba ', '2024-01-29 11:54:10', '0000-00-00 00:00:00'),
(10, 4, 'visita-alambra', 22.5, 'visita alambra granada', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(11, 4, 'visita-albayzin', 29.49, 'visita albayzin granada', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(12, 4, 'barranquismo', 35, 'barranquismo lentegui granada', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(13, 5, 'rappel', 20, 'rappel abrucena almeria', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(14, 5, 'visita-cabo.gata', 15.49, 'visita cabo gata almeria', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(15, 5, 'visita-alcazaba', 34.99, 'visita conjunto alcazaba almer', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(16, 6, 'visita-catedral', 28.5, 'visita catedral cadiz ', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(17, 6, 'senderismo', 35.5, 'senderismo benamahoma cadiz', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(18, 6, 'visita-playa-victoria', 10.2, 'visita playa victoria cadiz', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(19, 7, 'escalada-cerro-golondrina', 45.6, 'escalada cedro golondrina jaen', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(20, 7, 'visita-catedral', 20.7, 'visita catedral jaen', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(21, 7, 'senderismo-sierra-cazorla', 50, 'senderismo sierra cazorla jaen', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(22, 8, 'visita-muelle-tinto', 23.99, 'visita muelle tinto ', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(23, 8, 'visita-plaza-monjas', 30, 'visita plaza monjas huelva', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(24, 8, 'paracaidismo', 120, 'paracaidismo aeronave la julia', '2024-01-29 11:24:47', '0000-00-00 00:00:00'),
(25, 9, 'visita-parque', 23.5, 'visita parque ordesa huesca', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(26, 9, 'visita-muralla', 30.7, 'visita muralla finestres huesc', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(27, 9, 'senderismo selva', 22.8, 'senderismo selva oza huesca', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(28, 10, 'visita-museo', 45, 'visita museo minero teruel', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(29, 10, 'visita-catedral', 12.5, 'visita catedral amantes teruel', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(30, 10, 'senderismo', 10.5, 'senderismo ruta parrizal becei', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(31, 11, 'visita-basilica', 34.9, 'visita basilica zaragoza', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(32, 11, 'visita-plaza', 32.9, 'visita plaza seo lavador zarag', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(33, 11, 'senderismo', 34.7, 'senderismo ruta hoz seca zarag', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(34, 12, 'visita-museo', 35, 'visita museo molinos asturias', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(35, 12, 'canoa', 30, 'canoa lago ccovadonga asturias', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(36, 12, 'visita iglesia', 12, 'visita iglesia santa maria nar', '2024-01-29 12:05:00', '0000-00-00 00:00:00'),
(38, 42, 'buceo', 70, 'buceo islas baleares', '2024-01-29 12:31:25', '0000-00-00 00:00:00'),
(39, 42, 'visita-alcudia', 23, 'visita alcudia old town balear', '2024-01-29 12:31:38', '0000-00-00 00:00:00'),
(40, 42, 'visita-castillo', 34, 'visita castillo bellver balear', '2024-01-29 12:31:47', '0000-00-00 00:00:00'),
(41, 13, 'visita-volcan', 70, 'visita volcan teide canarias', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(42, 13, 'apnea', 23, 'apnea islas canarias', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(43, 13, 'senderismo', 45, 'senderismo timanfaya islas can', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(44, 14, 'visita-gaudi', 23, 'visita capricho gaudi cantabri', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(45, 14, 'visita palacio', 65, 'visita palacio magdalena canta', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(46, 14, 'visita-cabo', 10, 'visita cabo mayor cantabria', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(47, 20, 'vista-catedral', 12, 'visita catedral avila', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(48, 20, 'fotografia', 69.99, 'fotografia muralla avila', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(49, 20, 'vista-postes', 45, 'visita postes avila', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(50, 21, 'senderismo-cartuja', 25, 'senderismo cartuja miraflores ', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(51, 21, 'visita-catedral', 15, 'visita catedral burgos', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(52, 21, 'visita-monasterio', 23, 'visita monasterio huelgas burg', '2024-01-29 12:41:46', '0000-00-00 00:00:00'),
(53, 22, 'visita-catedral', 12.49, 'visita catedral basilica leon', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(54, 22, 'visita-templo', 15, 'visita templo expiatorio leon', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(55, 22, 'senderismo-arco', 10, 'sederismo arco leon ', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(56, 23, 'senderismo-pantano', 23, 'senderismo pantanos palencia', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(57, 23, 'visita-monumento', 6, 'visita cristo otero palencia', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(58, 23, 'visita-catedral', 12, 'vista catedral palencia', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(59, 24, 'visita-monumento', 10, 'visita leronimus salamanca', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(60, 24, 'visita-plaza', 5, 'visita plaza mayor salamanca', '2024-01-31 09:25:25', '0000-00-00 00:00:00'),
(61, 24, 'rafting', 23.5, 'rafting cciudad rodrigo salama', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(62, 25, 'visita-monumento', 7, 'visita alcaraz segobia', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(63, 25, 'visita-aqueducto', 7, 'visita aqueducto segobia', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(64, 25, 'senderismo-parque', 22, 'senderismo parque natural hoce', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(65, 26, 'buceo-laguna', 20, 'buceo laguna negra soria', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(66, 26, 'senderismo-fuentona', 15, 'senderismo fuentona soria', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(67, 26, 'visita-cañon', 14, 'visita cañon rio lobos soria', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(68, 27, 'visita-iglesia', 8, 'visita santa maria antigua val', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(69, 27, 'paseo-globo', 30, 'paseo globo ciudad valladolid', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(70, 27, 'visita-plaza', 5, 'visita plaza mayor valladolid', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(71, 28, 'visita-iglesia', 12, 'visita iglesia santa maria nue', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(72, 28, 'senderismo-parque', 17, 'senderismo parque sanabria zam', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(73, 28, 'visita-catedral', 12, 'vista catedral de zamora', '2024-01-31 09:38:03', '0000-00-00 00:00:00'),
(74, 15, 'senderismo-rio', 15, 'senderismo nacimiento rio mund', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(75, 15, 'visita-bodegas', 23, 'visita bodegas aldonza albacet', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(76, 15, 'paseo', 3, 'paseo pasaje lodares albacete', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(77, 16, 'safari-parque', 45, 'safari parque cabañeros ciudad', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(78, 16, 'visita-parque', 4, 'visita parque gasset ciudad re', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(79, 16, 'visita.iglesia', 12, 'visita iglesia san pedro ciuda', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(80, 17, 'paseo', 2, 'paseo puente san pablo cuenca', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(81, 17, 'visita-catedral', 13, 'vissita catedral cuenca ', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(82, 17, 'visita-ciudad', 35, 'visita ciudad amurallada cuenc', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(83, 18, 'vista-campo', 23, 'visita campo lavanda guadalaja', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(84, 18, 'senderismo-campo', 12, 'senderismo campo atienza guada', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(85, 18, 'montañismo-campillo', 34, 'montañismo campillo de ranas g', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(86, 19, 'mirador', 12, 'mirador valle toledo', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(87, 19, 'visita-monumento', 23, 'visita monumento primada toled', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(88, 19, 'visita-monasterio', 25, 'visita monasterio san juan de ', '2024-01-31 09:52:14', '0000-00-00 00:00:00'),
(89, 30, 'visita-palacio', 12.49, 'visita palacio musica barcelon', '2024-01-31 09:56:14', '0000-00-00 00:00:00'),
(90, 30, 'visita-basilica', 23, 'visita basilica sagrada famili', '2024-01-31 09:56:14', '0000-00-00 00:00:00'),
(91, 30, 'visita-parque', 30, 'visita parque guell barcelona', '2024-01-31 09:56:14', '0000-00-00 00:00:00'),
(92, 32, 'visita-baños', 14, 'visita baños arabes girona', '2024-01-31 09:56:14', '0000-00-00 00:00:00'),
(93, 32, 'visita-catedral', 12, 'visita catedral girona', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(94, 32, 'paseo-muralla', 30, 'paseo muralla girona', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(95, 31, 'visita-castillo', 32, 'visita castillo templario', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(96, 31, 'visita-catedral', 12, 'visita catedral seu vella leri', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(97, 31, 'paso-parque', 3, 'paseo parque mitjana lerida', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(98, 29, 'visita-anfiteatro', 12, 'visita anfiteatro tarraco tarr', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(99, 29, 'visita-circo', 23, 'visita circo romano tarragona', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(100, 29, 'visita-catedral', 13, 'visita catedral tarragona', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(101, 36, 'senderismo-alcazaba', 23, 'senderismo alcazabar badajoz', '2024-01-31 10:41:08', '0000-00-00 00:00:00'),
(102, 36, 'visita-monumento', 10, 'visita puertas palmas badajoz', '2024-01-31 12:33:01', '0000-00-00 00:00:00'),
(103, 36, 'visita-plaza', 3, 'visita plaza alta badajoz', '2024-01-31 12:33:01', '0000-00-00 00:00:00'),
(104, 37, 'visita-monumento', 4, 'visita monumento arco estrella', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(105, 37, 'visita-plaza', 3, 'visita plaza mayor caceres', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(106, 37, 'visita-torre', 20, 'visita torre bujaco caceres', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(107, 38, 'senderismo-monte', 5, 'senderismo monte san pedro cor', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(108, 38, 'visita-plaza', 3, 'visita plaza maria coruña', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(109, 38, 'montañismo', 25, 'montañismo torre hercules coru', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(110, 39, 'vissita-monumento', 20, 'visita monumento murallas roma', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(111, 39, 'visita-museo', 15, 'visita museo provincial lugo', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(112, 39, 'visita-catedral', 10, 'visita catedral lugo', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(113, 40, 'turismo-ruta', 10, 'turismo ruta puentes romanos o', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(114, 40, 'visita-plaza', 3, 'visita plaza mayor ourense', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(115, 40, 'visita catedral', 8, 'visita catedral san martin our', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(116, 41, 'visita poblado', 20, 'visita poblado heroes combarro', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(117, 41, 'senderismo-monumento', 20, 'senderismo monumento castro sa', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(118, 41, 'visita-iglesia', 12, 'visita iglesia virgen peregrin', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(119, 44, 'vistar-monumento', 4, 'visitar monumento gran via mad', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(120, 44, 'visitar-palacio', 30, 'visitar palacio real madrid', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(121, 44, 'visitar-plaza', 3, 'visitar plaza mayor madrid', '2024-01-31 12:48:53', '0000-00-00 00:00:00'),
(122, 45, 'visita-casino', 13, 'visita casino murcia', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(123, 45, 'senderismo-ruta', 5, 'senderismo ruta murcia', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(124, 45, 'visita-casino', 20, 'visita casino murcia', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(125, 46, 'senderismo', 10, 'selva irati navarra', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(126, 46, 'visita-palacio', 23, 'visita palacio olite fitero na', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(127, 46, 'visita-poblado', 12, 'visita poblado ujue navarra', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(128, 47, 'visita-bodega', 20, 'visita bodega baigorri alava', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(129, 47, 'visita-catedral', 21, 'visita catedral santa maria al', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(130, 47, 'visita-museo', 20, 'visita museo bellas artes alav', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(131, 48, 'puenting', 45, 'puenting puente colgante vizca', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(132, 48, 'visita-poblado', 5, 'visita poblado casco antiguo v', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(133, 48, 'visita-plaza', 5, 'visita plaza nueva vizcalla', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(134, 49, 'visita-poblado', 5, 'visita poblado hordarribia gui', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(135, 49, 'visita-monumento', 9, 'visita monumento peine viento ', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(136, 49, 'senderismo', 10, 'senderismo monte urgull guipuz', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(137, 43, 'visita-monasterio', 20, 'visita monasterio yuso rioja', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(138, 43, 'visita-plaza', 3, 'visita plaza mercado logrono r', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(139, 43, 'visita-poblado', 4, 'visita poblado ezcaray rioja', '2024-02-01 08:07:29', '0000-00-00 00:00:00'),
(140, 33, 'visita-paseo', 5, 'visita paseo explanada alicant', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(141, 33, 'visita-puerto', 10, 'visita puerto alicante', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(142, 33, 'visita-monumento', 19, 'visita monumento plaza luceros', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(143, 34, 'baño-termal', 14, 'baños termales montanejos cast', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(144, 34, 'visita-poblado', 5, 'visita poblado casco antiguo c', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(145, 34, 'visita-murallas', 20, 'visita murallas morella castel', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(146, 35, 'visita-ciudad', 20, 'visita ciudad artes ciencias v', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(147, 35, 'visita-monumento', 30, 'visita monumento lonja valenci', '2024-02-01 08:15:45', '0000-00-00 00:00:00'),
(148, 35, 'visita-catedral', 20, 'visita catedral miguelete vale', '2024-02-01 08:15:45', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialviajes`
--

CREATE TABLE `historialviajes` (
  `ID` int(11) NOT NULL,
  `ID_USUARIO` int(11) NOT NULL,
  `ID_VIAJE` int(11) NOT NULL,
  `id_hotel` int(11) NOT NULL,
  `NUMPERSONAS` int(11) DEFAULT NULL,
  `Precio_total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Historial_Itinerario`
--

CREATE TABLE `Historial_Itinerario` (
  `id` int(11) NOT NULL,
  `Id_historial_viajes` int(11) NOT NULL,
  `id_itnerario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) DEFAULT NULL,
  `ID_CIUDAD` int(11) NOT NULL,
  `ID_TIPOHOTEL` int(11) NOT NULL,
  `PRECIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `hotel`
--

INSERT INTO `hotel` (`ID`, `NOMBRE`, `ID_CIUDAD`, `ID_TIPOHOTEL`, `PRECIO`) VALUES
(1, 'silken al-andalus palace', 1, 1, 70.47),
(2, 'lukanda hospec', 1, 3, 85),
(3, 'hotel con curro', 2, 1, 79),
(4, 'terraza del limonar', 2, 4, 21.6),
(5, 'hotel cordoba center', 3, 1, 67.5),
(6, 'plaza de las tendillas', 3, 6, 23),
(7, 'hotel saray', 4, 1, 70),
(8, 'camping reina isabel', 4, 7, 32.7),
(9, 'barcelo cabo de gata', 5, 1, 81),
(10, 'san miguel playa almeria', 5, 10, 85.5),
(11, 'hotel francia y paris ', 6, 1, 68),
(12, 'hostal casa nautilus', 6, 3, 45),
(13, 'hotel condestable iranzo', 7, 1, 75),
(14, 'cabaña garrote gordo', 7, 7, 75.45),
(15, 'exe tartessos', 8, 1, 70.66),
(16, 'apartamentos centro paseo mari', 8, 6, 95),
(17, 'pura vida pirineos', 9, 1, 55),
(18, 'hotel la casueña', 9, 9, 100),
(19, 'el mudayyan', 10, 1, 35),
(20, 'apartamento alcaraz', 10, 8, 70.2),
(21, 'silken reino de aragon', 11, 1, 75),
(22, 'sabinas el pilar', 11, 2, 72),
(23, 'parador de corias ', 12, 1, 73.95),
(24, 'camping cudillero', 12, 7, 70.4),
(25, 'sands beach resort', 13, 10, 27),
(26, 'hotel el tejar', 13, 1, 79),
(27, 'sercotel bahia suites ', 14, 1, 53.55),
(28, 'le petit boutique ', 14, 9, 55),
(29, 'parador de albacete', 15, 1, 65.45),
(30, 'villa rossi', 15, 6, 35),
(31, 'hotel santa cecilia', 16, 1, 75.3),
(32, 'vallehermoso', 16, 4, 69.5),
(33, 'hotel victoria', 17, 1, 51),
(34, 'camping caravaning cuenca ', 17, 7, 70),
(35, 'casa rural don rosendo', 18, 8, 33),
(36, 'hotel pax guadalajara', 18, 1, 81.67),
(37, 'eurostars toledo', 19, 1, 59),
(38, 'apartamento el pozo amargo ', 19, 6, 44.1),
(39, 'palacio de los velada ', 20, 1, 55.8),
(40, 'casa rural la tenada', 20, 2, 100),
(41, 'crisol puerta de burgos ', 21, 1, 50),
(42, 'camping fuentes blancas', 21, 7, 54),
(43, 'hotel real colegiatas san isid', 22, 1, 65),
(44, 'palacio real hostel', 22, 10, 19),
(45, 'hotel don rodrigo', 23, 1, 69),
(46, 'alda palencia catedral', 23, 6, 57),
(47, 'gran hotel corona sol', 24, 1, 40.5),
(48, 'hospedium plaza mayor salamanc', 24, 4, 55),
(49, 'exe casa de los linajes ', 25, 1, 60),
(50, 'el silencio boutique room', 25, 9, 63.83),
(51, 'hotel alda ciudad de soria', 26, 1, 42.75),
(52, 'camping fuente de la teja', 26, 7, 22),
(53, 'hotel mozart', 27, 1, 65),
(54, 'ferrari suites', 27, 6, 74.61),
(55, 'ares hotel ', 28, 1, 61.75),
(56, 'casa marta', 28, 5, 53),
(57, 'imperial tarraco 4', 29, 1, 94),
(58, 'villa garden', 29, 3, 158),
(59, 'barcelo sants ', 30, 1, 103.9),
(60, 'Jardinets De Gràcia by The 5ve', 30, 6, 141.5),
(61, 'hotel estamariu', 31, 1, 77.56),
(62, 'casa vacacional camarasa ', 31, 2, 55),
(68, 'hotel nord 1901', 32, 1, 101.64),
(69, 'bypillow the bloom', 32, 1, 45.66),
(70, 'port alicante ', 33, 10, 68.92),
(71, 'les monges palace ', 33, 9, 58),
(72, 'intur castellon', 34, 1, 60),
(73, 'iberflat apartamentos trinidad', 34, 6, 63),
(74, 'ilunion aqua 4', 35, 1, 84),
(75, 'camping playa tropicana', 35, 7, 21.5),
(76, 'hotel badajoz center', 36, 1, 77),
(77, 'pension galicia', 36, 2, 35),
(78, 'gran hotel don manuel', 37, 1, 70),
(79, 'apartamentos turisticos majma', 37, 6, 49),
(80, 'hotel riazor ', 38, 1, 69),
(81, 'albergue cerceda', 38, 4, 95),
(82, 'hotel torre de nuñez', 39, 1, 48),
(83, 'sanforo apt', 39, 3, 40),
(84, 'carris cardenal quevedo', 40, 1, 70),
(85, 'a casiña casa rural ', 41, 8, 63),
(86, 'gran sagitario', 42, 1, 100),
(87, 'hostal rosell boutique', 42, 3, 56.75),
(88, 'hotel plaza de la paz', 43, 1, 65),
(89, 'hostal lobrega', 43, 3, 51),
(90, 'ilunion alcala norte', 44, 1, 87.72),
(91, 'moral aapartamentos malasaña', 44, 6, 108),
(92, 'hotel nelva ', 45, 1, 67.5),
(93, 'puerto de mazarron', 45, 2, 37),
(94, 'hotel ciudadela pamplona', 46, 1, 57.92),
(95, 'camping etxarri', 46, 7, 53.8),
(96, 'nirea hotel', 47, 1, 70),
(97, 'kora green city ', 47, 6, 69),
(98, 'catalonia gran via', 48, 1, 90),
(99, 'casa rural vizcalla ', 48, 8, 53),
(100, 'hotel tres rayes san sebastian', 49, 1, 55.48),
(101, 'hotel villa katalina by intur', 49, 1, 63);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itinerario`
--

CREATE TABLE `itinerario` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Cometario` varchar(255) DEFAULT NULL,
  `puntuacion` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Itinerario_excursiones`
--

CREATE TABLE `Itinerario_excursiones` (
  `id` int(11) NOT NULL,
  `Id_itinerario` int(11) NOT NULL,
  `id_excursion` int(11) NOT NULL
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

--
-- Volcado de datos para la tabla `terreno`
--

INSERT INTO `terreno` (`ID`, `TIPO`) VALUES
(1, 'llanura'),
(2, 'meseta'),
(3, 'montañoso-pie'),
(4, 'montañoso-ladera'),
(5, 'montañoso-cima'),
(6, 'montañoso-valle'),
(7, 'sierra'),
(8, 'cordillera'),
(9, 'depresion'),
(10, 'colina'),
(11, 'golfo'),
(12, 'bahia'),
(13, 'cala'),
(14, 'archipielago'),
(15, 'cabo'),
(16, 'isla'),
(17, 'peninsula'),
(18, 'desierto'),
(19, 'bosque'),
(20, 'volcanica'),
(21, 'costa '),
(22, 'urbano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohotel`
--

CREATE TABLE `tipohotel` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipohotel`
--

INSERT INTO `tipohotel` (`ID`, `TIPO`) VALUES
(1, 'hotel'),
(2, 'casa'),
(3, 'hostal'),
(4, 'albergue'),
(5, 'casa-huespedes'),
(6, 'apartamento'),
(7, 'camping'),
(8, 'alojamiento-rural'),
(9, 'alojamiento-boutique'),
(10, 'alojamiento-resort');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transporte`
--

CREATE TABLE `transporte` (
  `ID` int(11) NOT NULL,
  `TIPO` varchar(30) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `transporte`
--

INSERT INTO `transporte` (`ID`, `TIPO`, `PRECIO`) VALUES
(1, 'tranvia', 1.6),
(2, 'autobus', 1.79),
(3, 'uber', 20.5),
(4, 'taxi', 22),
(5, 'avion', 40.49),
(6, 'tren', 20),
(7, 'metro', 3.4);

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
  `ID_CIUDAD` int(11) NOT NULL,
  `IDA` date NOT NULL,
  `VUELTA` date NOT NULL,
  `ID_TERRENO` int(11) NOT NULL,
  `ID_TRANSPORTE` int(11) NOT NULL,
  `PUNTUACION` double DEFAULT NULL,
  `descripcion` varchar(255) NOT NULL,
  `planes` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `viajes`
--

INSERT INTO `viajes` (`ID`, `ID_CIUDAD`, `IDA`, `VUELTA`, `ID_TERRENO`, `ID_TRANSPORTE`, `PUNTUACION`, `descripcion`, `planes`) VALUES
(1, 1, '0000-00-00', '0000-00-00', 22, 2, NULL, 'Viaje a sevilla con alojamiento en el hotel silken al-andalus palace en un terreno urbano y como medio de transporte autobuses de la empresa EMT', 't'),
(2, 1, '0000-00-00', '0000-00-00', 22, 4, NULL, 'Viaje a sevilla con alojamiento en el hotel lukanda hospec en un terreno urbano y como medio de transporte taxis de la empresa radio taxi giralda', 't');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viajesimagenes`
--

CREATE TABLE `viajesimagenes` (
  `ID` int(11) NOT NULL,
  `id_viajes` int(11) NOT NULL,
  `URL` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `viajesimagenes`
--

INSERT INTO `viajesimagenes` (`ID`, `id_viajes`, `URL`) VALUES
(1, 0, 'img/viajes/andalucia/almeria/cabo-gata-almeria.webp'),
(2, 0, 'img/viajes/andalucia/almeria/conjunto-alcazaba-almeria.jpg'),
(3, 0, 'img/viajes/andalucia/almeria/minihollywood-almeria.jpg'),
(4, 0, 'img/viajes/andalucia/cadiz/catedral-caddiz.jpg'),
(5, 0, 'img/viajes/andalucia/cadiz/playa-victoria-cadiz.jpg'),
(6, 0, 'img/viajes/andalucia/cadiz/torre-tavira-cadiz.avif'),
(7, 0, 'img/viajes/andalucia/cordoba/centro-historico-cordoba.jpg'),
(8, 0, 'img/viajes/andalucia/cordoba/juderia.cordoba.jpg'),
(9, 0, 'img/viajes/andalucia/cordoba/mezquita-cordoba.avif'),
(10, 0, 'img/viajes/andalucia/granada/alambra-granada.jpg'),
(11, 0, 'img/viajes/andalucia/granada/albayzin-granada.jpg'),
(12, 0, 'img/viajes/andalucia/granada/mirador-de-san-nicolas_granada.jpg'),
(13, 0, 'img/viajes/andalucia/huelva/barrio-obrero-huelva-jpg'),
(14, 0, 'img/viajes/andalucia/huelva/muelle-tinto-huelva.jpg'),
(15, 0, 'img/viajes/andalucia/huelva/plaza-monjas-huelva.jpg'),
(16, 0, 'img/viajes/andalucia/jaen/catedral-jaen-webp'),
(17, 0, 'img/viajes/andalucia/jaen/rio-borosa-jaen.jpg'),
(18, 0, 'img/viajes/andalucia/jaen/sierra-cazorla-jaen.jpg'),
(19, 0, 'img/viajes/andalucia/malaga/alcazaba-malaga.webp'),
(20, 0, 'img/viajes/andalucia/malaga/castillo-gibralfaro-malaga.jpg'),
(21, 0, 'img/viajes/andalucia/malaga/catedral-malaga.jpg'),
(22, 0, 'img/viajes/andalucia/sevilla/catedral-sevilla.jpg'),
(23, 0, 'img/viajes/andalucia/sevilla/plaza-españa-sevilla.webp'),
(24, 0, 'img/viajes/andalucia/sevilla/real-alcaraz-sevilla.jpg'),
(25, 0, 'img/viajes/aragon/huesca/muralla-finestres-huesca.jpeg'),
(26, 0, 'img/viajes/aragon/huesca/parque-ordesa-huesca.jpg'),
(27, 0, 'img/viajes/aragon/huesca/selva-oza-huesca.jpeg'),
(28, 0, 'img/viajes/aragon/teruel/amantes-teruel.jpeg'),
(29, 0, 'img/viajes/aragon/teruel/museo-minero-teruel.webp'),
(30, 0, 'img/viajes/aragon/teruel/parrizal-teruel.webp'),
(31, 0, 'img/viajes/aragon/zaragoza/aljaferia-zaragoza.jpg'),
(32, 0, 'img/viajes/aragon/zaragoza/basilica-pilar-zaragoza.jpg'),
(33, 0, 'img/viajes/aragon/zaragoza/seo-salvador-zaragoza.jpg'),
(34, 0, 'img/viajes/castilla-leon/avila/catedral-avila.jpg'),
(35, 0, 'img/viajes/castilla-leon/avila/murallas-avila.jpg'),
(36, 0, 'img/viajes/castilla-leon/avila/postes-avila.jpg'),
(37, 0, 'img/viajes/castilla-leon/burgos/Cartuja-Miraflores-burgos.webp'),
(38, 0, 'img/viajes/castilla-leon/burgos/catedral-burgos.webp'),
(39, 0, 'img/viajes/castilla-leon/burgos/monasterio-de-las-huelgas-burgos.jpg'),
(40, 0, 'img/viajes/castilla-leon/leon/arco-leon.jpg'),
(41, 0, 'img/viajes/castilla-leon/leon/catedral-basilica-leon.jpg'),
(43, 0, 'img/viajes/castilla-leon/leon/templo-expiatorio-leon.jpg'),
(44, 0, 'img/viajes/castilla-leon/palencia/catedral-palencia.webp'),
(45, 0, 'img/viajes/castilla-leon/palencia/cristo-otero-palencia.jpg'),
(46, 0, 'img/viajes/castilla-leon/palencia/ruta-pantanos-palencia.jpg'),
(47, 0, 'img/viajes/castilla-leon/salamanca/catedral-vieja-salamanca.webp'),
(48, 0, 'img/viajes/castilla-leon/salamanca/leronimus-salamanca.jpeg'),
(49, 0, 'img/viajes/castilla-leon/salamanca/plaza-mayor-de-salamanca.jpg'),
(50, 0, 'img/viajes/castilla-leon/segovia/alcaraz-segovia.jpg'),
(51, 0, 'img/viajes/castilla-leon/segovia/Aqueduct-de-Segovia.jpg'),
(52, 0, 'img/viajes/castilla-leon/segovia/catedral-Segovia.jpg'),
(53, 0, 'img/viajes/castilla-leon/soria/cañon-rio-lobo-soria.jpeg'),
(54, 0, 'img/viajes/castilla-leon/soria/fuentona-soria.jpeg'),
(55, 0, 'img/viajes/castilla-leon/soria/laguna-negra-soria.jpg'),
(56, 0, 'img/viajes/castilla-leon/valladolid/iglesia-san-pablo-valladolid.webp'),
(57, 0, 'img/viajes/castilla-leon/valladolid/plaza-mayor-valladolid.webp'),
(58, 0, 'img/viajes/castilla-leon/valladolid/santa-maria-antgua-valladolid.jpg'),
(59, 0, 'img/viajes/castilla-leon/zamora/catedral-de-zamora.jpg'),
(60, 0, 'img/viajes/castilla-leon/zamora/iglesia-santa-maria-la-nueva-zamora.jpg'),
(61, 0, 'img/viajes/castilla-leon/zamora/parque-sanabria-zamora.jpg'),
(62, 0, 'img/viajes/castilla-mancha/albacete/bodegas-aldonza-albacete.jpg'),
(63, 0, 'img/viajes/castilla-mancha/albacete/nacimiento-rio-mundo-zamora.jpg'),
(64, 0, 'img/viajes/castilla-mancha/albacete/pasaje-lodares-zamora.jpg'),
(65, 0, 'img/viajes/castilla-mancha/ciudad-real/parque-cabañeros-ciudad-real.jpg'),
(66, 0, 'img/viajes/castilla-mancha/ciudad-real/parque-gasset-ciudad-real.jpg'),
(67, 0, 'img/viajes/castilla-mancha/ciudad-real/san-pedro-ciudad-real.jpg'),
(68, 0, 'img/viajes/castilla-mancha/cuenca/catedral-cuenca.jpg'),
(69, 0, 'img/viajes/castilla-mancha/cuenca/ciudad-amurallada-cuenca.jpg'),
(70, 0, 'img/viajes/castilla-mancha/cuenca/puente-san-pablo-cuenca.jpg'),
(71, 0, 'img/viajes/castilla-mancha/guadalajara/atienza-guadalajara.jpg'),
(72, 0, 'img/viajes/castilla-mancha/guadalajara/campillo-de-ranas-guadalajara.jpg'),
(73, 0, 'img/viajes/castilla-mancha/guadalajara/campos-lavanda-guadalajara.jpg'),
(74, 0, 'img/viajes/castilla-mancha/toledo/mirador-valle-toledo.jpg'),
(75, 0, 'img/viajes/castilla-mancha/toledo/primada-toledo.jpg'),
(76, 0, 'img/viajes/castilla-mancha/toledo/san-juan-de-los-reyes-toledo.jpg'),
(77, 0, 'img/viajes/cataluña/barcelona/basilica-sagrada-familia-barcelona.webp'),
(78, 0, 'img/viajes/cataluña/barcelona/palau-musica-barcelona.jpg'),
(79, 0, 'img/viajes/cataluña/barcelona/parque-guell-barcelona.jpg'),
(80, 0, 'img/viajes/cataluña/girona/baños-arabes.girona.jpg'),
(81, 0, 'img/viajes/cataluña/girona/catedral-girona.jpg'),
(82, 0, 'img/viajes/cataluña/girona/paseo-muralla-girona.jpg'),
(83, 0, 'img/viajes/cataluña/lerida/castillo-templario-lerida.png'),
(84, 0, 'img/viajes/cataluña/lerida/parque-mitjana-lerida.jpg'),
(85, 0, 'img/viajes/cataluña/lerida/seu-vella-lerida.jpg'),
(86, 0, 'img/viajes/cataluña/tarragona/anfiteatro-tarraco-tarragona.jpg'),
(87, 0, 'img/viajes/cataluña/tarragona/catedral-tarragona.jpg'),
(88, 0, 'img/viajes/cataluña/tarragona/circo-romano-tarragona.avif'),
(89, 0, 'img/viajes/ceuta-c/ceuta/casa-dragones-ceuta.jpg'),
(90, 0, 'img/viajes/ceuta-c/ceuta/Las-murallas-Reales-de-Ceuta.jpg'),
(91, 0, 'img/viajes/ceuta-c/ceuta/parque-maritimo-ceuta.jpg'),
(92, 0, 'img/viajes/comunidad-cantabria/cantabria/el-capricho-de-gaudi-cantabria.jpg'),
(93, 0, 'img/viajes/comunidad-cantabria/cantabria/palacio-magdalena-cantabria.webp'),
(94, 0, 'img/viajes/comunidad-cantabria/cantabria/parque-de-cabo-mayor-cantabria.jpg'),
(95, 0, 'img/viajes/comunidad-madrid/madrid/gran-via-madrid.jpeg'),
(96, 0, 'img/viajes/comunidad-madrid/madrid/palacio-real-madrid-jpg'),
(97, 0, 'img/viajes/comunidad-madrid/madrid/plaza-mayor-madrid.jpg'),
(98, 0, 'img/viajes/comunidad-navarra/navarra/palacio-olite-fitero-navarra.jpg'),
(99, 0, 'img/viajes/comunidad-navarra/navarra/selva-irati-navarra.jpg'),
(100, 0, 'img/viajes/comunidad-navarra/navarra/ujue-navarra.jpg'),
(101, 0, 'img/viajes/comunidad-valenciana/alicante/explanada-alicante.jpg'),
(102, 0, 'img/viajes/comunidad-valenciana/alicante/plaza-luceros-alicante.jpg'),
(103, 0, 'img/viajes/comunidad-valenciana/alicante/puerto-alicante.jpg'),
(104, 0, 'img/viajes/comunidad-valenciana/castellon/aguas-termales-montanejos-castellon.webp'),
(105, 0, 'img/viajes/comunidad-valenciana/castellon/casco-antiguo-peñiscola-castellon.jpg'),
(106, 0, 'img/viajes/comunidad-valenciana/castellon/murallas-morella-castellon.jpg'),
(107, 0, 'img/viajes/comunidad-valenciana/valencia/aciudad-artes-ciencias-valencia.avif'),
(108, 0, 'img/viajes/comunidad-valenciana/valencia/lonja-valencia.jpg'),
(109, 0, 'img/viajes/comunidad-valenciana/valencia/miguelete-catedral-valencia.jpg'),
(110, 0, 'img/viajes/extremadura/badajoz/alcazaba-badajoz.webp'),
(111, 0, 'img/viajes/extremadura/badajoz/plaza-alta-badajoz.jpg'),
(112, 0, 'img/viajes/extremadura/badajoz/puerta-palmas-badajoz.jpg'),
(113, 0, 'img/viajes/extremadura/caceres/arco-estrella-caceres.jpg'),
(114, 0, 'img/viajes/extremadura/caceres/plaza-mayor-caceres.jpg'),
(115, 0, 'img/viajes/extremadura/caceres/torre-bujaco-caceres.jpg'),
(116, 0, 'img/viajes/galicia/coruña/monte-san-pedro-coruña.jpg'),
(117, 0, 'img/viajes/galicia/coruña/plaza-maria-pita-coruña.png'),
(118, 0, 'img/viajes/galicia/coruña/Torre-de-Hercules-coruña.jpg'),
(119, 0, 'img/viajes/galicia/lugo/catedral-lugo.webp'),
(120, 0, 'img/viajes/galicia/lugo/las-murallas-romanas-lugo.jpg'),
(121, 0, 'img/viajes/galicia/lugo/museoprovinciallugo.jpg'),
(122, 0, 'img/viajes/galicia/ourense/catedral-san-martin-ourense.webp'),
(123, 0, 'img/viajes/galicia/ourense/plaza-mayor-ourense.jpg'),
(124, 0, 'img/viajes/galicia/ourense/puente-romano.jpg'),
(125, 0, 'img/viajes/galicia/pontevedra/castro-santa-tegra-pontevedra.jpg'),
(126, 0, 'img/viajes/galicia/pontevedra/heroes-ccombarro-pontevedra.webp'),
(127, 0, 'img/viajes/galicia/pontevedra/iglesia-virgen-peregrina-pontevedra.jpg'),
(128, 0, 'img/viajes/islas-baleares/baleares/alcudia-old-town-baleares.jpg'),
(129, 0, 'img/viajes/islas-baleares/baleares/bellver-castle-baleares.jpg'),
(130, 0, 'img/viajes/islas-baleares/baleares/catedral-mallorca-baleares.avif'),
(131, 0, 'img/viajes/islas-canarias/canarias/playa-maspaloma-canarias.avif'),
(132, 0, 'img/viajes/islas-canarias/canarias/timanfaya-canarias.jpg'),
(133, 0, 'img/viajes/islas-canarias/canarias/volvan-teide-canarias.webp'),
(134, 0, 'img/viajes/la-rioja/rioja/ezcaray-la-rioja.webp'),
(135, 0, 'img/viajes/la-rioja/rioja/monasterio-yuso-la-rioja'),
(136, 0, 'img/viajes/la-rioja/rioja/plaza-del-mercado-logroño-la-rioja.webp'),
(137, 0, 'img/viajes/melilla-c/melilla/melilla_la_vieja.webp'),
(138, 0, 'img/viajes/melilla-c/melilla/parque-hernandez-melilla.jpg'),
(139, 0, 'img/viajes/melilla-c/melilla/triangulo-de-oro-melilla.jpg'),
(140, 0, 'img/viajes/pais-vasco/alava/bodega-baigorri-alava.jpg'),
(141, 0, 'img/viajes/pais-vasco/alava/bodega-solar-alava'),
(142, 0, 'img/viajes/pais-vasco/alava/catedral-santa-maria-alava.jpg'),
(143, 0, 'img/viajes/pais-vasco/guipuzcoa/hordarribia-guipuzcoa.webp'),
(144, 0, 'img/viajes/pais-vasco/guipuzcoa/monte-urgull-guipuzcoa.webp'),
(145, 0, 'img/viajes/pais-vasco/guipuzcoa/peine-viento-guipuzcoa.jpg'),
(146, 0, 'img/viajes/pais-vasco/vizcalla/casco-viejo-vizcaya.jpg'),
(147, 0, 'img/viajes/pais-vasco/vizcalla/plaza-nueva-vizcaya.jpg'),
(148, 0, 'img/viajes/pais-vasco/vizcalla/puente-colgante-vizcaya.jpg'),
(149, 0, 'img/viajes/principado-asturias/asturias/lago-covadonga-asturias.jpg'),
(150, 0, 'img/viajes/principado-asturias/asturias/museo-molinos-mazonovo-asturias.jpg'),
(151, 0, 'img/viajes/principado-asturias/asturias/santa-maria-naranco-asturias.jpg'),
(152, 0, 'img/viajes/region-murcia/murcia/casino-murcia.jpg'),
(153, 0, 'img/viajes/region-murcia/murcia/catedral-santa-maria-murcia.jpg'),
(154, 0, 'img/viajes/region-murcia/murcia/plaza-cardenal.murcia.jpg');

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
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `historialviajes`
--
ALTER TABLE `historialviajes`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `HISTORIALVIAJES_ibfk_1` (`ID_USUARIO`),
  ADD KEY `HISTORIALVIAJES_ibfk_2` (`ID_VIAJE`),
  ADD KEY `HISTORIALVIAJES_ibfk_3` (`id_hotel`);

--
-- Indices de la tabla `Historial_Itinerario`
--
ALTER TABLE `Historial_Itinerario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `lbk_1` (`Id_historial_viajes`),
  ADD KEY `ibfk_2` (`id_itnerario`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_TIPOHOTEL` (`ID_TIPOHOTEL`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `itinerario`
--
ALTER TABLE `itinerario`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `Itinerario_excursiones`
--
ALTER TABLE `Itinerario_excursiones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Itenrario_excursion_lsbk1` (`id_excursion`),
  ADD KEY `Itenrario_excursion_lsbk2` (`Id_itinerario`);

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
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`),
  ADD KEY `ID_TERRENO` (`ID_TERRENO`),
  ADD KEY `ID_TRANSPORTE` (`ID_TRANSPORTE`);

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
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=149;

--
-- AUTO_INCREMENT de la tabla `historialviajes`
--
ALTER TABLE `historialviajes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Historial_Itinerario`
--
ALTER TABLE `Historial_Itinerario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hotel`
--
ALTER TABLE `hotel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de la tabla `itinerario`
--
ALTER TABLE `itinerario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Itinerario_excursiones`
--
ALTER TABLE `Itinerario_excursiones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `terreno`
--
ALTER TABLE `terreno`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `tipohotel`
--
ALTER TABLE `tipohotel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `transporte`
--
ALTER TABLE `transporte`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `viajes`
--
ALTER TABLE `viajes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `viajesimagenes`
--
ALTER TABLE `viajesimagenes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=155;

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
  ADD CONSTRAINT `EXCURSION_ibfk_2` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudades` (`ID`);

--
-- Filtros para la tabla `historialviajes`
--
ALTER TABLE `historialviajes`
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuarios` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_2` FOREIGN KEY (`ID_VIAJE`) REFERENCES `viajes` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `HISTORIALVIAJES_ibfk_3` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`ID`);

--
-- Filtros para la tabla `Historial_Itinerario`
--
ALTER TABLE `Historial_Itinerario`
  ADD CONSTRAINT `ibfk_2` FOREIGN KEY (`id_itnerario`) REFERENCES `itinerario` (`ID`),
  ADD CONSTRAINT `lbk_1` FOREIGN KEY (`Id_historial_viajes`) REFERENCES `historialviajes` (`ID`);

--
-- Filtros para la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD CONSTRAINT `HOTEL_ibfk_1` FOREIGN KEY (`ID_TIPOHOTEL`) REFERENCES `tipohotel` (`ID`),
  ADD CONSTRAINT `HOTEL_ibfk_3` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudades` (`ID`);

--
-- Filtros para la tabla `Itinerario_excursiones`
--
ALTER TABLE `Itinerario_excursiones`
  ADD CONSTRAINT `Itenrario_excursion_lsbk1` FOREIGN KEY (`id_excursion`) REFERENCES `excursion` (`ID`),
  ADD CONSTRAINT `Itenrario_excursion_lsbk2` FOREIGN KEY (`Id_itinerario`) REFERENCES `itinerario` (`ID`);

--
-- Filtros para la tabla `viajes`
--
ALTER TABLE `viajes`
  ADD CONSTRAINT `VIAJES_ibfk_2` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudades` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_3` FOREIGN KEY (`ID_TERRENO`) REFERENCES `terreno` (`ID`),
  ADD CONSTRAINT `VIAJES_ibfk_6` FOREIGN KEY (`ID_TRANSPORTE`) REFERENCES `transporte` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
