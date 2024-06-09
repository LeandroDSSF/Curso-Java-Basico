package exer.aula15;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        double a = scan.nextDouble();

        System.out.println("Digite o valor de B");
        double b = scan.nextDouble();

        System.out.println("Digite o valor de C");
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = 0;
        double x2 = 0;

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau");
        } else if (delta < 0) {
            System.out.println("Delta negativo");
        } else if (delta >= 0) {
            System.out.println("Delta = " + delta);
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

    }

}
