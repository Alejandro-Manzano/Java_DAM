package clase_3;

public class Principal {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		a += 3;
		
		System.out.println(a);
		System.out.println(a == b);
		
		if (a==b) {
			System.out.println("iguales");
		} else {
			System.out.println("son distintos");
		}
		
		String cadenaString = "123";
		int n = Integer.parseInt(cadenaString);
		System.out.println(n);
		n++;
		double doublePars = Double.parseDouble(cadenaString);
		System.out.println(doublePars);
		
		int num = 9;
		String lkString = String.valueOf(num);
		System.out.println(lkString);
		
		//es true String
		System.out.println(lkString instanceof String);
		
		double base = 9;
		double altura = 7;
		
		System.out.println(calcularTriangulo(base, altura));
		
	}
	
	public static double calcularTriangulo(double base, double altura) {
		return base * altura;
	}

}
