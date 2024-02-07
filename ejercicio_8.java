import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = recibirNumeros(scanner);
        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        scanner.close();
    }
    public static int[] recibirNumeros(Scanner scanner) {
        System.out.println("Ingrese números enteros (ingrese 0 para terminar):");
        int[] numeros = new int[10];
        int cantidad = 0;

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (cantidad == numeros.length) {
                int[] temp = new int[numeros.length * 2];
                System.arraycopy(numeros, 0, temp, 0, cantidad);
                numeros = temp;
            }

            numeros[cantidad++] = numero;
        }

        int[] resultado = new int[cantidad];
        System.arraycopy(numeros, 0, resultado, 0, cantidad);
        return resultado;
    }

    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public static int calcularMinimo(int[] numeros) {
        if (numeros.length == 0) {
            return Integer.MIN_VALUE;
        }
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            minimo = Math.min(minimo, numeros[i]);
        }
        return minimo;
    }

    public static int calcularMaximo(int[] numeros) {
        if (numeros.length == 0) {
            return Integer.MAX_VALUE;
        }
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            maximo = Math.max(maximo, numeros[i]);
        }
        return maximo;
    }
}
