import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[10];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            vet1[i] = random.nextInt(10);
            vet2[i] = random.nextInt(10);
        }

        System.out.print("Array 1 original: ");
        mostrarArray(vet1);

        System.out.print("Array 2 original: ");
        mostrarArray(vet2);

        // ORDENAR vet1 e vet2
        bubbleSort(vet1);
        bubbleSort(vet2);

        System.out.print("Array 1 ordenado: ");
        mostrarArray(vet1);

        System.out.print("Array 2 ordenado: ");
        mostrarArray(vet2);

        // Juntar vet1 e vet2 em vet3
        for (int i = 0; i < 5; i++) {
            vet3[i] = vet1[i];
            vet3[i + 5] = vet2[i];
        }

        System.out.print("Array 3 (junção dos dois): ");
        mostrarArray(vet3);

        // Ordenar vet3
        bubbleSort(vet3);

        System.out.print("Array 3 ordenado: ");
        mostrarArray(vet3);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporario = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporario;
                }
            }
        }
    }

    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // quebra de linha
    }
}
