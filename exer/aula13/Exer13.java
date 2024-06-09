package exer.aula13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		/*
		 * 13.Faça um Programa que pergunte quanto você ganha por hora e o número de
		 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
		 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
		 * INSS e 5% para o sindicato, faça um programa que nos dê:
		 * - salário bruto.
		 * a. quanto pagou ao INSS.
		 * b. quanto pagou ao sindicato.
		 * c. o salário líquido.
		 * d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
		 * + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ =
		 * Salário Líquido : R$
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do salário por hora: R$ ");
		double valor_hora = scan.nextDouble();

		System.out.println("Digite o número de horas trabalhadas no mês: ");
		double numero_horas = scan.nextDouble();

		// Calcula o salário bruto
		double salario_bruto = valor_hora * numero_horas;

		// Calcula o desconto de IR
		double desconto_ir = salario_bruto * 0.11;

		// Calcula o desconto de INSS
		double desconto_inss = salario_bruto * 0.08;

		// Calcula o desconto do sindicato
		double desconto_sindicato = salario_bruto * 0.05;

		// Calcula o salário líquido
		double salario_liquido = salario_bruto - desconto_ir - desconto_inss - desconto_sindicato;

		// Apresenta os resultados na tela
		System.out.println("===========================================");
		System.out.println("Salário Bruto:" + salario_bruto);
		System.out.println("Desconto IR:" + desconto_ir);
		System.out.println("Desconto INSS:" + desconto_inss);
		System.out.println("Desconto Sindicato:" + desconto_sindicato);
		System.out.println("===========================================");
		System.out.println("Salário Líquido:" + salario_liquido);

	}

}
