import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];
        int soma = 0;
        int media = 0;
        int acimaMedia = 0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int n : numeros) {
            soma += n;
        }

        media = soma / numeros.length;
        for (int n : numeros) {
            if (n > media) {
                acimaMedia += 1;
            }
        }

        System.out.println(acimaMedia);

    }
}