package exer.aula15;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° numero");
        double n1 = scan.nextDouble();

        System.out.println("Digite o 2° numero");
        double n2 = scan.nextDouble();

        if (n1 > n2) {
            System.out.println("1° é maior: " + n1);
        } else {
            System.out.println("2° é maior: " + n2);
        }
    }

}
