package exer.aula19;

import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VetorA = new int[5];

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A");
            VetorA[i] = scan.nextInt();
        }

        boolean primo;
        String msg;

        for (int i = 0; i < VetorA.length; i++) {
            primo = true;
            for (int j = 2; j < VetorA[i]; j++) {
                if (VetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";

            if (primo) {
                msg = " Primo";
            } else {
                msg = " Não é primo";
            }

            System.out.println(VetorA[i] + msg);

        }
    }

}
