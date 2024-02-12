package Ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Animal perro = new Animal("León");	
		Animal gato = new Animal("Misifu", LocalDate.of(2009, 1, 10));
		
		System.out.println(perro.toString());
		System.out.println(gato.toString());


	}

}
