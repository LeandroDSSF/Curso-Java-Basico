package exer.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores no VetorA " + (i + 1));
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }
        System.out.print("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.print("\nVetor B = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }

}
