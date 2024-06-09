package exer.aula19;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores no VetorA " + (i + 1));
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }      

        System.out.println("\nOs valores no VetorB será");
        for (int b : vetorB) {
            System.out.println(b);
        }

    }

}
