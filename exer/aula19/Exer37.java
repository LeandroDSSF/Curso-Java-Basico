package exer.aula19;

import java.util.Scanner;

public class Exer37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[15];
        int[] VetorB = new int[VetorA.length];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            VetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < VetorA.length; i++) {
            VetorB[i] = 1;
            for (int j = 1; j < VetorA[i]; j++) {
                VetorB[i] *= j;
            }

        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");

        for (int i = 1; i < VetorA.length; i++) {
            System.out.print(VetorB[i] + " ");
        }
        System.out.println();
    }

}
