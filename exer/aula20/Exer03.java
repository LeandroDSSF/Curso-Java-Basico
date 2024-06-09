package exer.aula20;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite o valor [" + i + ", " + j + "]");
                numeros[i][j] = scan.nextInt();
                if (numeros[i][j] % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
        }

        System.out.println();
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de valores pares " + qtdPar);
        System.out.println("Quantidade de valores impares " + qtdImpar);
    }

}
