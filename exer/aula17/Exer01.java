package exer.aula17;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = true;

        do {
            System.out.println("Digite a nota entre 0 e 10");
            double nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor invalido, digite novamente");
            } else {
                System.out.println("Nota valida " + nota);
                notaValida = false;
            }

        } while (notaValida);

    }

}
