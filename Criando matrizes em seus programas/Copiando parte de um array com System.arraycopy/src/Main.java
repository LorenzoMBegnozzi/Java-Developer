public class Main {
    public static void main(String[] args) {
        String[] nomes = {"ana", "carlos", "joao"};

        String[] copia = new String[2];
        System.arraycopy(nomes, 1, copia,0,2);

        System.out.println("copia principal:");
        for (String nome : copia) {
            System.out.println(nome);
        }
    }
}