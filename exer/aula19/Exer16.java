package exer.aula19;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];

        double somaIgual = 0;
        double somaInf = 0;
        double mediaSupe = 0;
        int contInf = 0;
        int contIgual = 0;
        int contSupe = 0;

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o valor");

            VetorA[i] = scan.nextInt();

        }

        for (int i = 0; i < VetorA.length; i++) {

            if (VetorA[i] < 15) {
                somaInf += VetorA[i];
                contInf++;
            }

            if (VetorA[i] == 15) {
                contIgual++;
            }

            if (VetorA[i] > 15) {
                mediaSupe += VetorA[i];
                contSupe++;
            }
        }

        System.out.println(" ");
        System.out.println("Soma inferior < 15: " + (somaInf));
        System.out.print("Quantidade de elementos == 15: " + contIgual);
        System.out.println(" ");
        System.out.println("Media do valores > 15: " + (mediaSupe / contSupe));

    }

}
