public class Main {
    public static void main(String[] args) {
        String[][] saudacoes = {
                {"Sr. ", "Sra. ", "Srta. "},
                {"Silva", "Souza"}
        };

        System.out.println("Percorrendo a matriz:");
        for (int i = 0; i < saudacoes.length; i++) {
            for (int j = 0; j < saudacoes[i].length; j++) {
                System.out.println("saudacoes[" + i + "][" + j + "] = " + saudacoes[i][j]);
            }
        }
    }
}