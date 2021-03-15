DROP TABLE IF EXISTS departamentos;
DROP table IF EXISTS empleados;

CREATE TABLE departamentos (
	id INT,
    nombre NVARCHAR(100),
    presupuesto INT,
    PRIMARY KEY (id)
    );
    
    CREATE TABLE empleados (
    id VARCHAR(8),
    nombre  NVARCHAR(100),
    apellidos NVARCHAR(255),
    departamentos INT,
	PRIMARY KEY (id),
    FOREIGN KEY (departamentos) REFERENCES departamentos(id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
	);
    
   




insert into departamentos values
(1, 'Departamento1', 500), 
(2, 'Departamento2', 1000), 
(3, 'Departamento3', 700), 
(14, 'Departamento de informática', 80000), 
(5, 'Departamento5', 550), 
(6, 'Departamento6', 750), 
(37, 'Departamento7', 60500), 
(8, 'Departamento8', 800), 
(77, 'Departamento de investigación', 850),
(10, 'Departamento10', 990);


insert into  empleados values
 
('12345677', 'Igor', 'Martinez', 14),
('98746532', 'Maria', 'Pérez', 77),
('69852143', 'Max', 'Maya', 14),
('87456210', 'Noa', 'Moreno', 3),
('98765324', 'Julen', 'Marin', 37),
('42015365', 'Ignacio', 'Duarte', 10),
('74862501', 'Ariana', 'Cobos', 77),
('98561212', 'Sebastian', 'López', 2),
('60041257', 'Bianca', 'Martinez', 37),
('21365784', 'Oscar', 'Palomares', 14),
('89267109', 'Esther', 'Vázquez', 3);

