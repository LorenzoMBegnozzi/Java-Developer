public class Main {
    public static void main(String[] args) {

        //array de inteiro
        int [] numeros = new int [5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println("elementos do array");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + ": " + numeros[i]);
        }
    }
}