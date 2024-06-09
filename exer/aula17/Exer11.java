package exer.aula17;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();

        double soma = 0;

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println("O intervalo sená " + i);
                soma += i;
            }

        } else {
            for (int i = num1; i >= num2; i--) {
                System.out.println("O intervalo será " + i);
                soma += i;
            }

        }
        System.out.println("A soma no intervalo será " + soma);

    }

}
