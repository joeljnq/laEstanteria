use laestanteria;

CREATE USER 'estanteria'@'192.168.109.01' IDENTIFIED BY 'root';
GRANT INSERT, UPDATE, DELETE ON laestanteria.almacen TO 'estanteria'@'192.168.109.06';
GRANT INSERT, UPDATE, DELETE ON laestanteria.pedido TO 'estanteria'@'192.168.109.06';
GRANT INSERT, UPDATE, DELETE ON laestanteria.producto TO 'estanteria'@'192.168.109.06';
GRANT INSERT, UPDATE, DELETE ON laestanteria.usuario TO 'estanteria'@'192.168.109.06';
show grants for 'estanteria'@'192.168.109.24';
