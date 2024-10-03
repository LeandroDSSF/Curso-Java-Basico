package exer.exer36;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da Agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informações do contato " + (i + 1));
            Contato c = new Contato();

            System.out.println("Nome");
            c.setNome(scan.nextLine());

            System.out.println("Telefone");
            c.setTelefone(scan.nextLine());

            System.out.println("E-mail");
            c.setEmail(scan.nextLine());

            contatos[i] = c;

        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

    }
}
