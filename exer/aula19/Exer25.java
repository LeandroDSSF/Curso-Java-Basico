package exer.aula19;

import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];
        int[] VetorB = new int[VetorA.length];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor");
            VetorA[i] = scan.nextInt();

            // if é ?
            // else é o :
            VetorB[i] = (VetorA[i] % 2 == 0) ? 1 : 0;

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
