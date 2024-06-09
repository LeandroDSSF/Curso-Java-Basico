package exer.aula15;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A-Alcool ou G-Gasolina");
        String tipo = scan.next();

        System.out.println("Qual a quantidade de litros?");
        double litros = scan.nextDouble();

        double precoGas = 2.5;
        double precoAlc = 1.9;

        double valor = 0;
        double pagar = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                valor = (precoAlc * litros);
                pagar = valor - (valor * 0.03);
                System.out.println("Desconto de 3% " + pagar);
            } else {
                valor = (precoAlc * litros);
                pagar = valor - (valor * 0.05);
                System.out.println("Desconto de 5% " + pagar);
            }

        } else {
            if (litros <= 20) {
                valor = (precoAlc * litros);
                pagar = valor - (valor * 0.04);
                System.out.println("Desconto de 4% " + pagar);
            } else {
                valor = (precoAlc * litros);
                pagar = valor - (valor * 0.06);
                System.out.println("Desconto de 6% " + pagar);
            }

        }

    }

}
