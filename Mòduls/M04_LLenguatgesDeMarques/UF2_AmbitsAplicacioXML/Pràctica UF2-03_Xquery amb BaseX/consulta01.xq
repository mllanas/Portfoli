(: Mostra el nom de les atraccions en les quals l’edat mínima per accedir sigui de
10 anys o menys, sense tenir en compte si es pot accedir amb una persona adulta.
Els noms de les atraccions s’han de mostrar amb el següent format: "Nom
atracció: nomAtraccio", per exemple "Nom atracció: Pati Mission" :)

for $atraccions in /parc/atraccions/zona/atraccio[edatMinima<=10]
return
concat(("Nom atracció: "), $atraccions/@nom)
