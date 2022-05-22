let $espectacle := count(/parc/espectacles/zona/espectacle/horari/passi[horaInici="12:30"])
return
concat(("Total passis que comencen a les 12:30h: "), $espectacle)