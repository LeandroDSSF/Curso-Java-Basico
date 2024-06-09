package leandro.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o (quantidade) de pessoas que seram entrevistas");
        int numeroEntrevistados = scan.nextInt();

        String[][] nomeFilhos = new String[numeroEntrevistados][];
        int qtdFilhos;

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Entre com a (quantidade) de filhos da pessoa " + (i + 1));
            qtdFilhos = scan.nextInt();
            nomeFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Digite o (nome) do Filho " + (j + 1));
                nomeFilhos[i][j] = scan.next();

            }
        }
        
        System.out.println();
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomeFilhos[i].length + " filhos.");
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println(nomeFilhos[i][j]);
            }
            System.out.println();

        }
    }
}
