package ejercicio2;

import java.util.Scanner;

public class Hucha {
	
	boolean estaAbierta = false;
	String contrasenia = "contraseña";
	
//	int uno = 0;
//	int dos = 0;
//	int cinco = 0;
//	int diez = 0;
//	int veinte = 0;
//	int cincuenta= 0;
	//int uno, dos, cinco, diez, veinte, cinquenta = 0; 
	
	
	//el valor dentro de los indices será el numero de cada moneda
	int[] monedas = new int[2];

	//el valor dentro de los indices será el numero de cada moneda
	int[] billetes = new int[4];
	
	public Hucha() {
		monedas[0] = 2;
		monedas[1] = 6;
		billetes[3] = 3;
		
	}

	//hucha con una cantidad específica de monedas y billetes de cada tipo
	public Hucha(int monedas1, int monedas2, int billetes5, int billetes10, 
			int billetes20, int billetes50) {
		this.setEstaAbierta(true);
		monedas[0] = monedas1;
		monedas[1] = monedas2;
		billetes[0] = billetes5;
		billetes[1] = billetes10;
		billetes[2] = billetes20;
		billetes[3] = billetes50;
		
	}

	//hucha con una cantidad inicial de euros que se desglosará utilizando 
	//la mínima cantidad de monedas y billetes
	public Hucha(int cantidadInicial) {
		this.setEstaAbierta(true);
		//crearemos un metodo para meter dinero en vez de hacerlo todo en este constructor
		meterDinero(cantidadInicial);
	}

	//método para poner dinero minimizando el número de billetes y monedas
	private void meterDinero(int cantidadInicial) {

		while (cantidadInicial > 0)
		{
			if (cantidadInicial >= 50){
				getBilletes()[3]++;
				cantidadInicial -= 50;
			}
			else if (cantidadInicial >= 20){
				getBilletes()[2]++;
				cantidadInicial -= 20;
			}
			else if (cantidadInicial >= 10){
				getBilletes()[1]++;
				cantidadInicial -= 10;
			}
			else if (cantidadInicial >= 5){
				getBilletes()[0]++;
				cantidadInicial -= 5;
			}
			else if (cantidadInicial >= 2){
				getMonedas()[1]++;
				cantidadInicial -= 2;
			}
			else{
				getMonedas()[0]++;
				cantidadInicial -= 1;
			}
		}

		
	}

	public void retirarDinero(int dinero) {
		if (estaAbierta==true) {
			if (dinero <= 0)
			{
				System.err.println("Por favor, introduzca un numero entero positvo mayor que 0");
			}
			//si desea retirar más de lo que tiene, se retirará todo el dinero
			else if (dinero > dineroTotal())
			{
				System.err.println("No tienes suficiente dinero, se procederá a sacar todo el dinero que tengas");
				System.out.println("Retiraste " + dineroTotal() + "€");
				vaciarCuenta();	
			}
			else
			{
				retirarPasoAPaso(dinero);
			}
		}
		else {
			System.out.println("La hucha esta cerrada");
		}
		
	}
	
	public void retirarDineroMinimizando(int dinero) {
		if (estaAbierta==true) {
			if (dinero <= 0)
			{
				System.err.println("Por favor, introduzca un numero entero positvo mayor que 0");
			}
			//si desea retirar más de lo que tiene, se retirará todo el dinero
			else if (dinero >= dineroTotal())
			{
				System.err.println("No tienes suficiente dinero, se procederá a sacar todo el dinero que tengas");
				System.out.println("Retiraste " + dineroTotal() + "€");
				vaciarCuenta();	
			}
			else //el dinero pedido es menor que en la cuenta
			{
				retirarAutomaticamente(dinero);
			}
		}
		else {
			System.out.println("La hucha esta cerrada");
		}
		
	}
	
	/*Se podrá retirar de la hucha una cantidad de euros específica minimizando 
	 * el número de monedas y billetes que se retirarán.*/
	private void retirarAutomaticamente(int cantidad) {
		// TODO Auto-generated method stub
		/*
		 * Si la cantidad a sacar es mayor que el valor de los billetes de 50 que tengo
		 * entonces a la cantidad se le restará todo el dinero que haya en billetes de 50 
		 * ya que sabemos que es menor que la cantidad y, obviamente, ponemos a 0 los 
		 * billetes de 50 porque sabemos que hemos sacado todos.
		 */
		if (cantidad >= getBilletes()[3] * 50) {
			
			int nbilletes = getBilletes()[3];
			cantidad = cantidad - nbilletes*50;
			getBilletes()[3] = 0; //ponemos 0 porque sacamos todos los billetes

		}

		/*
		 * Si la cantidad a sacar es menor que el valor de los billetes de 50 que tengo 
		 * entonces calculamos con una división el número de billetes que necesito sacar
		 * y a continuacion le asigno a cantidad el resto de esa division. Finalmente
		 * al número de billetes solo le resto los billetes sacados
		 */
		else if(cantidad < getBilletes()[3] * 50) {
			int nbilletes = cantidad / 50;
			cantidad = cantidad%50;
			getBilletes()[3] -= nbilletes; //ponemos nbilletes porque sacamos un numero especifico de billetes

		}

		if (cantidad >= getBilletes()[2] * 20) {

			int nbilletes = getBilletes()[2];
			cantidad = cantidad - nbilletes*20;
			getBilletes()[2] = 0;
		}
		//
		else if (cantidad < getBilletes()[2] * 20 && cantidad >= 20) {

			int nbilletes = cantidad / 20;
			cantidad = cantidad % 20;
			getBilletes()[2] -= nbilletes;
		}
		if (cantidad >= getBilletes()[1] * 10) {

			int nbilletes = getBilletes()[1];
			cantidad = cantidad - nbilletes*10;
			getBilletes()[1] = 0;
		}
		else if (cantidad < getBilletes()[1] * 10 && cantidad >= 10) {

			int nbilletes = cantidad / 10;
			cantidad = cantidad % 10;
			getBilletes()[1] -= nbilletes;
		}

		if (cantidad >= getBilletes()[0] * 5) {

			int nbilletes = getBilletes()[0];
			cantidad = cantidad - nbilletes*5;
			getBilletes()[0] = 0;
		}
		else if (cantidad < getBilletes()[0] * 5 && cantidad >= 5) {

			int nbilletes = cantidad / 5;
			cantidad = cantidad % 5;
			getBilletes()[0] -= nbilletes;
		}
		
		
		if (cantidad >= getMonedas()[1] * 2 && cantidad >= 2) {
			
			int nmonedas = getBilletes()[1];
			cantidad = cantidad - nmonedas*2;
			getMonedas()[1] = 0;

		}

		else if (cantidad < getMonedas()[1] * 2) {
			
			int nmonedas = cantidad / 2;
			cantidad = cantidad%2;
			getMonedas()[1] -= nmonedas;

		}
		if (cantidad >= getMonedas()[0] * 1 && cantidad >= 1) {

			int nmonedas = getBilletes()[0];
			cantidad = cantidad - nmonedas*1;
			getMonedas()[0] = 0;
		}
		else if (cantidad < getMonedas()[0] * 1) {

			int nmonedas = cantidad / 1;
			cantidad = cantidad % 1;
			getMonedas()[0] -= nmonedas;
		}
		
		

	}

