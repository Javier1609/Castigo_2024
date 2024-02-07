import java.util.Scanner;
import java.util.Random;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int dimension = scanner.nextInt();
        rellenarYMostrarMatrizSimetrica(dimension);
        scanner.close();
    }
    public static void rellenarYMostrarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];

        Random random = new Random();
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < i; j++) {
                matriz[i][j] = matriz[j][i];
            }
        }
        System.out.println("Matriz simétrica generada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

