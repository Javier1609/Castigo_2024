import java.util.ArrayList;

public class ejercicio_3 {
    public static void main(String[] args) {
        ArrayList<Integer> multiplosDe5 = new ArrayList<>();
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                multiplosDe5.add(i);
                suma += i;
            }
        }
        System.out.println("Múltiplos de 5 comprendidos entre 1 y 100:");
        for (int numero : multiplosDe5) {
            System.out.println(numero);
        }
        System.out.println("La suma de los múltiplos de 5 es: " + suma);
        System.out.println("Cantidad de múltiplos de 5: " + multiplosDe5.size());
    }
}
