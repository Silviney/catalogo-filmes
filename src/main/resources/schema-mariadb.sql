drop table if exists videos;

create table videos (
  id int primary key auto_increment,
  nome varchar(200) not null,
  descricao varchar(3000),
  imagem_url varchar(500)
);

insert into videos 
(nome, descricao, imagem_url) VALUES
('Salt', 'Filme de ação', 'https://assetsgn.nowonline.com.br/assets/p7937523_v_v8_ai.jpg'),
('Aquaman', 'Filme de Heroi!', 'http://www.amazon.com/images/M/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_FMjpg_UX1000_.jpg'),
('Meu nome é rádio', 'Um drama emocionante!', 'https://d1aid1ai1ve9l.cloudfront.net/capasm/2487.jpg'),
('Transformers', 'Filme de Heroi!', 'https://lojasaraiva.vteximg.com.br/arquivos/ids/1436929/1004945989.jpg?v=637003837809300000\');