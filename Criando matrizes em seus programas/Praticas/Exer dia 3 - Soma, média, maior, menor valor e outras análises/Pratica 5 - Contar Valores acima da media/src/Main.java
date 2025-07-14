import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numero = new int[5];
        Random random = new Random();
        int soma = 0;
        int media;
        int quantacima = 0;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(10);
        }

        for (int n : numero) {
            soma += n;
        }

        media = soma / numero.length;

        for (int n : numero) {
            if (n > media) {
                quantacima++;
            }
        }

        System.out.println("Números gerados: " + Arrays.toString(numero));
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Quantidade acima da média: " + quantacima);

    }
}
