drop database if exists laEstanteria;
create database laEstanteria;
use laEstanteria;

create table usuario
(
dni varchar(9) not null ,
nombre varchar(30) not null,
pago varchar(10) not null,
tipo enum('administrador','usuario') not null,
contraseña varchar(30),
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
Tipo enum('componentes','telefonos','almacenamiento') not null,
stock integer not null,
primary key(idProducto)
)engine = InnoDB;

create table tipo
(
idTipo integer not null,
nombre varchar(30) not null,
primary key(idTipo)
)engine = InnoDB;

create table pedido
(
numeroPedido integer not null,
factura integer not null,
estado enum('confirmado','enviado','entregado'),
primary key(numeroPedido)
)engine = InnoDB;


INSERT INTO usuario (dni, nombre, pago, tipo, contraseña) VALUES
    ('12345678A', 'Ana García', 'mensual', 'usuario', '123456');


INSERT INTO almacen (idAlmacen, nombre, seccion) VALUES
    (1, 'Almacen 1', 'Electronica');
    
    INSERT INTO producto (idProducto, nombre, tipo, stock) VALUES
    (1, 'Tarjeta gráfica', 'componentes', 15),
    (2, 'Disco duro', 'almacenamiento', 20),
    (3, 'Pantalla', 'componentes', 10),
    (4, 'Móvil Samsung', 'telefonos', 30),
    (5, 'Portátil Lenovo', 'componentes', 12);
    
    INSERT INTO tipo (idTipo, nombre) VALUES
    (1, 'Componente'),
    (2, 'Teléfono'),
    (3, 'Almacenaje'),
    (4, 'Otros');
    
    
