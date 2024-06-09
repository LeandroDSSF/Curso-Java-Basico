package exer.aula19;

import java.util.Scanner;

public class Exer35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            VetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Analizando o numero " + VetorA[i]);

            for (int j = 1; j < VetorA[i]; j++) {
                if (VetorA[i] % j == 0) {
                    System.out.println(j + " è divisor");
                }
            }

            System.out.println();
        }
    }

}
