package exer.aula25_26_27;

public class Classe_Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];
    double resultado;

    void mostrarInfo() {
        System.out.println("Nome " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");

            }
            System.out.println();
        }
    }

    double obterMedia(int indice) {
        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;

        return media;

    }

    boolean avaliarNotas(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;

    }

}
