import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese números enteros positivos (Ingrese un número negativo para finalizar):");

        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }
            minimo = Math.min(minimo, numero);
            maximo = Math.max(maximo, numero);
        }
        if (minimo == Integer.MAX_VALUE && maximo == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números positivos.");
        } else {
            System.out.println("El mínimo es: " + minimo);
            System.out.println("El máximo es: " + maximo);
        }
        scanner.close();
    }
}
