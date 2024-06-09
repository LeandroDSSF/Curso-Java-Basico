package exer.aula13;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a 1° nota");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a 2° nota");
		double nota2 = scan.nextDouble();

		System.out.println("Digite a 3° nota");
		double nota3 = scan.nextDouble();

		System.out.println("Digite a 4° nota");
		double nota4 = scan.nextDouble();

		System.out.println("Á soma dos valores é : " + (nota1 + nota2 + nota3 + nota4) / 4);

	}

}
