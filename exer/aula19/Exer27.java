package exer.aula19;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];
        char[] VetorB = new char[VetorA.length];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor");
            VetorA[i] = scan.nextInt();

            if (VetorA[i] < 7) {
                VetorB[i] = 'a';

            } else if (VetorA[i] == 7) {
                VetorB[i] = 'b';

            } else if (VetorA[i] > 7 && VetorA[i] < 10) {
                VetorB[i] = 'c';

            } else if (VetorA[i] == 10) {
                VetorB[i] = 'd';

            } else if (VetorA[i] > 10) {
                VetorB[i] = 'e';

            }

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
    }

}
