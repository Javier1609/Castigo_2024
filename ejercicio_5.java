public class ejercicio_5 {
    public static void main(String[] args) {
        imprimirTablasMultiplicar(10);
    }


    public static void imprimirTablasMultiplicar(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
