package leandro.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome Completo é: \n" + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: \n" + primeiroNome);
		
		System.out.println("Digite a sua Idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: \n" + idade);
		
		System.out.println("Digite a sua Altura");
		float altura = scan.nextFloat();
		System.out.println("Sua altura é: \n" + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: \n");
		
		String nome  = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean escolha = scan.nextBoolean();
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Quantidade de filhos que tem: " + qtdFilhos);
		System.out.println("Sua Altura: " + altura);
		System.out.println("Se possue animal de estimação: " + escolha);
	}

}
