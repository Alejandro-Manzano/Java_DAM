package ejercicio2;
/**
 * 
 * @author CES
 *Ejercicio 2: Hucha
Definir una clase llamada Hucha según las especificaciones siguientes:

La hucha solo admite monedas de uno y dos euros y billetes de 5, 10, 20 y 50 euros.

La hucha podrá estar abierta o cerrada. Para abrir o cerrar la hucha se requiere una contraseña.

La contraseña se podrá cambiar en cualquier momento.

La hucha podrá proporcionar información acerca de la cantidad de monedas o billetes que almacena de cada clase,
 así como el valor total en euros.
 
Se podrán retirar de la hucha monedas o billetes indicando el tipo y la cantidad de los mismos que se desea retirar.
 Si la cantidad solicitada supera la cantidad almacenada se retirará únicamente la cantidad disponible.
 
Se podrá retirar de la hucha una cantidad de euros específica minimizando el número de monedas y billetes que se retirarán.

Para poder operar con la hucha esta deberá estar abierta, si está cerrada se imprimirá un mensaje por pantalla de que no 
se puede operar con ella. Para poder operar con ella habrá que abrirla con la contraseña.

Se podrá construir una hucha vacía, una hucha con una cantidad específica de monedas y billetes de cada tipo o
 una hucha con una cantidad inicial de euros que se desglosará utilizando la mínima cantidad de monedas y billetes.
Escribir un programa que ponga a prueba la clase Hucha utilizando todos sus constructores y métodos.

 */
public class PrincipalHucha {

	public static void main(String[] args) {
		Hucha hucha1 = new Hucha();
		Hucha hucha2 = new Hucha(4,5,1,10,3,1);
		Hucha hucha3 = new Hucha(113);
//		hucha1.dineroEnLaHucha();
		//hucha2.dineroEnLaHucha();
		hucha3.dineroEnLaHucha();
//		hucha1.abrirHucha("contraseña");
//		hucha1.retirarDinero(0);
//		hucha1.retirarDinero(-10);
//		hucha1.dineroEnLaHucha();
//		hucha1.retirarDinero(500);
//		hucha1.dineroEnLaHucha();
//		hucha1.retirarDinero(150);
//		hucha1.dineroEnLaHucha();
//		hucha1.retirarDineroMinimizando(110);
//		hucha1.dineroEnLaHucha();

	}

}
