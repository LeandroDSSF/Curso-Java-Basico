package exer.aula13;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o lado do Quadrado:");
		double lado = scan.nextDouble();

		System.out.println("O Dobro da Area do Quadrado: " + (Math.pow(lado, 2) * 2));
	}

}
