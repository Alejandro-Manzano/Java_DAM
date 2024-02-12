package ejercicio2;
/**
 * 
 * @author CES
 *Ejercicio 2: Hucha
Definir una clase llamada Hucha seg�n las especificaciones siguientes:

La hucha solo admite monedas de uno y dos euros y billetes de 5, 10, 20 y 50 euros.

La hucha podr� estar abierta o cerrada. Para abrir o cerrar la hucha se requiere una contrase�a.

La contrase�a se podr� cambiar en cualquier momento.

La hucha podr� proporcionar informaci�n acerca de la cantidad de monedas o billetes que almacena de cada clase,
 as� como el valor total en euros.
 
Se podr�n retirar de la hucha monedas o billetes indicando el tipo y la cantidad de los mismos que se desea retirar.
 Si la cantidad solicitada supera la cantidad almacenada se retirar� �nicamente la cantidad disponible.
 
Se podr� retirar de la hucha una cantidad de euros espec�fica minimizando el n�mero de monedas y billetes que se retirar�n.

Para poder operar con la hucha esta deber� estar abierta, si est� cerrada se imprimir� un mensaje por pantalla de que no 
se puede operar con ella. Para poder operar con ella habr� que abrirla con la contrase�a.

Se podr� construir una hucha vac�a, una hucha con una cantidad espec�fica de monedas y billetes de cada tipo o
 una hucha con una cantidad inicial de euros que se desglosar� utilizando la m�nima cantidad de monedas y billetes.
Escribir un programa que ponga a prueba la clase Hucha utilizando todos sus constructores y m�todos.

 */
public class PrincipalHucha {

	public static void main(String[] args) {
		Hucha hucha1 = new Hucha();
		Hucha hucha2 = new Hucha(4,5,1,10,3,1);
		Hucha hucha3 = new Hucha(113);
//		hucha1.dineroEnLaHucha();
		//hucha2.dineroEnLaHucha();
		hucha3.dineroEnLaHucha();
//		hucha1.abrirHucha("contrase�a");
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
