package exer.aula19;

import java.util.Scanner;

public class Exer29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];
        int[] VetorB = new int[VetorA.length];
        int[] VetorC = new int[VetorA.length * 2];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            VetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < VetorB.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor B");
            VetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < VetorC.length / 2; i++) {
            VetorC[i] = VetorA[i];
        }
        for (int i = 0; i < VetorC.length / 2; i++) {
            VetorC[VetorA.length + i] = VetorB[i];
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");

        for (int i = 0; i < VetorB.length; i++) {
            System.out.print(VetorB[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor C = ");

        for (int i = 0; i < VetorC.length; i++) {
            System.out.print(VetorC[i] + " ");
        }

        System.out.println();
    }

}
