import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();
        int pares = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares += 1;
            } else {
                impar += 1;
            }
        }

        System.out.println("numeros gerados");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("impar " + impar + "/ par " + pares);

    }
}