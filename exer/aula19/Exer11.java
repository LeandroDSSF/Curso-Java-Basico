package exer.aula19;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        int cont = 0;

        int[] VetorA = new int[10];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            VetorA[i] = scan.nextInt();
        }

        System.out.print("Valores pares = ");
        for (int j = 0; j < VetorA.length; j++) {

            if (VetorA[j] % 2 == 0) {
                System.out.print((VetorA[j] + " "));
                cont++;
            }
        }
        System.out.println();
        System.out.println("Qtd valores pares " + (cont));
    }

}
