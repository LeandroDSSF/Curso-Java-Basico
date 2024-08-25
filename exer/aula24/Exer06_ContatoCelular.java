package exer.aula24;

public class Exer06_ContatoCelular {
    public static void main(String[] args) {

        ContatoCelular contato1 = new ContatoCelular();
        ContatoCelular contato2 = new ContatoCelular();

        contato1.nome = "João";
        contato1.email = "João@email.com";
        contato1.endereco = "Rua A";
        contato1.telefones = new String[2];

        contato1.telefones[0] = "123";
        contato1.telefones[1] = "456";

        contato2.nome = "Maria";
        contato2.email = "Maria@email.com";
        contato2.endereco = "Rua B";
        contato2.telefones = new String[3];
        contato2.telefones[0] = "789";
        contato2.telefones[1] = "753";
        contato2.telefones[2] = "159";

        System.out.println("Contato1 nome " + contato1.nome);
        System.out.println("Contato1 email " + contato1.email);
        System.out.println("Contato1 endereço " + contato1.endereco);

        for (String telefone : contato1.telefones) {
            System.out.println("Contato1 telefone " + telefone);
        }

        System.out.println();

        System.out.println("Contato2 nome " + contato2.nome);
        System.out.println("Contato2 email " + contato2.email);
        System.out.println("Contato2 endereço " + contato2.endereco);

        for (String telefone : contato2.telefones) {
            System.out.println("Contato2 telefone " + telefone);
        }

    }

}
