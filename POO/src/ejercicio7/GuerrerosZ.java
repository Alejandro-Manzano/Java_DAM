package ejercicio7;

import java.util.ArrayList;

public class GuerrerosZ {
	ArrayList<GuerreroZ> personajes = new ArrayList<>();
	
	public void add(GuerreroZ guerreroz) {
		personajes.add(guerreroz);
	}
	
	public void addSaiyan(GuerreroZ guerreroz) {
		personajes.add(guerreroz);
	}
	
	public GuerreroZ get(int i) {
		return personajes.get(i);
	}
}
