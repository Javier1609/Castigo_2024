import java.util.Scanner;
import java.util.Random;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Llamar a la función para rellenar y mostrar la matriz simétrica
        rellenarYMostrarMatrizSimetrica(dimension);

        scanner.close();
    }

    // Función para rellenar y mostrar una matriz cuadrada simétrica
    public static void rellenarYMostrarMatrizSimetrica(int dimension) {
        // Crear la matriz cuadrada
        int[][] matriz = new int[dimension][dimension];

        // Rellenar la mitad superior de la matriz con números aleatorios
        Random random = new Random();
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }

        // Copiar la mitad superior de la matriz a la mitad inferior para hacerla simétrica
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < i; j++) {
                matriz[i][j] = matriz[j][i];
            }
        }

        // Imprimir la matriz por pantalla
        System.out.println("Matriz simétrica generada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

