import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        for (int n : numeros) {
            System.out.println(n);
        }

        System.out.println("------------------");

        System.out.println(Arrays.toString(numeros));
    }
}