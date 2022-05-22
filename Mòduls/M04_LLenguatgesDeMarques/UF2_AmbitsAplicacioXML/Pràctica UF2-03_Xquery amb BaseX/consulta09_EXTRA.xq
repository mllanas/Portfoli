(: Mostrar el nom de botigues i restaurants que estiguin en la mateixa zona. El format de
sortida ha de ser: "nomBotiga està en la mateixa zona que nomRestaurant",
per exemple "Fotos Hurakan Truancy està en la mateixa zona que La Cantina del
Coper" :)

for $restaurants in /parc/restaurants/zona
for $botigues in /parc/botigues/zona
for $r in $restaurants/restaurant, $b in $botigues/botiga
where $restaurants/@nom = $botigues/@nom
return

concat( "'",
        data($b/@nom),
        "' està en la mateixa zona que '",
        data($r/@nom),
        "'",
        " (ZONA: ", data($botigues/@nom), " )"
)