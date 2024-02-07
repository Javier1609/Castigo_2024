import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);
        System.out.print("Los factores primos de " + numero + " son: ");
        for (int i = 0; i < factoresPrimos.length; i++) {
            if (i > 0) {
                System.out.print(" * ");
            }
            System.out.print(factoresPrimos[i]);
        }

        scanner.close();
    }

    public static int[] descomponerEnFactoresPrimos(int numero) {
        int[] factoresPrimos = new int[100]; // Tamaño inicial del array
        int indice = 0;

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos[indice++] = i;
                numero /= i;
            }
        }

        int[] resultado = new int[indice];
        System.arraycopy(factoresPrimos, 0, resultado, 0, indice);
        return resultado;
    }
}
