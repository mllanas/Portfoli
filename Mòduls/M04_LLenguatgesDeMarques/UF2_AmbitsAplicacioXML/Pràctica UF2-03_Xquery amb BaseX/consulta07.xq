(: Heu de modificar el nom de l’etiqueta menuEspecial dels menús especials de tipus
infantil pel nom petitMenu :)
for $restaurant in /parc/restaurants/zona/restaurant/menuEspecial
where $restaurant="Infantil"
return
rename node $restaurant as "petitMenu"