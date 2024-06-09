package exer.aula15;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1° nota");
        double n1 = scan.nextDouble();

        System.out.println("Digite a 2° nota");
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;

        String conceito = "";

        if (media >= 9 && media <= 10) {
            System.out.println("Aprovado");
            conceito = "A";
        } else if (media >= 7.5) {
            System.out.println("Aprovado");
            conceito = "B";

        } else if (media >= 6) {
            System.out.println("Aprovado");
            conceito = "C";

        } else if (media >= 4) {
            System.out.println("Reprovado");
            conceito = "D";

        } else if (media < 4) {
            System.out.println("Reprovado");
            conceito = "E";
        }

        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Media: " + media);
        System.out.println("Conceito: " + conceito);

        switch (conceito) {
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;

            case "D":
            case "E":
                System.out.println("REPROVADO");
                break;
        }

    }

}
