package exer.aula13;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/*
		 * 11. Faça um programa que peça 2 números inteiros e um número real.
		 * Calcule e mostre:
		 * 
		 * a. O produto do "dobro do primeiro" com "metade do segundo".
		 * b. A soma do triplo do primeiro com o terceiro.
		 * c. O terceiro elevado ao cubo.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite com o primeiro valor inteiro");
		int num1 = scan.nextInt();

		System.out.println("Digite com o segundo valor inteiro");
		int num2 = scan.nextInt();

		System.out.println("Digite um valor real");
		double num3 = scan.nextDouble();

		int produto = (num1 * 2) * (num2 / 2);

		double soma = (num1 * 3) + num3;

		double cubo_num3 = Math.pow(num3, 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo é " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro é " + soma);
		System.out.println("O terceiro elevado ao cubo é " + cubo_num3);

	}

}
