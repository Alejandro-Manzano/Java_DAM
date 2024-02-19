package ejercicio6;

import ejercicio5.Naipe;
import ejercicio5.Palo;

public class PrincipalMazo {

	public static void main(String[] args) {
		Mazo mazo1 = new Mazo("cartaAlta");
//		Mazo mazo2 = new Mazo();
//		mazo1.addAll(mazo2);
//		mazo1.mostrar();
//		System.out.println("////////////////////////////////////////////////////");
//		mazo2.mostrar();
//		mazo1.tamanio();
//		Naipe n = mazo1.remove();
//		System.out.println(n.toString2());
//		mazo1.tamanio();
//		mazo1.add(new Naipe(Palo.PICAS,"A"));
//		mazo1.mostrar();
		//System.out.println("♥");
		jugarCartaAlta(mazo1);
	}

	private static void jugarCartaAlta(Mazo mazo1) {
		Naipe cartaJugador = mazo1.remove();
		
		Naipe cartaPC = mazo1.remove();
		
		if (cartaJugador.getValor()>cartaPC.getValor())
		{
			System.out.println("Gana Mateo con un " + cartaJugador.toString2());
			System.out.println("Pierde la máquina con un " + cartaPC.toString2());
		}
		else if (cartaPC.getValor()>cartaJugador.getValor())
		{
			System.out.println("Gana la maquina con un " + cartaPC.toString2());
			System.out.println("Pierde Mateo con un " + cartaJugador.toString2());
		}
		else
		{
			
			System.out.println("Empate, se juega otra vez");
			jugarCartaAlta(mazo1);//desde el metodo hacemos una llamada al mismo metodo.
		}
		
	}

}
