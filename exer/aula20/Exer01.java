package exer.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        int[][] numeroAleatorios = new int[4][4];
        Random numeroRandom = new Random();

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int col = 0;

        for (int i = 0; i < numeroAleatorios.length; i++) {
            for (int j = 0; j < numeroAleatorios[i].length; j++) {
                numeroAleatorios[i][j] = numeroRandom.nextInt(10);

                if (numeroAleatorios[i][j] > maior) {
                    maior = numeroAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        System.out.println("O valor entre 0 e 9 ");
        for (int i = 0; i < numeroAleatorios.length; i++) {
            for (int j = 0; j < numeroAleatorios.length; j++) {
                System.out.print(numeroAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O maior valor é " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + col);

        System.out.println();
    }
}
