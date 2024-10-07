package leandro.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCursos("Ciência da Computação");
        double[] notas = { 10, 9, 8, 7 };
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "asadf";
        String s2 = "asadf";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCursos("Ciência da Computação");
        double[] notas2 = { 9, 9, 6, 7 };
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }

}
