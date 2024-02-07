public class ejercicio_1 {
        public static void main(String[] args) {
            int años = 1;
            int meses = 4;
            int dias = 1;

            long segundosTotales = calcularSegundosAnio(años, meses, dias);
            System.out.println("El número total de segundos en " + años + " años, " + meses + " meses y " + dias + " días es: " + segundosTotales);
        }

        public static long calcularSegundosAnio(int años, int meses, int dias) {
            final int diasEnAnio = 365;
            final int horasEnDia = 24;
            final int minutosEnHora = 60;
            final int segundosEnMinuto = 60;

            int segundosTotales = años * diasEnAnio * horasEnDia * minutosEnHora * segundosEnMinuto ;
            int segundosAdicionales = (meses * 30 + dias) * horasEnDia * minutosEnHora * segundosEnMinuto;
            segundosTotales += segundosAdicionales;

            return segundosTotales ;
        }
    }



