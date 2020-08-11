-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-08-2020 a las 17:53:37
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_sistema_de_venta`
--
CREATE DATABASE IF NOT EXISTS `bd_sistema_de_venta` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_sistema_de_venta`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `dni_cliente` int(11) DEFAULT NULL,
  `nombres_cliente` varchar(100) DEFAULT NULL,
  `direccion_cliente` varchar(100) DEFAULT NULL,
  `estado_cliente` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni_cliente`, `nombres_cliente`, `direccion_cliente`, `estado_cliente`) VALUES
(1, 84756746, 'Juan Alberto Rivero', 'Los Alamos 345', 'Activo'),
(2, 35674895, 'Camila Castillo', 'Avenida Caruciena Quinta 4', 'Activo'),
(3, 47533122, 'Luisana Avellaneda', 'Calle 42 con calles 24 y 25', 'Activo'),
(4, 55788943, 'Carlos Picatierra', 'Los Cerrajones Parcela 10', 'Activo'),
(5, 943632786, 'Luis Tortuga', 'Ciudad Comercial Las Trinitarias', 'Activo'),
(6, 22455576, 'Carlos Melendez', 'Los Ruices Catia La Mar', 'Activo'),
(7, 23456876, 'Camilo Castrejo', 'Duaraca Via Tarabana 2', 'Activo'),
(8, 98769876, 'Nicole Picolina', 'Cancagua Terreno 3', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ventas`
--

CREATE TABLE `detalle_ventas` (
  `id_detalle_ventas` int(11) NOT NULL,
  `cantidad_ventas` int(11) DEFAULT NULL,
  `precio_ventas` double DEFAULT NULL,
  `id_ventas` int(11) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detalle_ventas`
--

INSERT INTO `detalle_ventas` (`id_detalle_ventas`, `cantidad_ventas`, `precio_ventas`, `id_ventas`, `id_producto`) VALUES
(1, 5, 20, 1, 5),
(3, 5, 18, 16, 3),
(4, 2, 18, 17, 5),
(7, 5, 18, 21, 1),
(8, 5, 18, 22, 1),
(9, 5, 18, 23, 2),
(10, 5, 29, 24, 6),
(11, 2, 29, 25, 6),
(12, 1, 13, 26, 10),
(13, 2, 22, 26, 11),
(14, 1, 12, 26, 9),
(15, 4, 16, 27, 4),
(16, 3, 18, 28, 3),
(17, 1, 29, 28, 6),
(18, 2, 10, 28, 8),
(19, 1, 12, 28, 9),
(20, 2, 22, 28, 11),
(21, 1, 32, 29, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `nombres_producto` varchar(100) DEFAULT NULL,
  `precio_producto` double DEFAULT NULL,
  `stock_producto` int(11) DEFAULT NULL,
  `estado_producto` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombres_producto`, `precio_producto`, `stock_producto`, `estado_producto`) VALUES
(1, 'Macedonia', 18, 25, 'Stock'),
(2, 'Despelucada', 18, 10, 'Stock'),
(3, 'Marqueza de Nuez', 18, 7, 'Stock'),
(4, 'Tortas Feías', 16, 4, 'Stock'),
(5, 'Fría de Profiteroles', 18, 7, 'Stock'),
(6, 'Alta de Brownie Rellena', 29, 2, 'Stock'),
(7, 'Torta de Brownie', 16, 5, 'Stock'),
(8, 'Ponque Marmoleado', 10, 5, 'Stock'),
(9, 'Ponque Arequipe', 12, 6, 'Stock'),
(10, 'Torta Ruedas de Piña', 13, 2, 'Stock'),
(11, 'Red Velvert', 22, 4, 'Stock'),
(12, 'Torta de Zanahoria', 20, 5, 'Stock'),
(13, 'Torta MilHojas', 32, 2, 'Stock');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `id_vendedor` int(11) NOT NULL,
  `dni_vendedor` varchar(100) DEFAULT NULL,
  `nombres_vendedor` varchar(100) DEFAULT NULL,
  `telefono_vendedor` varchar(100) DEFAULT NULL,
  `estado_vendedor` varchar(100) DEFAULT NULL,
  `user_vendedor` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`id_vendedor`, `dni_vendedor`, `nombres_vendedor`, `telefono_vendedor`, `estado_vendedor`, `user_vendedor`) VALUES
(1, '12345678', 'empleado 01', '11111111111', 'Activo', 'emp01'),
(2, '87654321', 'empleado 02', '22222222222', 'Activo', 'emp02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id_ventas` int(11) NOT NULL,
  `numero_ventas` int(11) DEFAULT NULL,
  `fecha_ventas` varchar(100) DEFAULT NULL,
  `monto_venta` double DEFAULT NULL,
  `estado_venta` varchar(100) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_vendedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_ventas`, `numero_ventas`, `fecha_ventas`, `monto_venta`, `estado_venta`, `id_cliente`, `id_vendedor`) VALUES
(1, 1, '07-09-2020', 100, 'Activa', 1, 1),
(16, 2, '8-8-2020', 90, 'Activa', 3, 1),
(17, 3, '8-8-2020', 36, 'Activa', 3, 1),
(20, 4, '9-8-2020', 0, 'Activa', 3, 2),
(21, 5, '9-8-2020', 90, 'Activa', 3, 2),
(22, 6, '9-8-2020', 90, 'Activa', 3, 2),
(23, 7, '9-8-2020', 90, 'Activa', 7, 2),
(24, 8, '9-8-2020', 145, 'Activa', 2, 1),
(25, 9, '9-8-2020', 58, 'Activa', 6, 1),
(26, 10, '9-8-2020', 69, 'Activa', 6, 1),
(27, 11, '9-8-2020', 64, 'Activa', 2, 1),
(28, 12, '9-8-2020', 159, 'Activa', 5, 2),
(29, 13, '9-8-2020', 32, 'Activa', 7, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD PRIMARY KEY (`id_detalle_ventas`),
  ADD KEY `detalle_ventas_ibfk_1` (`id_ventas`),
  ADD KEY `detalle_ventas_ibfk_2` (`id_producto`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id_vendedor`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id_ventas`),
  ADD KEY `ventas_ibfk_1` (`id_cliente`),
  ADD KEY `ventas_ibfk_2` (`id_vendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  MODIFY `id_detalle_ventas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id_vendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id_ventas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`id_ventas`) REFERENCES `ventas` (`id_ventas`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedor` (`id_vendedor`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
