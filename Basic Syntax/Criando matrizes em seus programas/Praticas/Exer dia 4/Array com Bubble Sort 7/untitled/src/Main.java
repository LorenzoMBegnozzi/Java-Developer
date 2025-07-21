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

        System.out.printf("array no pelo: ");
        mostrar(numeros);

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if(numeros[j] > numeros[j + 1]){
                    int tempo = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j + 1] = tempo;
                }
            }
        }

        //remover duplicados
        int[] semDuplicados = new int[numeros.length];
        int index = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0 || numeros[i] != numeros[i - 1]){
                semDuplicados[index] = numeros[i];
                index++;
            }
        }

        System.out.printf("numeros ordenados: ");
        mostrar(numeros);
    }

    public static void mostrar(int[] array) {
        for (int num : array) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}