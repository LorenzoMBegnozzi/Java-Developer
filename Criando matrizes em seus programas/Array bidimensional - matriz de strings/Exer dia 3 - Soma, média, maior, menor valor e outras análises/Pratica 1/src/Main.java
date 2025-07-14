import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[2];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        int soma = 0;

        for (int n : numeros) {
            soma += n ;
        }

        int media = soma / numeros.length;

        System.out.println("Numeros gerados:");
        for (int n : numeros){
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("\nSoma: " + soma);
        System.out.println("Media: " + media);
    }
}
