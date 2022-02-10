package rpg;

public class Niveau {
  public Niveau lastNiveau = null;
  
  public Niveau() {}
  
  public Niveau(Niveau _lastNiveau) {
	  this.lastNiveau = _lastNiveau;
  }

  public Niveau levelUp() {
    return new Niveau(this);
  }
}