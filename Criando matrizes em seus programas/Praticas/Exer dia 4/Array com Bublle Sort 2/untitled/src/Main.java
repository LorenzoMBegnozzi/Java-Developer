import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(99);
        }

        System.out.printf("antes da ordenação: ");
        mostrarArray(numeros);

        //bublle sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1] ){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.printf("\nDepois da ordenação: ");
        mostrarArray(numeros);
    }

    public static void mostrarArray(int[] array){
        for (int num : array) {
            System.out.printf(num + " ");
        }
    }
}