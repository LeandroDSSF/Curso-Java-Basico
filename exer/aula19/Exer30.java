package exer.aula19;

import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[20];
        int[] VetorB = new int[VetorA.length];
        int[] VetorC = new int[VetorB.length];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            VetorA[i] = scan.nextInt();
        }
        int posB = 0;
        int posC = 0;

        for (int i = 0; i < VetorA.length; i++) {
            if (VetorA[i] % 2 == 0) {
                VetorB[posB] = VetorA[i];
                posB++;
            } else {
                VetorC[posC] = VetorA[i];
                posC++;
            }

        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");

        for (int i = 0; i < posB; i++) {
            System.out.print(VetorB[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor C = ");

        for (int i = 0; i < posC; i++) {
            System.out.print(VetorC[i] + " ");
        }

        System.out.println();
    }

}
