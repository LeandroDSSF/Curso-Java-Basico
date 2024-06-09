package exer.aula19;

import java.util.Scanner;

public class Exer36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] VetorA = new double[11];

        for (int i = 0; i < VetorA.length; i++) {

            VetorA[i] = Math.pow(2, i);
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");
        }
        System.out.println();
    }

}
