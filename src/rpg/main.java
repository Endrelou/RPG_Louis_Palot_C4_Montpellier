package rpg;

public class main {
	public static void main(String[] args) {
	    var Aero = new Hero();
	    var Bero = new Hero();
	    var Cero = new Hero();
	    var Dero = new Hero();
	
	    for (var i = 0; i<1000; ++i) {
	      Aero.attaquer(Bero);
	    }
	    
	    for (var i = 0; i<1000; ++i) {
		      Aero.attaquer(Dero);
	    }
	    for (var i = 0; i<50; ++i) {
		      Aero.attaquer(Cero);
	    }
	    for (var i = 0; i<50; ++i) {
		      Aero.soigner(Cero);
	    }
	    
	    Aero.soigner(Bero);
	    Cero.attaquer(Bero);
	    Bero.attaquer(Aero);
	    Bero.soigner(Aero);
	}
}
