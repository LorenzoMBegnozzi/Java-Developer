import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        System.out.printf("\nNumeros antes da ordenção: ");
        mostrarArray(numeros);


        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.printf("\nnumeros depois da ordeção: ");
        mostrarArray(numeros);

        System.out.printf("\nmaior numero: " + numeros[0]);
        System.out.printf("\nmenor numeros: " + numeros[numeros.length - 1]);
    }

    public static void mostrarArray(int[] array){
        for (int num : array){
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}