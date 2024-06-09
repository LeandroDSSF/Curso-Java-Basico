package exer.aula17;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usuario ;
        String senha;

        boolean flag = false;

        while (!flag) {

            System.out.println("Digite o Usuario");
            usuario = scan.next();

            System.out.println("Digite a Senha");
            senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)) {
                System.out.println("\n Usuario e senha são iguais, digite novamente \n");
            } else {
                System.out.println("Acesso permitido");
                flag = true;
            }
        }
    }

}
