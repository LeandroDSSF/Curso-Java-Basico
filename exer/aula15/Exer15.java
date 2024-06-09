package exer.aula15;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° lado do triângulo");
        int l1 = scan.nextInt();

        System.out.println("Digite o 2° lado do triângulo");
        int l2 = scan.nextInt();

        System.out.println("Digite o 3° lado do triângulo");
        int p3 = scan.nextInt();

        if ((l1 + l2) > p3 || (l2 + p3) > l1 || (p3 + l1) > l2) {

            if (l1 == l2 && l2 == p3 && l1 == p3) {
                System.out.println("Triângulo Equilátero");
            } else if (l1 == l2 || l2 == p3 || l1 == p3) {
                System.out.println("Triângulo Isósceles");

            } else if (l1 != l2 && l2 != p3 && l1 != p3) {
                System.out.println("Triângulo Escalano");

            }
        } else {
            System.out.println("Não é um triangulo");
        }

    }

}
