(: Mostra les atraccions d’intensitat forta que l’edat mínima per accedir-hi, sense adults,
sigui més de 12 anys :)

for $atraccionsFortes in /parc/atraccions/zona/atraccio[intensitat="Forta"]
where number($atraccionsFortes/edatMinima[@adult="no"]) > 12
return
data($atraccionsFortes/@nom)
