import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] numoros = new int[10];
        Random random = new Random();

        // Gerando números aleatórios
        for (int i = 0; i < numoros.length; i++) {
            numoros[i] = random.nextInt(10);
        }

        System.out.println("Numeros gerados sem ordenação:");
        mostrarArray(numoros);

        // Bubble Sort corrigido
        for (int i = 0; i < numoros.length - 1; i++) {
            for (int j = 0; j < numoros.length - 1 - i; j++) {
                if (numoros[j] > numoros[j + 1]) {
                    int temp = numoros[j];
                    numoros[j] = numoros[j + 1];
                    numoros[j + 1] = temp;  // <- correção aqui
                }
            }
        }

        System.out.println("\nNumeros ordenados:");
        mostrarArray(numoros);

        System.out.println("\nMenor número: " + numoros[0]);
        System.out.println("Maior número: " + numoros[numoros.length - 1]);
    }

    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
