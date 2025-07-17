import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int [] numeros = new int[10];
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        System.out.printf("numeros gerados: ");
        for(int n : numeros){
            System.out.printf(n + " ");
        }

        int numeroUsuario;
        System.out.printf("\ninforme um numero: ");
        numeroUsuario = scanner.nextInt();

        int maior = 0;

        for (int n : numeros){
            if (n > numeroUsuario){
                maior++;
            }
        }

        System.out.printf("existem " + maior + " numeros maior que o numero " + numeroUsuario);
    }
}