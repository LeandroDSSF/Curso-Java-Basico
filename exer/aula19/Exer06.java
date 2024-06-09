package exer.aula19;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do VetorA da posição: " + (i));
            vetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor do VetorB da posição: " + (i));
            vetorB[i] = scan.nextInt();

        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];

        }
        System.out.print("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.print("\nVetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.print("\nVetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }

}
