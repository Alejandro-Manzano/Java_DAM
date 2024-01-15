package hnd;

public class L1 {

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

    
    public static int calcularMCDLista(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = calcularMCD(resultado, numeros[i]);
        }
        return resultado;
    }

    
    public static int calcularMCMLista(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = calcularMCM(resultado, numeros[i]);
        }
        return resultado;
    }

    
    public static void main(String[] args) {
        // Ejemplo de uso
        int[] numeros = {12, 18, 24};
        
        // Calcular y mostrar el MCD
        int mcd = calcularMCDLista(numeros);
        System.out.println("El MCD de los números es: " + mcd);

        // Calcular y mostrar el MCM
        int mcm = calcularMCMLista(numeros);
        System.out.println("El MCM de los números es: " + mcm);
    }
}




