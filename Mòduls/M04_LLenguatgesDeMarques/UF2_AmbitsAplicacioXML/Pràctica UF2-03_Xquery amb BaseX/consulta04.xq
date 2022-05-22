(: Heu de modificar la data de tancament per 01/03/2022 :)
for $dataTancament in /parc/dates/dataTancament/text()
return 
replace node $dataTancament with "01/03/2022"