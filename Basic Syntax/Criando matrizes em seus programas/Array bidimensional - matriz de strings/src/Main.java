public class Main {
    public static void main(String[] args) {
        String[][] saudacoes = {
                {"Sr. ", "Sra. ", "Srta. "},
                {"Silva", "Souza"}
        };

        System.out.println("Saudações combinadas:");
        System.out.println(saudacoes[0][0] + saudacoes[1][0]);
        System.out.println(saudacoes[0][2] + saudacoes[1][1]);
    }
}