import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt();
        }

        System.out.printf("numeros gerados: ");
        for (int n : numeros) {
            System.out.printf(n + " ");
        }

        int contador =
        System.out.printf("numeros pares encontrados: ");
    }
}