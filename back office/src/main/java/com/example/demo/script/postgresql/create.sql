create database carstore;
\c carstore

create table utilisateur(
    iduser serial primary key,
    nom varchar,
    prenom varchar,
    email varchar,
    mdp varchar,
    role varchar
);

CREATE TABLE annonce(
    idAnnonce serial primary key,
    etat int,
    idvoiture VARCHAR(70),
    iduser int
);

CREATE TABLE favoris(
    idfavoris serial primary key,
    iduser int,
    idAnnonce int,
    dateabo date
);


CREATE TABLE moteur(
  idMoteur serial primary key,
  puissance int ,
  numero_moteur varchar(40),
  etat varchar(20)
);

CREATE TABLE carburant(
    idCarburant serial primary key,
    nom_carburant varchar(40)
);

CREATE TABLE boitevitesse(
    idBoite serial primary key,
    boite varchar(40)
);

CREATE TABLE categorie(
    idCategorie serial primary key,
    nom varchar(40)
);

CREATE TABLE marque(
    idMarque serial primary key,
    nom varchar(20)
);

CREATE TABLE model(
    idModel serial primary key,
    nom varchar(20)
);
CREATE TABLE voiture(
    idVoiture serial primary key ,
    image varchar(50),
    idCategorie int references categorie(idCategorie),
    idMarque int references marque(idMarque),
    idModel int references  model(idModel),
    kilometrage int ,
    immatriculation varchar(20),
    anneDeSotie int ,
    prix float

);

CREATE TABLE pourcentage(
    idpourcentage serial primary key,
    pourcentage decimal
);

