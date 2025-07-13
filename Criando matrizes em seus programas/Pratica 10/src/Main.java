import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
    }
}