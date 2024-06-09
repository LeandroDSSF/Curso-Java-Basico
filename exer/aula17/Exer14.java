package exer.aula17;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° numero");
            numero = scan.nextInt();

            if (numero % 2 != 0) {
                impar++;
            } else {
                par++;
            }
        }

        System.out.println("A quantidade de numero par é: " + par);
        System.out.println("A quantidade de numero impar é: " + impar);

    }

}
