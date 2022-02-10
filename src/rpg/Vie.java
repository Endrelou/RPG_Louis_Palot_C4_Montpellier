package rpg;
import java.util.Objects;

public class Vie {
  private int vie = 1000;

  public Vie() {}

  public void soin(Niveau _niveau, Hero soigneur) {
    if (soigneur.vie.vie == 0 ) 
      return;

    if (this.vie == 1000) 
    	return;
 
    if (this.vie == 0) 
    	return;

	this.vie += 1;
	var niveauTemporaire = _niveau;
    while (Objects.nonNull(niveauTemporaire.lastNiveau)) {
    	this.vie += 1;
    	niveauTemporaire = niveauTemporaire.lastNiveau;
    }
    if (this.vie > 1000)
      this.vie = 1000;
  }

  public Niveau subir(Niveau _niveau, Hero attaquant) {
    if (attaquant.vie.vie == 0 ) 
    	return _niveau;
    
    if (this.vie <= 0) 
    	return _niveau;
  
	this.vie -= 1;
	var niveauTemporaire = _niveau;
    while (Objects.nonNull(niveauTemporaire.lastNiveau)) {
    	this.vie -= 1;
    	niveauTemporaire = niveauTemporaire.lastNiveau;
    }

    if (this.vie <= 0) {
    	_niveau = _niveau.levelUp();
    	this.vie = 0;
    }
    return _niveau;
  }
}
