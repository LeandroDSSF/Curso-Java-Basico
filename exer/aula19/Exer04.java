package exer.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");

        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores no VetorA " + (i + 1));
            vetorA[i] = scan.nextInt();            
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.print("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.print("\nVetor B = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }

    }

}
