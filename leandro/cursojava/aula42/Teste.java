package leandro.cursojava.aula42;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // Pessoa aluno = new Aluno();
        // Pessoa professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // pessoa.setEndereco("Rua 1, Num 1");
        // aluno.setEndereco("Rua 2, Num 3");
        // professor.setEndereco("Rua 3, Num 3");

        // System.out.println(pessoa.obterEtiquetaEndereco());
        // System.out.println(aluno.obterEtiquetaEndereco());
        // System.out.println(professor.obterEtiquetaEndereco());

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

        System.out.println(Contantes.URL_BLOG);

        // Contantes.URL_BLOG = "sefsefsef";

        System.out.println(Contantes.URL_BLOG);

        final int total = 1;

        // total += 1;

        System.out.println(total);
    }

}
