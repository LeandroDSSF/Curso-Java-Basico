package exer.aula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor/hora");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês");
		double numHora = scan.nextDouble();
		
		System.out.println("O total referido ao mês é: " + (valorHora * numHora));
		
		
		
		
	}

}
