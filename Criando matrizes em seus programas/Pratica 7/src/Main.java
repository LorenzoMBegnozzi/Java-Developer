import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[5];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("digite o numero na posicao " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int n : numeros) {
            soma += n;
        }

        media = soma/numeros.length;
        System.out.println(media);
    }
}