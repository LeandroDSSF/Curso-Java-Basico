package exer.aula19;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor");
            VetorA[i] = scan.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < (VetorA.length / 2); i++) {
            if (VetorA[i] != VetorA[VetorA.length - 1 - i]) {
                palindromo = false;
                break;

            }
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");
        }
        System.out.println();
        if (palindromo) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não é Palindromo");
        }
    }

}
