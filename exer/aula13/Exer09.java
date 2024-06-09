package exer.aula13;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em Farenheit");
		double f = scan.nextDouble();

		double c = (5 * (f - 32) / 9);

		System.out.println("O valor em Celsius será: " + c);

	}

}
