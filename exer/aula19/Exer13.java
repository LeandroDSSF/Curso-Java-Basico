package exer.aula19;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        int soma = 0;

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            VetorA[i] = scan.nextInt();

            if (VetorA[i] % 5 == 0) {
                soma += VetorA[i];
            }

        }

        System.out.println();
        System.out.println("Soma: " + soma);

        
    }

}
