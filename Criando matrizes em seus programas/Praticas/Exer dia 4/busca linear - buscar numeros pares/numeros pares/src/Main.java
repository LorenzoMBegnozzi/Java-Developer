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

        System.out.printf("numeros gerados: ");
        for (int n : numeros) {
            System.out.printf(n + " ");
        }

        int contador = 0;
        System.out.printf("\nnumeros pares encontrados nas posicoes: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                System.out.println(i + " ");
                contador++;
            }
        }

        System.out.println("numero total de pares: " + contador);
    }
}