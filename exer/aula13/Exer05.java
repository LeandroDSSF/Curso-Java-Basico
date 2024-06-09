package exer.aula13;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor em Metros");
		double metros = scan.nextDouble();

		System.out.println("O valor em CM é : " + metros * 100);

	}

}
