# Pràctica UF3P1 - Usuaris i permisos

/* Tasca 1. Root. 
   L'usuari pz.root és l'administrador, per tant que tingui permís 
   per a gestionar tota la base de dades de pizzeria i donar permisos. 
   Fes servir l’usuari pz.root per la resta de tasques.*/
   
GRANT ALL PRIVILEGES
ON *.* 
TO 'pz.root' IDENTIFIED BY '1234'
WITH GRANT OPTION;

FLUSH PRIVILEGES;

SHOW GRANTS for 'pz.root'@'localhost';


/* Tasca 2. Administració.
   Crear l’usuari pz.administracio, i aplica que pugi crear usuaris però no pot assignar 
   cap permís, amb una sola intrucció.*/
  
GRANT CREATE USER
ON *.*
TO 'pz.administracio' IDENTIFIED BY '1234';

FLUSH PRIVILEGES;
SHOW GRANTS for 'pz.administracio'@'localhost';


/* Tasca 3. Rols
   Crea els seguents rols: dissenyador.global, dissenyador.productes, operador.persones, 
   operador.productes i repartidor.*/
   
CREATE ROLE 'dissenyador.global', 'dissenyador.productes', 
            'operador.persones', 'operador.productes','repartidor';

# Mostrar rols creats
SELECT user
FROM mysql.user
WHERE is_role = 'Y';


/* Tasca 4. Dissenyador global
   El rol dissenyador.global pot modificar l'estructura de la base de dades. Pot crear, 
   modificar i eliminar part de l'estructura de la base de dades, però no les dades.*/

GRANT CREATE, ALTER, DROP 
ON uf2_p2_pizzeria.* 
TO 'dissenyador.global';

FLUSH PRIVILEGES;


/* Tasca 5. Dissenyador dels productes
   El rol dissenyador.productes pot modificar l'estructura de les taules que tenen 
   dades dels productes. Tingues en compte que no pot crear ni esborrar taules, ni les dades.*/

GRANT ALTER
ON uf2_p2_pizzeria.producte
TO 'dissenyador.productes';

GRANT ALTER
ON uf2_p2_pizzeria.beguda
TO 'dissenyador.productes';

GRANT ALTER 
ON uf2_p2_pizzeria.postre
TO 'dissenyador.productes';

GRANT ALTER 
ON uf2_p2_pizzeria.pizza
TO 'dissenyador.productes';

GRANT ALTER 
ON uf2_p2_pizzeria.pizza_ingredient
TO 'dissenyador.productes';

GRANT ALTER 
ON uf2_p2_pizzeria.ingredient
TO 'dissenyador.productes';

FLUSH PRIVILEGES;


/* Tasca 6. Operador de dades de persones
   El rol operador.persones pot treballar sobre les dades de les persones, 
   però no sobre les dades dels productes.*/

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.client
TO 'operador.persones';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.empleat
TO 'operador.persones';

FLUSH PRIVILEGES;


/* Tasca 7. Operador de dades dels productes
El rol operador.productes pot treballar sobre les dades dels productes, però no sobre les
dades de les persones.*/

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.producte
TO 'operador.productes';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.beguda
TO 'operador.productes';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.postre
TO 'operador.productes';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.pizza
TO 'operador.productes';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.pizza_ingredient
TO 'operador.productes';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.ingredient
TO 'operador.productes';

FLUSH PRIVILEGES;

/* Tasca 8. Repartidor
   El rol repartidor pot treballar sobre les dades de les comandes, però no sobre la resta 
   de dades.*/
   
GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.comanda
TO 'repartidor';

GRANT SELECT, UPDATE, INSERT, DELETE
ON uf2_p2_pizzeria.comanda_producte
TO 'repartidor';
   
/* Tasca 9. Assignació de rols. Dona d’alta a la base de dades els usuaris i assigna els rols segons:   
pz.joan: dissenyador.global
pz.maria: dissenyador.global, dissenyador.productes
pz.jordi: dissenyador.productes
pz.eric: operador.persones, operador.productes
pz.dani: operador.productes, repartidor
pz.pol: repartidor
*/

GRANT 'dissenyador.global' TO 'pz.joan'@'localhost' IDENTIFIED BY '1234';

GRANT 'dissenyador.global' TO 'pz.maria'@'localhost' IDENTIFIED BY '1234';
GRANT 'operador.productes' TO 'pz.maria'@'localhost';

GRANT 'operador.productes' TO 'pz.jordi'@'localhost' IDENTIFIED BY '1234';

GRANT 'operador.persones' TO 'pz.eric'@'localhost' IDENTIFIED BY '1234';
GRANT 'operador.productes' TO 'pz.eric'@'localhost';

GRANT 'operador.productes' TO 'pz.dani'@'localhost' IDENTIFIED BY '1234';
GRANT 'repartidor' TO 'pz.dani'@'localhost';

GRANT 'repartidor' TO 'pz.pol'@'localhost' IDENTIFIED BY '1234';
FLUSH PRIVILEGES;

SELECT *
FROM mysql.user;

/* Tasca 10. Treure permisos
   Treu el permis d'eliminar dades dels ingredients a l’usuari pz.dani.*/

# no tenim permisos directes, per tant no podem treure-li, en tot cas seria així:

	REVOKE DELETE
	ON uf2_p2_pizzeria.ingredient
	FROM 'pz.dani'@'localhost';

	REVOKE DELETE
	ON uf2_p2_pizzeria.pizza_ingredient
	FROM 'pz.dani'@'localhost';

	FLUSH PRIVILEGES;
