package exer.aula17;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base numero");
        int base = scan.nextInt();

        System.out.println("Digite o expoente numero");
        int pot  = scan.nextInt();

        double result = base;

        for (int i = 1; i < pot; i++) {           
            result *= base;
        }

        System.out.println("Valor será " + result);

    }

}
