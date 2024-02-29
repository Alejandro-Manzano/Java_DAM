package ejercicio7;

import java.util.ArrayList;

public class Enemigos {
	ArrayList<Enemigo> villanos = new ArrayList<>();
	
	public void add(Enemigo e) {
		villanos.add(e);
	}
	
	public void addCellJr() {
		Enemigo cell = new Enemigo();
		villanos.add(cell);
		villanos.add(new Enemigo());
	}
}
