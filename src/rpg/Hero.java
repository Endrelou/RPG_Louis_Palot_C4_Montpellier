package rpg;

public class Hero {
  public Vie vie = new Vie();
  public Niveau niveau = new Niveau();

  public Hero() {}

  public void attaquer(Hero _heroCible) {
    this.niveau =  _heroCible.vie.subir(this.niveau, this);
  }

  public void soigner(Hero _heroCible) {
    _heroCible.vie.soin(this.niveau, this);
  }
}
