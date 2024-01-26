package Exámen;

public class Métodos {

	public static void main(String[] args) {
		
		redondear();

	}
	
	public static void redondear() {
		 double numero = 1.5678;

	        // Redondea el número hacia arriba
	        double numeroRedondeadoArriba = Math.ceil(numero);
	        System.out.println("Numero redondeado hacia arriba: " + numeroRedondeadoArriba);

	        double numeroRedondeadoAbajo = Math.floor(numero);
	        System.out.println("Numero redondeado hacia abajo: " + numeroRedondeadoAbajo);

	        // Redondea el número al entero más cercano
	        double numeroRedondeado = Math.round(numero);
	        System.out.println("Numero redondeado: " + numeroRedondeado);
	}

}
