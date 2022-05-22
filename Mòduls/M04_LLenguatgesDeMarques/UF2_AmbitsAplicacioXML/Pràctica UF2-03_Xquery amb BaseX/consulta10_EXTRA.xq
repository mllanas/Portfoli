(: Mostrar el nom per parelles de les botigues que venen el mateix producte i el producte
que venen. El format de sortida ha de ser "nomBotiga ven el mateix producte
que nomBotiga i el producte és nomProducte", per exemple "Fotos Dual Khan ven
el mateix producte que Fotos Dhambhala i el producte és Fotografies". Heu
d’evitar que es mostrin parelles de botigues relacionades amb elles mateixes, és a
dir, per exemple "Fotos Dual Khan ven el mateix producte que Fotos Dual Khan i
el producte és Fotografies" :)

for $botiga1 in /parc/botigues/zona/botiga
for $botiga2 in /parc/botigues/zona/botiga
where $botiga1/producte = $botiga2/producte and 
      $botiga1/@nom != $botiga2/@nom
return
concat( 
        "'",
        data($botiga1/@nom),
        "' ven el mateix producte que '",
        data($botiga2/@nom),
        "' i el producte és: ",
        $botiga1/producte/text()
      )