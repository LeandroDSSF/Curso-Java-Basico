package exer.aula13;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do arquivo");
		double tamArq = scan.nextDouble();

		System.out.println("Entre com velocidade da internet");
		double velInter = scan.nextDouble();

		System.out.println("Tempo de download é " + tamArq / velInter);

	}

}
