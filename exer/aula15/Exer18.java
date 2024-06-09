package exer.aula15;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double numero = scan.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("È PAR");
        } else {
            System.out.println("È IMPAR");
        }
    }

}
