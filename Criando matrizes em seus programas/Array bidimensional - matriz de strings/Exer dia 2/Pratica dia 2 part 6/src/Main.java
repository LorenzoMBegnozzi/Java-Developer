import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("numeros gerados: ");
        for (int n : numeros) {
            System.out.println(n + "");
        }

        System.out.println("\nMaior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }
}