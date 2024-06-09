package exer.aula19;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] Notas1 = new double[10];
        double[] Notas2 = new double[Notas1.length];
        double[] Result = new double[Notas1.length];

        for (int i = 0; i < Notas1.length; i++) {
            System.out.println("Digite a primeira nota do aluno " + (i + 1));
            Notas1[i] = scan.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + (i + 1));
            Notas2[i] = scan.nextDouble();

            Result[i] = (Notas1[i] + Notas2[i]) / 2;
        }

        for (int i = 0; i < Result.length; i++) {

            if (Result[i] >= 7) {
                System.out.println("Aprovado aluno " + (i + 1));
                System.out.println(Result[i]);
            }else{
                System.out.println("Reprovado aluno " + (i + 1));
                System.out.println(Result[i]);

            }
        }

    }

}
