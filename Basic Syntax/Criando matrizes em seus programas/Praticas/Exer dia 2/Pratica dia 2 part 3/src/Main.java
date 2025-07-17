import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randon = new Random();
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = randon.nextInt(100);
        }

    }
}
