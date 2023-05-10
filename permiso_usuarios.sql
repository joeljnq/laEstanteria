use laestanteria;
GRANT select ON laestanteria.almacen TO 'estanteria'@'192.168.109.24';
GRANT select ON laestanteria.pedido TO 'estanteria'@'192.168.109.24';
GRANT select ON laestanteria.producto TO 'estanteria'@'192.168.109.24';
GRANT select ON laestanteria.usuario TO 'estanteria'@'192.168.109.24';
show grants for 'estanteria'@'192.168.109.06';
