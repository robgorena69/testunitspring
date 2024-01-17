CREATE TABLE  IF NOT EXISTS movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    genre VARCHAR(50) NOT NULL
);

insert into movies (name, minutes, genre) values ('The Godfather', 175, 'DRAMA');
insert into movies (name, minutes, genre) values ('The Shawshank Redemption', 142, 'DRAMA');    
insert into movies (name, minutes, genre) values ('Schindler''s List', 195, 'DRAMA');   
insert into movies ( name, minutes, genre) values ('Raging Bull', 129, 'DRAMA');        