
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Main {
    private static boolean encontrado;

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        boolean var2 = false;
        int[] var3 = new int[8];
        System.out.println("Digite 15 numeros inteiros:");

        for (int var4 = 0; var4 < var3.length; ++var4) {
            System.out.print("Numero " + (var4 + 1) + ": ");
            var3[var4] = var1.nextInt();
        }

        System.out.println("digite um numero para ser buscado");
        int var8 = var1.nextInt();
        int[] var9 = var3;
        int var5 = var3.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            int var7 = var9[var6];
            if (var7 == var8) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado.");
        }

    }
}
