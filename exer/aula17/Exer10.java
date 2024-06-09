package exer.aula17;

import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class Exer10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println("O intervalo sená " + i);
            }

        } else {            
            for (int i = num1 -1 ; i > num2; i--) {
                System.out.println("O intervalo sená " + i);
            }

        }

    }

}
