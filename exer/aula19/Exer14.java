package exer.aula19;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        int soma = 0;
        int cont = 0;
        
        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            VetorA[i] = scan.nextInt();

            if (VetorA[i] % 2 != 0) {
                soma += VetorA[i];
                cont++;
            }

        }

        System.out.println();
        System.out.println("Media: " + (soma / cont));
        System.out.println("Quantidade: " + cont);

    }

}
