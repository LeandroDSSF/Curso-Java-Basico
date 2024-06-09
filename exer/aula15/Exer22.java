package exer.aula15;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite em KG de morango");
        double qtdMorango = scan.nextDouble();

        System.out.println("Digite em KG de maça");
        double qtdMaça = scan.nextDouble();

        double precoKgMorango = 0;
        double precoKgMaça = 0;       

        if (qtdMorango <= 5) {
            precoKgMorango = 2.50;

        } else {
            precoKgMorango = 2.20;
        }

        if (qtdMaça <= 5) {
            precoKgMaça = 1.80;
        } else {
            precoKgMaça = 1.50;
        }

        double precoTotalMorango = qtdMorango + precoKgMorango;
        double precoTotalMaça = qtdMaça * precoKgMaça;
        double precoParcial = precoKgMorango + precoKgMaça;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaça) > 8 || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial) / 100) * 10;
            System.out.println("O valor total pago pelo cliente com 10% " + precoTotal);

        } else {
            System.out.println("O valor total pago pelo cliente " + precoTotal);
        }

    }

}
