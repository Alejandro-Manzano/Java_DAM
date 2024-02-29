package ejercicio7;

public class JuegosDeCell {

	public static void main(String[] args) {
		
		GuerreroZ krilin = new GuerreroZ("Krilin", false, 150, 300, 80, 45, 0);
		
	GuerrerosZ heroes = new GuerrerosZ();
	heroes.add(krilin);
//	System.out.println(krilin.getNombre());
	System.out.println(heroes.get(0).toString());
	}

}
