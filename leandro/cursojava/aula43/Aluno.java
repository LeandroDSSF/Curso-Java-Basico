package leandro.cursojava.aula43;

import java.util.Arrays;

public class Aluno {

    private String curso;
    private double[] notas;

    public void verificaAcesso() {

    }

    Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String notas, String curso) {
        // super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCursos(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;

    }

    public double verificarAprovado() {
        return 0;
    }

    public void metodoQualquer() {
        // super.setCpf("1541551");
        // this.setCpf("949416");
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno ";
        // s += getEndereco();
        return s;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo " + this.obterEtiquetaEndereco());

    }

    /*
     * public String toString() {
     * String s = curso + "\n";
     * 
     * for (double nota : notas) {
     * s += nota + " ";
     * }
     * return s;
     * 
     * }
     */

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        Aluno other = (Aluno) obj;
        if (curso.equalsIgnoreCase(other.getCurso())) {
            return true;

        }

        return true;
    }

}
