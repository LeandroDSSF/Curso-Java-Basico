package leandro.cursojava.aula41;

public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private String salario;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor ";
        s += getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo " + this.obterEtiquetaEndereco());
    }

}
