create database fiarako;
\c fiarako;

create table utilisateur(
    id serial primary key,
    nom varchar(40),
    prenom varchar(40),
    contact varchar(30),
    email varchar(40),
    passwords varchar(50)
);

create table categorie(
    idCat serial primary key,
    nom varchar(40)
);

create table marque(
    idMar serial primary key,
    nom varchar(40)
);

create table model(
    idMod serial primary key,
    nom varchar(30)
);

create table moteur(
    idMot serial primary key,
    numero varchar(30),
    etat int 
);

create table transmission(
    idTran serial primary key,
    boite varchar(50)
);

create table carburant(
    idCarbu serial primary key,
    nom varchar(40)
);



create table voiture(
    idCar serial primary key,
    idCategorie int references categorie(idCat),
    idMarque int references marque(idMar),
    idModel int references model(idMod),
    idCarburant int references carburant(idCarbu),
    idMoteur int references moteur(idMot),
    idTransmi int references transmission(idTran),
    prix float ,
    kilometrage float,
    couleur varchar
);

create table entretien(
    idEntre serial primary key,
    idVoiture int references voiture(idCar),

);


create table vente(
    id serial primary key,
    idUser int references utilisateur(id),
    idVoiture int references voiture(idCar),
    daty date 
);

create table annonce()


create or replace view V_vente as select us.nom as utilisateur,us.contact as contact,v.marque,ve.daty from vente ve 
join utilisateur us on ve.iduser=us.id 
join voiture v on v.idCar=ve.id;




create or replace view V_voiture as select cat.nom as categorie ,mar.nom as marque , mod.nom as model ,mot.numero,mot.etat,trans.boite,vo.kilometrage,vo.couleur,vo.prix from voiture vo
join categorie cat on cat.idCat=vo.idCar
join marque mar on mar.idMar=vo.idCar
join model mod on mod.idMod=vo.idCar
join carburant carb on carb.idCarbu=vo.idCar
join moteur mot on mot.idMot=vo.idCar
join transmission trans on trans.idTran=vo.idCar;



insert into utilisateur(id_utilisateur,email,nom,password)values (default,'aina@gmail.com','21321');








