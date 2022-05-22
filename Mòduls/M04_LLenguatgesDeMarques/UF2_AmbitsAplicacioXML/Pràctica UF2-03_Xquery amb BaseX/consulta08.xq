(: Heu d’eliminar el servei de seients vip dels espectacles :)
for $espectacle in /parc/espectacles/zona/espectacle/servei
where $espectacle/@vip
return
delete node $espectacle

(: where $espectacle="Seient VIP":)