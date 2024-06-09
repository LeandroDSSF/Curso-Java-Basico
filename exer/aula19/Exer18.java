package exer.aula19;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[10];     

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1));
            VetorA[i] = scan.nextInt();

        }

           
        int menor = VetorA[0];
        int maior = VetorA[0];
        int menorPos = 0;
        int maiorPos = 0;

        for (int i = 1; i < VetorA.length; i++) {
            if (VetorA[i] < menor) {
                menor = VetorA[i];
                menorPos = i;

            } else if (VetorA[i] > maior) {
                maior = VetorA[i];
                maiorPos = i;

            }
        }
        System.out.println();
        System.out.print("Menor idade: " + menor);
        System.out.print(" indice menor: " + menorPos);
        System.out.println();
        System.out.print("Maior idade: " + maior);
        System.out.print(" indice maior: " + maiorPos);

        System.out.println();
    }

}
