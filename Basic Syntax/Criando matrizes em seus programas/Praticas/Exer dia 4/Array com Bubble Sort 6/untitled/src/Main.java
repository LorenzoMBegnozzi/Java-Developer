import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        System.out.printf("numeros gerados fora de ordem: ");
        mostrarArray(numeros);

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int tempo = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tempo;
                }
            }
        }

        System.out.println("\nNúmeros ordenados (ordem decrescente):");
        mostrarArray(numeros);
    }


    public static void mostrarArray(int[] array) {
        for (int n : array) {
            System.out.printf(n + " ");
        }
        System.out.println();
    }
}