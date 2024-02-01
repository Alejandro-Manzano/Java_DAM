package Ejercicio1;

import java.time.LocalDate;

public class principalAnimal {
	
	public static void main(String[] args) {
		Animal perro = new Animal("Leon");
		Animal gato = new Animal("Misifu", LocalDate.of(2009, 1, 10));
		
		System.out.println(perro.toString());
		System.out.println(gato.toString());
	}
	
	


}
