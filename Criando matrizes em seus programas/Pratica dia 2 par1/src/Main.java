import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int [] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("informe o numero: " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("numeros digitados");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}