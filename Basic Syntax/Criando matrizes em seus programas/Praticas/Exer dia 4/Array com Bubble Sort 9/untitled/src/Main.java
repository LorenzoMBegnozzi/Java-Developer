import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetA = new int[10];
        int[] vetB = new int[10];

        for (int i = 0; i < 10; i++) {
            vetA[i] = random.nextInt();
            vetB[i] = random.nextInt();
        }

        System.out.printf("vetor a original: ");
        mostrar(vetA);

        System.out.printf("vetor b original: ");
        mostrar(vetB);

    }

    //order crescente
    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    //remover duplicadas
    public static int[] removerDuplicados(int[] vetor) {
        int[] temp = new int[vetor.length];
        int index = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0 || vetor[i] != vetor[i - 1]){
                temp[index++] = vetor[i];
            }
        }

        int[] resultado = new int[index];
        for (int i = 0; i < index; i++) {
            resultado[i] = temp[i];
        }
        return resultado;
    }

    public static void mostrar(int[] array) {
        for (int n : array) {
            System.out.printf(n + " ");
        }
    }
}