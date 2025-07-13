import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numero = new int[8];
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(10,50);
        }

        for (int n : numero) {
            soma += n;
        }

        double media = (double) soma/ numero.length;

        System.out.println("numeros gerados: ");
        System.out.println(Arrays.toString(numero));



        System.out.println("media dos numeros: " + media);
    }
}