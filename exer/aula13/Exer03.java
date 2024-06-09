package exer.aula13;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero");
		double result1 = scan.nextDouble();

		System.out.println("Digite outro numero");
		double result2 = scan.nextDouble();

		System.out.println("Á soma dos valores é : " + (result1 + result2));

	}

}
