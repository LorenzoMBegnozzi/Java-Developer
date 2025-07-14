import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("valores digitados: ");
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma total dos números: " + soma);
    }
}