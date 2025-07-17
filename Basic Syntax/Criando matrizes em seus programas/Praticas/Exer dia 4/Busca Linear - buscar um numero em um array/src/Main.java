import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20);
        }

        System.out.printf("numeros gerados: \n");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();


        int numeroProcurado;
        System.out.printf("informe um numero para procurar: \n");
        numeroProcurado = scanner.nextInt();

        boolean encontrado = false;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                System.out.printf("\nEncontrado na posição: " + i);
                encontrado = true;
                contador++;
            }
        }

        if (!encontrado) {
            System.out.printf("\n nao encontrado");
        } else {
            System.out.println("\nNúmero encontrado " + contador + " vez(es).");
        }

    }
}