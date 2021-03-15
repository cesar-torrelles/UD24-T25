DROP TABLE IF EXISTS fabricantes;
DROP table IF EXISTS articulos;


CREATE TABLE fabricantes(
	id INT,
	nombre NVARCHAR(100),
    PRIMARY KEY(id)
);

CREATE TABLE articulos(
	id INT,
    nombre NVARCHAR(100),
    precio INT,
    fabricantes INT,
	PRIMARY KEY(id),
    FOREIGN KEY(fabricantes) REFERENCES fabricantes(id)
	ON UPDATE CASCADE ON DELETE CASCADE
);



 INSERT INTO fabricantes  VALUES 
 (1,'Fabricante1'),
 (2,'Fabricante2'),
 (3,'Fabricante3'),
 (4,'Fabricante4'),
 (5,'Fabricante5'),
 (6,'Fabricante6'),
 (7,'Fabricante7'),
 (8,'Fabricante8'),
 (9,'Fabricante9'),
 (10,'Fabricante10');

INSERT INTO articulos VALUES 
(1, 'Articulo1', 100, 1),
(2, 'Articulo2', 100, 2),
(3, 'Articulo3', 200, 3),
(4, 'Articulo4', 250, 4),
(5, 'Articulo5', 300, 5),
(6, 'Articulo6', 100, 6),
(7, 'Articulo7', 120, 7),
(8, 'Articulo8', 150, 8),
(9, 'Articulo9', 400, 9),
(10, 'Articulo10', 420, 10);