	//Este método va a retirar el dinero pedido como desee el cliente, o acercandose, si no es posible, a sus exigencias
	private void retirarPasoAPaso(int topeMaximo) {
		
		Scanner s = new Scanner(System.in);
		int cantidad;
		
		System.out.println("¿Cuantos billetes de 50 quieres retirar? Tienes " + getBilletes()[3] + "billetes disponibles");
		cantidad = s.nextInt();
		while (cantidad > getBilletes()[3])
		{
			System.out.println("Tío, que solo tienes " + getBilletes()[3]+ " billetes, vuelve a ponerme el numero correcto ");
			cantidad = s.nextInt();
		}
		getBilletes()[3] -= cantidad;
		//getBilletes()[3] = getBilletes()[3] - cantidad; 
		topeMaximo -= cantidad*50;
		
		/*con la variable topeMaximo actualizada, debería mirar cuánto queda, 
		 * y si es menor que el siguiente billete o moneda (por ejemplo, me quedan 15 euros
		 * y en teoría toca preguntar por los billetes de 20), entoces salto hasta la 
		 * siguiente moneda o billete posibles a sacar
		 * */
		
		
	}

	private void vaciarCuenta() {
		/*for (int moneda:monedas)
		{
			moneda = 0;
		}
		for (int billete:billetes)
		{
			billete = 0;
		}*/
		
		for (int i = 0; i<monedas.length;i++)
			monedas[i]=0;
		
		for (int i = 0; i<billetes.length;i++)
			billetes[i]=0;
			
	}

	public void dineroEnLaHucha(){
		if (estaAbierta==true) {
			System.out.println("Tengo " + getMonedas()[0] + " monedas de 1€" );
			System.out.println("Tengo " + getMonedas()[1] + " monedas de 2€" );
			System.out.println("Tengo " + getBilletes()[0] + " billetes de 5€" );
			System.out.println("Tengo " + getBilletes()[1] + " billetes de 10€" );
			System.out.println("Tengo " + getBilletes()[2] + " billetes de 20€" );
			System.out.println("Tengo " + getBilletes()[3] + " billetes de 50€" );
			
			System.out.println("Tengo " + dineroTotal() + " € en la hucha");	
		}
		else {
			System.out.println("La hucha esta cerrada");
		}
	}
	
	
	public void cambiarContrasenia(String contraseniaActual, String contraseniaNueva) {
		if (getContrasenia() == contraseniaActual)
			this.contrasenia = contraseniaNueva;
		else
			System.out.println("Contraseña incorrecta, no se pudo reestablecer la contraseña");
	}

	public void abrirHucha(String contrasenia)
	{
		if (isEstaAbierta() == true)
			System.out.println("Ya está abierta burro");
		
		else if(contrasenia.equals(getContrasenia())){
			setEstaAbierta(true);
			System.out.println("Se abrió correctamente");
		}
		else
			System.out.println("Contraseña incorrecta");	
	}

	public void cerrarHucha(String contrasenia)
	{
		if (isEstaAbierta() == false)
			System.out.println("Ya está cerrada burro");
		
		else if(contrasenia.equals(getContrasenia())){
			setEstaAbierta(false);
			System.out.println("Se cerró correctamente");
		}
		else
			System.out.println("Contraseña incorrecta");	
	}
	
	/**
	 * 
	 * @return el dinero
	 */
	private int dineroTotal() {
		int total = getMonedas()[0]*1 + getMonedas()[1]*2 + getBilletes()[0]*5  +
				getBilletes()[1]*10 +getBilletes()[2]*20 +getBilletes()[3]*50;
		return total;
	}
	

	public boolean isEstaAbierta() {
		return estaAbierta;
	}

	public void setEstaAbierta(boolean estaAbierta) {
		this.estaAbierta = estaAbierta;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int[] getMonedas() {
		return monedas;
	}

	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}

	public int[] getBilletes() {
		return billetes;
	}

	public void setBilletes(int[] billetes) {
		this.billetes = billetes;
	}
}
