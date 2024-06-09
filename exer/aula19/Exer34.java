package exer.aula19;

import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            VetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Analizando o numero " + VetorA[i]);

            for (int j = 2; j < VetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println( j + " è par");
                }
            }

            System.out.println();
        }
    }

}
