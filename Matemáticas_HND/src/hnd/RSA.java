package hnd;

import java.util.Random;

public class RSA {

    public static int generatePrime() {
        // Lógica para generar un número primo
        // ...

        return 0; // Cambia esto según tu implementación
    }

    public static int generateRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int modularExponentiation(int base, int exponent, int modulus) {
        // Lógica para la exponenciación modular
        // ...

        return 0; // Cambia esto según tu implementación
    }

    public static int modularInverse(int a, int m) {
        // Lógica para el inverso modular
        // ...

        return 0; // Cambia esto según tu implementación
    }
    public class MCM {

        public static int mcm(int n1, int n2) {
            int mcd = mcd(n1, n2);
            return mcd * Math.max(n1, n2);
        }

        private static int mcd(int n1, int n2) {
            if (n1 % n2 == 0) {
                return n2;
            } else {
                return mcd(n2, n1 % n2);
            }
        }

        public static void main(String[] args) {
            int n1 = 12;
            int n2 = 20;
            int mcm = mcm(n1, n2);
            System.out.println(mcm);
        }
    }
}


