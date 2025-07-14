import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[5];
        int tamanho = numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = tamanho - 1; i >= 0 ; i--) {
            System.out.print(numeros[i] + "\n");
        }
    }
}