package exer.aula19;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];
        int cont = 0;

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1));
            VetorA[i] = scan.nextInt();

        }
        for (int i = 0; i < VetorA.length; i++) {
            if (VetorA[i] > 35) {
                cont++;
                
            }
        }
        System.out.println();
        System.out.print("Quantidade de pessoas com + de 35 anos: " + cont);
        System.out.println();
    }
}
