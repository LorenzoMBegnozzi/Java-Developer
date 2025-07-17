import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"ana", "carlos", "joao"};

        String[] copia2 = Arrays.copyOfRange(nomes, 0,2);
        //vai copiar os dois primeiros nomes

        System.out.println("Cópia com Arrays.copyOfRange: ");
        System.out.println(Arrays.toString(copia2));
    }
}