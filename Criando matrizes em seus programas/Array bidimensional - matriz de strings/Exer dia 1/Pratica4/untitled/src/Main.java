import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int n : numeros){
            if (n > maior){
                maior = n;
            }if (n < menor){
                menor = n;
            }
        }

        System.out.println("menor numero: " + menor);
        System.out.println("maior numero: " + maior);

        scanner.close();

    }
}