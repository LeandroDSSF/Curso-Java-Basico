package exer.aula19;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] VetorA = new double[10];
        boolean flag = true;

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor");
            VetorA[i] = scan.nextDouble();

            if (VetorA[i] % 2 != 0) {
                System.out.println("Impar " + VetorA[i]);
                break;
            }
            /*
             * for (int j = 0; j < VetorA.length; j++) {
             * if (VetorA[i] % 2 == 0) {
             * System.out.println("Par " + VetorA[i]);
             * 
             * } else {
             * System.out.println("Impar " + VetorA[i]);
             * break;
             * }
             * 
             * }
             */

        }

    }

}
