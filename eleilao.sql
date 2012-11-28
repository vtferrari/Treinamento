-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.27
-- Versão do PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `eleilao`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `lance`
--

CREATE TABLE IF NOT EXISTS `lance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `valor_lance` float NOT NULL,
  `data_lance` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Extraindo dados da tabela `lance`
--

INSERT INTO `lance` (`id`, `id_usuario`, `id_produto`, `valor_lance`, `data_lance`) VALUES
(1, 1, 1, 10, '2012-11-21 01:44:31'),
(2, 1, 1, 10, '2012-11-21 00:00:00'),
(3, 1, 1, 20, '2012-11-21 00:00:00'),
(4, 1, 1, 20, '2012-11-21 00:00:00'),
(5, 1, 1, 10, '2012-11-21 00:00:00'),
(6, 1, 1, 10, '2012-11-21 00:00:00'),
(7, 1, 1, 20, '2012-11-21 00:00:00'),
(8, 1, 1, 10, '2012-11-21 00:00:00'),
(9, 1, 1, 10, '2012-11-21 13:28:20'),
(10, 1, 1, 100, '2012-11-21 13:28:48'),
(11, 1, 2, 10, '2012-11-21 13:29:11');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lote`
--

CREATE TABLE IF NOT EXISTS `lote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` tinyint(1) NOT NULL,
  `ativacao_tempo` datetime NOT NULL,
  `descricao` text NOT NULL,
  `limite_tempo` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `lote`
--

INSERT INTO `lote` (`id`, `ativo`, `ativacao_tempo`, `descricao`, `limite_tempo`) VALUES
(1, 1, '2012-11-22 20:17:09', '', '2012-11-24 08:22:22'),
(2, 1, '2012-11-21 16:08:11', '', '2012-11-23 03:00:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `valor_minimo` float(6,2) NOT NULL,
  `descricao` text NOT NULL,
  `image` varchar(255) NOT NULL,
  `id_lote` int(11) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `nome`, `valor_minimo`, `descricao`, `image`, `id_lote`, `ativo`) VALUES
(1, 'Produto de Teste', 225.00, 'Teste de produto para leilao', 'celular.jpg', 1, 1),
(2, 'Macaco Prego', 40.00, 'Um lindo macaco prego para de atazanar o resto da vida dele', 'mico.jpg', 1, 1),
(3, 'Caneta', 5.00, 'Exelente caneta com 4 cores de tintas', 'caneta.jpg', 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `cpf` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nivel` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `email`, `cpf`, `senha`, `nivel`) VALUES
(1, 'Vinicius Temoteo Ferrari', 'vtferrari@hotmail.com', '383.510.778-01', '123456', '0'),
(2, 'Tibere Silva de Lima', 'tiberepsl@hotmail.com', '999.999.999-99', '123456', 'admin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
