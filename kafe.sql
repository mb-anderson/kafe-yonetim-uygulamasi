-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3308
-- Üretim Zamanı: 12 Oca 2022, 20:56:44
-- Sunucu sürümü: 5.7.28
-- PHP Sürümü: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `kafe`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `gun_basi`
--

DROP TABLE IF EXISTS `gun_basi`;
CREATE TABLE IF NOT EXISTS `gun_basi` (
  `gun_basi_tarih` varchar(255) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `gun_basi`
--

INSERT INTO `gun_basi` (`gun_basi_tarih`, `id`) VALUES
('12/01/2022 16:57', 19),
('12/01/2022 14:51', 18),
('12/01/2022 14:43', 17),
('12/01/2022 14:43', 16),
('11/01/2022 21:25', 15),
('11/01/2022 21:25', 14),
('11/01/2022 21:24', 13),
('11/01/2022 21:23', 12);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `gun_sonu`
--

DROP TABLE IF EXISTS `gun_sonu`;
CREATE TABLE IF NOT EXISTS `gun_sonu` (
  `gun_sonu_tarih` varchar(255) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `gun_sonu`
--

INSERT INTO `gun_sonu` (`gun_sonu_tarih`, `id`) VALUES
('11/01/2022 21:25', 8),
('11/01/2022 21:25', 7),
('11/01/2022 21:25', 6),
('11/01/2022 21:23', 5),
('12/01/2022 14:43', 9),
('12/01/2022 14:43', 10),
('12/01/2022 14:51', 11);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa1`
--

DROP TABLE IF EXISTS `masa1`;
CREATE TABLE IF NOT EXISTS `masa1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa2`
--

DROP TABLE IF EXISTS `masa2`;
CREATE TABLE IF NOT EXISTS `masa2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa3`
--

DROP TABLE IF EXISTS `masa3`;
CREATE TABLE IF NOT EXISTS `masa3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa4`
--

DROP TABLE IF EXISTS `masa4`;
CREATE TABLE IF NOT EXISTS `masa4` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa5`
--

DROP TABLE IF EXISTS `masa5`;
CREATE TABLE IF NOT EXISTS `masa5` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa6`
--

DROP TABLE IF EXISTS `masa6`;
CREATE TABLE IF NOT EXISTS `masa6` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa7`
--

DROP TABLE IF EXISTS `masa7`;
CREATE TABLE IF NOT EXISTS `masa7` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `masa8`
--

DROP TABLE IF EXISTS `masa8`;
CREATE TABLE IF NOT EXISTS `masa8` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adet` varchar(255) NOT NULL,
  `siparis` varchar(255) NOT NULL,
  `tutar` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personeller`
--

DROP TABLE IF EXISTS `personeller`;
CREATE TABLE IF NOT EXISTS `personeller` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kullaniciAdi` varchar(255) NOT NULL,
  `adi` varchar(255) NOT NULL,
  `soyadi` varchar(255) NOT NULL,
  `sifre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Programı kullanacak kullanıcılar';

--
-- Tablo döküm verisi `personeller`
--

INSERT INTO `personeller` (`id`, `kullaniciAdi`, `adi`, `soyadi`, `sifre`) VALUES
(1, 'user', 'Mehmet Ali', 'Tahtacı', 'pass'),
(3, 'core_user', 'Mustafa Burak', 'Yücel', 'core_1234'),
(4, 'user1', 'mehmet', 'tahtacı', '123');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `urunler`
--

DROP TABLE IF EXISTS `urunler`;
CREATE TABLE IF NOT EXISTS `urunler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `urun_adi` varchar(255) NOT NULL,
  `cesitleri` varchar(255) NOT NULL,
  `fiyat` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `urunler`
--

INSERT INTO `urunler` (`id`, `urun_adi`, `cesitleri`, `fiyat`) VALUES
(2, 'Tarhana', 'Çorbalar', '12'),
(3, 'Et Döner', 'Dönerler', '45'),
(4, 'Mercimek', 'Çorbalar', '12'),
(6, 'Ezogelin', 'Çorbalar', '12'),
(7, 'Kıymalı Pide', 'Pideler', '18'),
(8, 'Kuşbaşılı', 'Pideler', '22'),
(9, 'Kaşarlı', 'Pideler', '20'),
(10, 'Kıymalı Kaşarlı', 'Pideler', '25'),
(11, 'Tavuk Döner', 'Dönerler', '18'),
(12, 'İşkembe', 'Çorbalar', '30'),
(14, 'Kelle Paça', 'Çorbalar', '40'),
(15, 'Et Sote', 'Et Yemekleri', '45'),
(16, 'Tavuk Sote', 'Et Yemekleri', '25'),
(17, 'Kuzu Pirzola', 'Et Yemekleri', '75'),
(18, 'Dana Pirzola', 'Et Yemekleri', '60'),
(19, 'Beyti', 'Kebaplar', '50'),
(20, 'Adana', 'Kebaplar', '1071'),
(21, 'Urfa', 'Kebaplar', '55'),
(22, 'Mantı', 'Çorbalar', '38'),
(23, 'Pastırma', 'Tatlılar', '38'),
(24, 'Nevzine', 'Tatlılar', '38'),
(25, 'Sucuk', 'Tatlılar', '38'),
(26, 'Ayran', 'İçecekler', '5'),
(27, 'Kola(ZARARLI)', 'İçecekler', '12'),
(28, 'Fanta(ZARARLI)', 'İçecekler', '12'),
(29, 'Lahmacun', 'Pideler', '12'),
(30, 'Alinazik Kebap', 'Kebaplar', '25'),
(31, 'Çoban', 'Salatalar', '20'),
(32, 'Mevsim', 'Salatalar', '15'),
(33, 'Baklava 2 Dilim', 'Tatlılar', '45');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
