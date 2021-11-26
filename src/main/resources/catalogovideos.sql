-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Nov-2021 às 18:46
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `catalogovideos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtor`
--

CREATE TABLE `produtor` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `site_web` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtor`
--

INSERT INTO `produtor` (`id`, `nome`, `site_web`) VALUES
(1, 'Sony Pictures', 'https://www.sonypictures.com/'),
(2, 'WarnerBros', 'https://www.warnerbros.com/'),
(3, 'Columbia Pictures', NULL),
(4, 'Allspark Pictures', NULL),
(5, 'Sony Pictures', 'https://www.sonypictures.com/'),
(6, 'Paramount', 'https://www.paramountplus.com/br/?ftag=IPP-02-10aab1i&gclid=CjwKCAiAqIKNBhAIEiwAu_ZLDjODzKBg-u42giphT1-zNRbHc5SGy_THL77YNe5dLHY2uGt-9p-q4RoCn74QAvD_BwE'),
(7, 'Sony Pictures', 'https://www.sonypictures.com/'),
(8, 'Universal', 'https://www.universalpics.com.br/');

-- --------------------------------------------------------

--
-- Estrutura da tabela `videos`
--

CREATE TABLE `videos` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `descricao` varchar(3000) DEFAULT NULL,
  `imagem_url` varchar(500) DEFAULT NULL,
  `Produtor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `videos`
--

INSERT INTO `videos` (`id`, `nome`, `descricao`, `imagem_url`, `Produtor_id`) VALUES
(1, 'Salt', 'Filme de ação', 'https://assetsgn.nowonline.com.br/assets/p7937523_v_v8_ai.jpg', 1),
(2, 'Aquaman', 'Filme de Heroi!', 'http://www.amazon.com/images/M/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_FMjpg_UX1000_.jpg', 2),
(3, 'Meu nome é rádio', 'Um drama emocionante!', 'https://d1aid1ai1ve9l.cloudfront.net/capasm/2487.jpg', 3),
(4, 'Transformers', 'Filme de Heroi!', 'https://lojasaraiva.vteximg.com.br/arquivos/ids/1436929/1004945989.jpg?v=637003837809300000\\', 4),
(9, 'Rocky Balboa', 'Filme de superação.', 'https://miro.medium.com/max/640/1*4KVpHG8VpRwxhlGa7IuV2w.jpeg', 5),
(10, 'O Poderoso Chefão', 'Drama e máfia.', 'https://cdn.tlc-massive.com/shain/v1/dataservice/ResizeImage/$value?\r\n Format=%27png%27&Quality=85&ImageId=%27178626.png%27&ImageUrl=%27178626.png%27&EntityType=%27Item%27&EntityId=%276907%27&device=web_browser&subscriptions=Anonymous&Width=360&Height=540', 6),
(11, 'Mãos Talentosas', 'Um filme motivador.', 'https://portalwp.s3.amazonaws.com/wp-content/uploads/2020/08/13081655/13-filme-abre-jejum-de-daniel.jpg', 7),
(12, 'Orgulho e Preconceito', 'Drama e romance.', 'https://kbimages1-a.akamaihd.net/7b0e1631-9550-459a-9914-ab53b5fdb82e/1200/1200/False/orgulho-e-preconceito-19.jpg', 8);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `produtor`
--
ALTER TABLE `produtor`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `videos`
--
ALTER TABLE `videos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `produtor_id` (`Produtor_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtor`
--
ALTER TABLE `produtor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `videos`
--
ALTER TABLE `videos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `videos`
--
ALTER TABLE `videos`
  ADD CONSTRAINT `videos_ibfk_1` FOREIGN KEY (`produtor_id`) REFERENCES `produtor` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
