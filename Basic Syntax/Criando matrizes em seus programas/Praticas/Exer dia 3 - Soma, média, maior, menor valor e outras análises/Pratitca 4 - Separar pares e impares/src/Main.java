import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numero = new int[10];
        Random random = new Random();
        int impar = 0;
        int par = 0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(10);
        }

        System.out.println("Números gerados:");
        for (int n : numero) {
            System.out.println(n);
        }

        System.out.println("Números pares:");
        for (int n : numero) {
            if (n % 2 == 0) {
                System.out.println(n);
                par++;
            }
        }

        System.out.println("Números impares:");
        for (int n : numero) {
            if (n % 2 != 0) {
                System.out.println(n);
                impar++;
            }
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);

    }
}
