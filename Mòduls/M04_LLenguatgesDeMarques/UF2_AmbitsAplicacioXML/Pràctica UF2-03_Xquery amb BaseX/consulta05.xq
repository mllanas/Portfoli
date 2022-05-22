(: afegir un nou atribut vip amb valor 1 en els serveis de pass preferent :)
for $serveisAtraccions in /parc/atraccions/zona/atraccio/servei[text()="PassPreferent"]
return
insert node attribute vip{'1'} into $serveisAtraccions