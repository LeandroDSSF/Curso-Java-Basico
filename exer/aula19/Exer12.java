package exer.aula19;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        int soma = 0;

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            VetorA[i] = scan.nextInt();          
            soma += VetorA[i];
           

        }

        System.out.println();
        System.out.println("A soma dos valores do VetorA: " + soma);

        

    }

}
