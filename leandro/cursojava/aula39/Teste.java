package leandro.cursojava.aula39;

public class Teste {
    public static void main(String[] args) {
        // Aluno aluno = new Aluno();
        Professor professor = new Professor();

        professor.setSalario("5,000.00");

        Pessoa aluno = new Aluno();

        aluno.setNome("Maria");

        System.out.println(aluno.getNome());
        System.out.println(professor.getSalario());

    }

}
