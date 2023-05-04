drop database if exists laEstanteria;
create database laEstanteria;
use laEstanteria;

create table usuario
(
dni varchar(9) not null ,
nombre varchar(30) not null,
pago varchar(10) not null,
tipo enum('administrador','usuario') not null,
contraseña varchar(30) not null,
correo varchar(50) not null,
primary key(dni)
)engine = InnoDB;

create table almacen
(
idAlmacen integer not null,
nombre varchar(30) not null,
seccion varchar(30) not null,
primary key(idAlmacen)
)engine = InnoDB;

create table producto
(
idProducto integer not null,
nombre varchar(30) not null,
Tipo enum('componentes','telefonos','almacenamiento','pc') not null,
stock integer not null,
precio double not null,
primary key(idProducto)
)engine = InnoDB;

create table pedido
(
idPedido integer not null,
factura integer not null,
estado enum('confirmado','enviado','entregado'),
primary key(idPedido)
)engine = InnoDB;


INSERT INTO usuario (dni, nombre, pago, tipo, contraseña,correo) VALUES
    ('12345678A', 'Ana García', 'mensual', 'usuario', '123456','prueba@prueba.com');


INSERT INTO almacen (idAlmacen, nombre, seccion) VALUES
    (1, 'Almacen 1', 'Electronica');
    
    INSERT INTO producto (idProducto, nombre, tipo, stock,precio) VALUES
    (1, 'Tarjeta gráfica', 'componentes', 15,1000.00),
    (2, 'Disco duro', 'almacenamiento', 20,40.00),
    (3, 'Pantalla', 'componentes', 10,200.00),
    (4, 'Móvil Samsung', 'telefonos', 30,100.00),
    (5, 'Portátil Lenovo', 'pc', 12,1500.00);
    
    INSERT INTO pedido (idPedido, factura, estado) VALUES
    (1, 123, 'confirmado');

	UPDATE producto SET stock = stock - 2 WHERE idProducto IN (1, 4);

    
    
