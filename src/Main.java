import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int[] numeros = new int[5];

        for (; ; ) {
            System.out.println("1 . RELLENAR");
            System.out.println("2 . SUMAR ARRAY");
            System.out.println("3 . MAXIMO");
            System.out.println("4 . MOSTRAR");
            System.out.println("0 . SALIR");

            int opcion = scanner.nextInt();
            if (opcion == 1) {
                suma = 0;
                max = Integer.MIN_VALUE;
                System.out.println("Introduzca los números");
                for (int i = 0; i < 5; i++) {
                    int numero = scanner.nextInt();

                    numeros[i] = numero;

                    suma = suma + numero;

                    if (numero > max) {
                        max = numero;
                    }
                }

            }
            if (opcion == 2) {
                System.out.println("La suma es: " + suma);
            }
            if (opcion == 3) {
                System.out.println("El máximo es: " + max);
            }
            if (opcion == 4) {
                System.out.println("Mostrar números: ");
                for (int i = 0; i < 5; i++) {
                    System.out.println(numeros[i]);

                }
            }
            if (opcion == 0) {
                System.out.println("GoodBye");
                break;
            }
        }


    }
}