import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();

        // Gerar números aleatórios entre 1 e 20
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
        }

        System.out.printf("Array original: ");
        mostrar(numeros);

        // Ordenar com Bubble Sort (ordem crescente)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if(numeros[j] > numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Remover duplicados do vetor ordenado
        int[] semDuplicados = new int[numeros.length];
        int index = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0 || numeros[i] != numeros[i - 1]) {
                semDuplicados[index] = numeros[i];
                index++;
            }
        }

        // Criar um novo vetor do tamanho exato sem duplicados
        int[] resultadoFinal = new int[index];
        for (int i = 0; i < index; i++) {
            resultadoFinal[i] = semDuplicados[i];
        }

        System.out.printf("Array ordenado sem duplicados: ");
        mostrar(resultadoFinal);
    }

    public static void mostrar(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
