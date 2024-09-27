package leandro.cursojava.aula35;

public class TesteCalculadora {
    public static void main(String[] args) {

        System.out.println("Não Recursivo");
        System.out.println(Calculadora.fatorialNaoRescursivo(5));
        
        System.out.println("Recursivo");
        System.out.println(Calculadora.fatorialRecursivo(5));

    }

}
