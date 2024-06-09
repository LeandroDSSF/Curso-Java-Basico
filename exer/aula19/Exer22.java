package exer.aula19;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < VetorA.length; i++) {
            VetorA[i] = (int) Math.round(Math.random() * 100);

            if (VetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        double porc0 = (qtd0 * 100) / VetorA.length;
        double porc1 = (qtd1 * 100) / VetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Porc0 = " + porc0);
        System.out.println("Porc1 = " + porc1);
    }
}
