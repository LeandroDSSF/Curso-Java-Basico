package leandro.cursojava.aula20;

public class MatrizesTresDimesoes {
    public static void main(String[] args) {

        int[][][] matriz3 = new int[3][3][3];

        int somaPar = 0;
        int somaImpar = 0;
        int somaTotal = 0;

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                for (int k = 0; k < matriz3[i][j].length; k++) {
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    matriz3[i][j][k] = i + j + k;
                    somaTotal += matriz3[i][j][k];
                }
            }
        }

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                for (int k = 0; k < matriz3[i][j].length; k++) {
                    if (matriz3[i][j][k] % 2 == 0) {
                        somaPar += matriz3[i][j][k];
                    } else {
                        somaImpar += matriz3[i][j][k];
                    }

                }

            }

        }
        System.out.println();
        System.out.println("Soma Par " + somaPar);
        System.out.println("Soma Impar " + somaImpar);
        System.out.println("Soma Total " + somaTotal);

    }
}
