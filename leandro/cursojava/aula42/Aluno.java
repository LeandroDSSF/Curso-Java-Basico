package leandro.cursojava.aula42;

public class Aluno {

    private String cursos;
    private String notas;

    public void verificaAcesso() {

    }

    Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String notas, String cursos) {
        // super(nome, endereco, telefone);
        this.cursos = cursos;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
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

}
