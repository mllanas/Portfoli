(: afegir un nou atribut vip amb valor 1 en els serveis de pass preferent :)
for $serveisEspectacles in /parc/espectacles/zona/espectacle/servei[text()="PassPreferent"]
return
insert node attribute vip{'1'} into $serveisEspectacles