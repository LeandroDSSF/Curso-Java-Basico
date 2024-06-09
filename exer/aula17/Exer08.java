package exer.aula17;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        double soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero");
            numero = scan.nextInt();

            soma += numero;
        }

        media = soma / 5;

        System.out.println("A soma foi " + soma);
        System.out.println("A media é " + media);

    }

}
