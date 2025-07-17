import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }
        }

        System.out.println("Numeros gerados:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Maior numero: " + maior + "\nMenor numero:" + menor);

    }
}
