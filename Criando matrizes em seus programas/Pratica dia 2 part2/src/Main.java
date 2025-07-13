import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("informe um numero " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("numeros digitados ");
        for (int n : numeros) {
            System.out.println(n);
        };
    }
}