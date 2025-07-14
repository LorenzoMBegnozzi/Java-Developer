import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número na posição " + i + ":");
            numeros[i] = scanner.nextInt();
        }

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares += 1;
                System.out.println(n);
            }
        }
        System.out.println("a quantidade de numeros pares é: " + pares);
    }
}