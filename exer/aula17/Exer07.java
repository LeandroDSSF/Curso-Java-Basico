package exer.aula17;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
                System.out.println("O maior numero mudou: " + maior);
            }

        }
        System.out.println("O maior valor informado foi " + maior);

    }

}