import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        System.out.printf("numeros gerados: ");
        for (int n : numeros) {
            System.out.printf(n + " ");
        }

        int maior = Integer.MIN_VALUE;
        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        System.out.printf("");


        int contador = 0;

        System.out.printf("\nmaior numeros" + maior);
        System.out.printf("\nposicoes onde aparece: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maior) {
                System.out.printf(i + "");
                contador++;
            }
        }
        System.out.printf("\nQuantas vezes o maior numeros aparece: " + contador);
    }
}