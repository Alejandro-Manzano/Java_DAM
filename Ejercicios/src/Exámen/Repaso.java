package Exámen;

public class Repaso {

	public static void main(String[] args) {
		
		//ex01();

	}
	
	//1- En una clase llamada Ejercicio1 escribe un programa que realice las acciones siguientes definiendo, además del método main, todos los métodos adicionales que se consideren necesarios:

	//Almacenar en una variable de tipo long un número aleatorio comprendido entre dos valores cualesquiera usando la clase Math.
	//Sin convertir el número a cadena, determinar si el número obtenido me gusta. Un número sólo me gusta si:
	//La suma de los dígitos cuyo valor es impar es mayor que la suma del resto de dígitos.
	//No se cumple la condición anterior, pero el número es impar y la suma de todos sus dígitos también lo es.
	//Almacenar en un array de caracteres cada uno de los dígitos del número sin usar sentencias repetitivas.
	//Mostrar en la consola los resultados obtenidos en cada uno de los apartados anteriores.
	
	public static void ex01() {
			
		//Generar número aleatorio
		long numero = (long) Math.floor(Math.random() * 1000000000L);

        boolean gusta = false;
        int sumaImpares = 0;
        int sumaPares = 0;
        for (int i = 0; i < Long.toString(numero).length(); i++) {
            int digito = Long.toString(numero).charAt(i) - '0';
            if (digito % 2 == 1) {
                sumaImpares += digito;
            } else {
                sumaPares += digito;
            }
        }
        if (sumaImpares > sumaPares) {
            gusta = true;
        } else if (sumaImpares == sumaPares && numero % 2 == 1) {
            gusta = true;
        }

        // Almacenar los dígitos del número
        char[] digitos = Long.toString(numero).toCharArray();
		
	}
	
	//2- En una clase llamada Ejercicio2 escribe un programa Java que realice las acciones siguientes definiendo, además del método main, todos los métodos adicionales que se consideren necesarios:
	//Crear un array de un tamaño aleatorio entre 10 y 50.
	//Usando la clase Math, almacenar en el array números aleatorios comprendidos entre -1000 y 1000 y con una precisión de dos decimales.
	//Obtener el resultado de procesar el contenido del array de la forma siguiente:
	//Se sumarán los valores almacenados comenzando desde la posición cero en adelante.
	//Si en cualquier momento del proceso de cálculo de la suma ésta supera la mitad del valor máximo posible, el resultado final será el 33,33% del valor obtenido hasta ese momento, y no se sumarán el resto de los números almacenados en el array.
	//Si no se produce la situación anterior, el resultado final será el 66,66% de la suma obtenida.

	
	public static void ex02() {
		
	}
}
