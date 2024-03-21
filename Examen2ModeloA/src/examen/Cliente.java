package examen;

import java.util.Scanner;

public class Cliente {
	
    private String nombre;
    private String dni;
    private Cuenta cuentaBancaria;
    
    public Cliente(String nombre, String dni, Cuenta cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }
    
    Scanner scanner = new Scanner(System.in);
    
    @Override
    public String toString() {
    	return "Nombre del cliente: " +getNombre()+ " DNI: " +getDni()+ " Cuenta bancaria: " +getCuentaBancaria().toString();
    }
    
    public void sacarDinero(int dinero) {
    	
    	do {
    		
    		System.out.println("Introduzca el pin ?");
        	int pintMetido = scanner.nextInt();
    		
    		if (pintMetido == cuentaBancaria.getPin()) {
    			System.out.println("Tienes " +cuentaBancaria.getDineros()+ " $ en la cuenta");
        		cuentaBancaria.setDineros(cuentaBancaria.getDineros() - dinero);
        		System.out.println("Ahora tienes " +cuentaBancaria.getDineros()+ " $, ya que has sacado " +dinero+ " $");
        		break;
        		
    		} else if (pintMetido != cuentaBancaria.getPin()) {
    			System.out.println("Pin incorrecta, introduzcalo de nuevo");
    		}
			
		} while (true);
    	
    }
    
    public void meterDinero(int dinero) {
    	
    	do {
    		
    		System.out.println("Introduzca el pin ?");
        	int pintMetido = scanner.nextInt();
    		
    		if (pintMetido == cuentaBancaria.getPin()) {
    			System.out.println("Tienes " +cuentaBancaria.getDineros()+ " $ en la cuenta");
        		cuentaBancaria.setDineros(cuentaBancaria.getDineros() + dinero);
        		System.out.println("Ahora tienes " +cuentaBancaria.getDineros()+ " $, ya que has metido " +dinero+ " $");
        		break;
        		
    		} else if (pintMetido != cuentaBancaria.getPin()) {
    			System.out.println("Pin incorrecta, introduzcalo de nuevo");
    		}
			
		} while (true);
    	
    }
    
    public void transferencia(Cliente cliente2, int trasferido) {
    	
    	System.out.println("Cuenta de " +getNombre()+ ", vas a transferir dinero a " +cliente2.getNombre()+ ", cuanto quieres transferir ?");
    	
    	
    	cuentaBancaria.setDineros(cuentaBancaria.getDineros() - trasferido);
    	cliente2.cuentaBancaria.setDineros(cliente2.cuentaBancaria.getDineros() + trasferido);
    	
    	System.out.println(getNombre()+ " a tranferido " +trasferido+ "$ a " +cliente2.getNombre());
    	System.out.println("Dinero actual de " +cliente2.getNombre()+ " --- " +cliente2.cuentaBancaria.getDineros()+ "$");
    	System.out.println("Dinero actual de " +getNombre()+ " --- " +cuentaBancaria.getDineros()+ "$");
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Cuenta getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(Cuenta cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
    
    
    
   }
