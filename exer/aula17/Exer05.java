package exer.aula17;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;
        int cont = 0;
        boolean valido = false;
        String resp;

        do {

            do {
                System.out.println("Informe a população A:");
                popA = scan.nextDouble();
                if (popA > 0) {
                    valido = true;
                } else {
                    System.out.println("População 'A' precisa ser maior que 0:");
                }

            } while (!valido);

            valido = false;

            do {
                System.out.println("Informe a taxa de crecimento em '%' da popA ");
                taxaA = scan.nextDouble();

                if (taxaA > 0) {
                    valido = true;
                } else {
                    System.out.println("Taxa 'A' precisa ser maior que 0:");
                }

            } while (!valido);

            valido = false;

            do {
                System.out.println("Informe a população B:");
                popB = scan.nextDouble();
                if (popB > 0) {
                    valido = true;
                } else {
                    System.out.println("População 'B' precisa ser maior que 0:");
                }

            } while (!valido);

            valido = false;

            do {
                System.out.println("Informe a taxa de crecimento em '%' da popB ");
                taxaB = scan.nextDouble();

                if (taxaB > 0) {
                    valido = true;
                } else {
                    System.out.println("Taxa 'B' precisa ser maior que 0:");
                }

            } while (!valido);

            valido = false;

            while (popA < popB) {
                popA += (popA / 100) * taxaA;
                popB += (popB / 100) * taxaB;
                cont++;
            }

            System.out.println("Gostaria de fazer novamente? 'S' ou 'N' ");
            resp = scan.next();

            if (resp.equalsIgnoreCase("s")) {
                valido = true;
                cont = 0;
            } else {
                valido = false;
            }

        } while (valido);

        System.out.println("População A " + popA);
        System.out.println("População B " + popB);
        System.out.println("Será necessario " + cont + " anos");
    }

}
