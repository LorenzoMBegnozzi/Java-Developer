import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[100];
        int [] frequencia = new int [6];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1,6);
            frequencia[numeros[i] - 1]++;
        }

        System.out.println("frequencia: ");
        for (int i = 0; i < frequencia.length; i++) {
            System.out.println("numero: " + i + 1 + ": " + frequencia[i]);
        }
    }
}