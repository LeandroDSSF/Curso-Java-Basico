package exer.aula20;

import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {
        int[][] numeroAleatorios = new int[10][10];
        Random numeroRandom = new Random();

        for (int i = 0; i < numeroAleatorios.length; i++) {
            for (int j = 0; j < numeroAleatorios[i].length; j++) {
                numeroAleatorios[i][j] = numeroRandom.nextInt(10);

            }
        }

        System.out.println("O valor entre 0 e 9 ");
        for (int i = 0; i < numeroAleatorios.length; i++) {
            for (int j = 0; j < numeroAleatorios.length; j++) {
                System.out.print(numeroAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = -1;
        int menorL5 = 11;
        int linha5 = 5;

        for (int j = 0; j < numeroAleatorios[linha5].length; j++) {
            if (numeroAleatorios[linha5][j] > maiorL5) {
                maiorL5 = numeroAleatorios[linha5][j];

            }
            if (numeroAleatorios[linha5][j] < menorL5) {
                menorL5 = numeroAleatorios[linha5][j];
            }
        }

        System.out.println("O maior valor da linha 5 é " + maiorL5);
        System.out.println("O menor valor da linha 5 é " + menorL5);

        int maiorC7 = -1;
        int menorC7 = 11;
        int coluna7 = 7;

        for (int i = 0; i < numeroAleatorios.length; i++) {
            if (numeroAleatorios[i][coluna7] > maiorC7) {
                maiorC7 = numeroAleatorios[i][coluna7];
            }
            if (numeroAleatorios[linha5][i] < menorC7) {
                menorC7 = numeroAleatorios[i][coluna7];
            }
        }
        System.out.println("O maior valor da coluna 7 é " + maiorC7);
        System.out.println("O menor valor da coluna 7 é " + menorC7);

        System.out.println();

    }

}
