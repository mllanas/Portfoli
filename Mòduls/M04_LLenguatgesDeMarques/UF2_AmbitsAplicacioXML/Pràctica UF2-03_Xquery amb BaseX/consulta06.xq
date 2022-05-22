(: Heu d’afegir un nou element preu en els espectacles que siguin passatges del terror.
El preu d’aquests espectacles serà de 5 euros. L’heu d’afegir abans de l’element tipus :)
for $espectacle in /parc/espectacles/zona/espectacle
where $espectacle[tipus="Passatge del terror"]
return
insert node <preu>5,00 €</preu> before $espectacle/tipus