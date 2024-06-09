package exer.aula15;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - File Duplo / 2 - Alcatrar / 3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Digite a quantidade de carne em (Kg)");
        double qtdCarne = scan.nextDouble();
        double precoCarne = 0;

        switch (tipo) {
            case 1:
                System.out.println(qtdCarne + "Kg File Duplo");

                if (qtdCarne < 5) {
                    precoCarne = 4.90;
                } else {
                    precoCarne = 5.80;
                }

                break;

            case 2:
                System.out.println(qtdCarne + "Kg Alcatrar ");
                if (qtdCarne < 5) {
                    precoCarne = 5.90;
                } else {
                    precoCarne = 6.80;
                }
                break;

            case 3:
                System.out.println(qtdCarne + "Kg Picanha");
                if (qtdCarne < 5) {
                    precoCarne = 6.90;
                } else {
                    precoCarne = 7.80;
                }
                break;

            default:
                break;
        }

        System.out.println("Possi o cartão Tabajara? 1 para sim ");
        int cartao = scan.nextInt();
        double valorTotal = qtdCarne * precoCarne;
        double desconto = 0;

        if (cartao == 1) {
            desconto = (valorTotal * 0.05);
            System.out.println("Desconto de " + desconto);
            System.out.println("Valor da compra com desconto " + (valorTotal - desconto));

        } else {
            System.out.println("Valor da compra sem desconto " + valorTotal);
        }

    }

}
