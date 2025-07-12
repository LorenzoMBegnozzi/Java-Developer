import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("digite um numeroo:");
        int numero = scanner.nextInt();

        for (int n : numeros) {
            if (n == numero) {
                System.out.println("Número encontrado!");
                return;
            }
        }
        System.out.println("Número NÃO encontrado.");
    }
}