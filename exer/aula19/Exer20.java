package exer.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");
        double[] VetorA = new double[5];

        System.out.println("Entre com a cotação do dolar: ");
        double contacao = scan.nextDouble();

        for (int i = 0; i < VetorA.length; i++) {
            VetorA[i] = contacao * (i + 1);
        }

        for (int i = 0; i < VetorA.length; i++) {
            System.out.println("A contação sera " + df.format(VetorA[i]));
        }

    }

}
