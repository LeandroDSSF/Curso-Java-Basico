package exer.aula19;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];
        int par = 0;

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            VetorA[i] = scan.nextInt();

        }

        System.out.print("Valores Pares ");
        for (int i = 0; i < VetorA.length; i++) {
            if (VetorA[i] % 2 == 0) {
                System.out.print(" " + VetorA[i]);
                par++;
            }
        }
        System.out.println(" ");
        System.out.print("Valores Pares ");
        for (int j = 0; j < VetorA.length; j++) {
            if (VetorA[j] % 2 != 0) {
                System.out.print(" " + VetorA[j]);
            }
        }

        double porcPar = (par * 100) / VetorA.length;
        double porcImp = 100 - porcPar;

        System.out.println(" ");
        System.out.println("Porcentagem Pares " + porcPar);
        System.out.println("Porcentagem Pares " + porcImp);

        System.out.println(" ");

    }
}
