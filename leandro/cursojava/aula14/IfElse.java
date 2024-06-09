package leandro.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * int idade = scan.nextInt();
         * 
         * if (idade >= 18) {
         * System.out.println("È maior de idade.");
         * 
         * } else {
         * System.out.println("Não é maior de idade.");
         * }
         */

        System.out.println("Valor do produto");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato.");
        } else if (valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Esta muito caro");
        }
    }

}
