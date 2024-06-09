package exer.aula17;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean flag = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {

            System.out.println("Digite o nome");
            nome = scan.next();
            
            if (nome.length() >= 3) {
                flag = true;
            } else {
                System.out.println("Nome precisa no minimo 3 caracteres.");

            }
        } while (!flag);

        flag = false;

        do {
            System.out.println("Digite a idade");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                flag = true;
            } else {
                System.out.println("idade precisa ser entre 0 e 150");
            }
        } while (!flag);

        flag = false;

        do {
            System.out.println("Digite o salario");
            salario = scan.nextDouble();

            if (salario > 0) {
                flag = true;
            } else {
                System.out.println("Digite o salario novamente");
            }
        } while (!flag);

        flag = false;

        do {
            System.out.println("Digite 'f' ou 'm'");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                flag = true;
            } else {
                System.out.println("Precisar ser 'f' ou 'm' ");
            }
        } while (!flag);

        flag = false;

        do {
            System.out.println("Digite Estado Civil 's','c','v','d'");
            estadoCivil = scan.next();

            if (estadoCivil.equals("s") || estadoCivil.equals("c")
                    || estadoCivil.equals("v") || estadoCivil.equals("d")) {
                flag = true;
            } else {
                System.out.println("Estado civil precisa estar entre S,C,V,D");
            }
        } while (!flag);

        System.out.println("As informações informadas foram");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Salario " + salario);
        System.out.println("Sexo " + sexo);
        System.out.println("Estado Civil " + estadoCivil);

    }

}
