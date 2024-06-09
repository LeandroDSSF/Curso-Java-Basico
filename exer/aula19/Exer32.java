package exer.aula19;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[5];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite a tabuada");
            VetorA[i] = scan.nextInt();
        }

        System.out.println("Tabuada");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i]);
        }

        System.out.println();

        for (int i = 0; i < VetorA.length; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(j + " * " + VetorA[i] + " = " + VetorA[i] * j);
            }
            System.out.println();
        }

    }

}
