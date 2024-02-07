import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int i = 0; i < factoresPrimos.size(); i++) {
            System.out.print(factoresPrimos.get(i));
            if (i < factoresPrimos.size() - 1) {
                System.out.print(" * ");
            }
        }

        scanner.close();
    }
    public static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        while (numero % 2 == 0) {
            factoresPrimos.add(2);
            numero /= 2;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }
        if (numero > 2) {
            factoresPrimos.add(numero);
        }

        return factoresPrimos;
    }
}

