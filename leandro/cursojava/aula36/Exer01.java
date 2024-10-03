package leandro.cursojava.aula36;

public class Exer01 {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("João");

        Endereco end = new Endereco();

        end.setNomeRua("Rua Alberto");
        end.setNumero("4568");
        end.setComplemento("Centro");
        end.setCidade("Mogi das Cruzes");
        end.setEstado("São Paulo");
        end.setCep("00000-111");

        contato.setEndereco(end);

        Telefone telefone1 = new Telefone();
        telefone1.setNumero("99999-999");
        telefone1.setDdd("55");
        telefone1.setTipo("123");

        Telefone telefone2 = new Telefone();
        telefone2.setNumero("11111-111");
        telefone2.setDdd("22");
        telefone2.setTipo("456");

        Telefone[] telefones = new Telefone[2];

        telefones[0] = telefone1;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());

        }

        System.out.println("Get Cidade " + end.getCidade());

        /*
         * Acesso manual a cada posição do vetor
         * if (contato != null && contato.getTelefones() != null) {
         * System.out.println(contato.getTelefones()[0].getDdd() + " " +
         * contato.getTelefones()[0].getNumero());
         * System.out.println(contato.getTelefones()[1].getDdd() + " " +
         * contato.getTelefones()[1].getNumero());
         * 
         * }
         */

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }

        }
    }

}
