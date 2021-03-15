create database medicos;
use medicos;

create table login(
  id int(11) auto_increment,
  correo varchar(11),
  clave varchar(11),
  constraint id_pk primary key (id)
);

create table dueño(
  id varchar(11),
  nombre varchar(50),
  correo varchar(50),
  direccion varchar(50),
  fecha date,
  eliminar int(2),
  constraint idDueño_pk primary key(id)
);

create table mascota (
  id varchar(11) auto_increment,
  nombre varchar(50),
  idDueño varchar(11),
  sexo varchar(50),
  edad varchar(50),
  tipo varchar(50),
  problema varchar(1000),
  fecha date,
  eliminar int(2),
  constraint idMascota_pk primary key (id),
  constraint idDueño_fk FOREIGN KEY (idDueño) references dueño(id)
)
