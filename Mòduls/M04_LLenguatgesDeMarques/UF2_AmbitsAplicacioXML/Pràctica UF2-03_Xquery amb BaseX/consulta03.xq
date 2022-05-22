(: Mostra quants passis d’espectacles hi ha que comencin a les 12:30. El format de
sortida ha de ser "Total passis que comencen a les 16:00: totalPassis", és a dir
"Total passis que comencen a les 16:00: 3 " :)

for $espectacle in count(/parc/espectacles/zona/espectacle/horari/passi[horaInici="12:30"])
return
concat("Total passis que comencen a les 12:30h: ", $espectacle)