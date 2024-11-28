CREATE DATABASE DonSabor
USE DonSabor
CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY IDENTITY (1,1) NOT NULL,
	DNI CHAR(8),
	nombreUsuario VARCHAR(50),
	apLLPaterno VARCHAR(50),
	apLLMaterno VARCHAR(50),
	correo VARCHAR(40) NOT NULL,
	contraseña VARCHAR(20) NOT NULL,
	telefono CHAR(9),
	distrito VARCHAR(50),
	direccion VARCHAR(50)
);

CREATE TABLE Producto (
    idProducto INT PRIMARY KEY IDENTITY (1,1) NOT NULL,
    nombreProducto VARCHAR(30),
    descripcionProducto TEXT,
    precio DECIMAL(5,2)
);

CREATE TABLE Promocion (
    idPromocion INT PRIMARY KEY NOT NULL,
    descuento DECIMAL (5,2),
    razonPromocion TEXT
);

USE DonSabor

CREATE TABLE detalleVenta (
    idDetalle INT PRIMARY KEY IDENTITY (1,1) NOT NULL,
    idProducto INT,
	idVenta INT,
	idPromocion INT,
	unidadesVendidas INT,
	precioNeto DECIMAL (5,2),
	precioAdicionales DECIMAL (5,2),
	precioVentaFinal DECIMAL(5,2),
	FOREIGN KEY (idVenta) REFERENCES Venta(idVenta),
	FOREIGN KEY (idPromocion) REFERENCES Promocion(idPromocion),
	FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)
);

USE DonSabor
CREATE TABLE Venta (
    idVenta INT PRIMARY KEY IDENTITY (1,1) NOT NULL,
	fechaVenta VARCHAR(10) ,
	monto DECIMAL (5,2),
	idUsuario INT,
	FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario)
);

use DonSabor
INSERT INTO Usuario
(DNI,nombreUsuario,apLLMaterno,apLLPaterno,correo,contraseña,telefono,distrito,direccion)
values ('12345678','Ivan','Castillo','Martinez','admin','admin','999888999','VES','Av, la Paz 9890');


INSERT INTO Producto
(nombreProducto,precio,descripcionProducto)
values ('Filete de pierna con salchicha','21.9','1 filete de pierna + 1 porción de arroz con choclo + 1 porción de papa parrillera + 1 salchicha');

INSERT INTO Producto
(nombreProducto,precio,descripcionProducto)
values ('Pechuga Parrillera con chorizo','23.9','1 pechuga + 1 porción de arroz con choclo 1 porción de papas + 1 chorizo');

INSERT INTO Producto
(nombreProducto,precio,descripcionProducto)
values ('Bife de cerdo con anticucho','25.9','1 Bife de cerdo + 1 porción de arroz con choclo + 1 porcion de paaps parrilleras + 1 palito de anticucho');

INSERT INTO Producto
(nombreProducto,precio,descripcionProducto)
values ('Bife Angosto','39.9','1 Bife Angosto + 2 tajadas de platano frito + 1 porción de ensalada + 1 porción de papas a la parrilla');

INSERT INTO Producto
(nombreProducto,precio,descripcionProducto)
values ('Churrasco','33.9','1 Churrasco + 2 tajadas de platano frito + 1 porción de ensalada + 1 porción de papas a la parrilla');

INSERT INTO Producto
(nombreProducto,precio,descripcionProducto)
values ('Pechuga a la parrilla','23.9','1 Pechuga Criolla + 1 porción de arroz con choclo + 1 porción de papas fritas');

Insert INTO Promocion
(idPromocion,descuento,razonPromocion)
VALUES ('1','3','Por la compra de 6 platos');

Insert INTO Promocion
(idPromocion,descuento,razonPromocion)
VALUES ('2','7','Por la compra de 7 platos');

Insert INTO Promocion
(idPromocion,descuento,razonPromocion)
VALUES ('3','9.5','Por la compra de 8 platos');

Insert INTO Promocion
(idPromocion,descuento,razonPromocion)
VALUES ('10','0','NO HAY PROMOCIÓN');

SELECT * FROM Promocion
SELECT * FROM Producto
SELECT * FROM Usuario
SELECT * FROM Venta
Select * from detalleVenta

select * from Usuario
where distrito = 'VILLA EL SALVADOR'

SELECT * FROM Usuario
WHERE DNI LIKE '7%'

select nombreUsuario from Usuario
order by nombreUsuario asc

select  DV.idDetalle,P.idProducto,DV.unidadesVendidas,p.nombreProducto
from Producto P
inner join detalleVenta DV ON (P.idProducto = DV.idProducto)

select V. idVenta,V.idUsuario,DV.idProducto, DV. precioNeto
From detalleVenta DV
inner join Venta V on (V.idVenta = DV.idVenta )

