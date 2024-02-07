import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la dimensión de los vectores
        System.out.print("Ingrese la dimensión de los vectores: ");
        int N = scanner.nextInt();

        // Crear los vectores con la dimensión especificada
        int[] vector1 = leerVector(scanner, N);
        int[] vector2 = leerVector(scanner, N);

        // Calcular el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        // Imprimir el producto escalar
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    // Función para leer un vector de N elementos desde el teclado
    public static int[] leerVector(Scanner scanner, int N) {
        System.out.println("Ingrese los " + N + " elementos del vector (separados por espacios):");
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}


