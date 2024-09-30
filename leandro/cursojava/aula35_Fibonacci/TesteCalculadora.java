package leandro.cursojava.aula35_Fibonacci;

public class TesteCalculadora {
    public static void main(String[] args) {

        System.out.println("Fibonacci");

        for (int i = 0; i < 10; i++) {
            System.out.println(Calculadora.fibinacci(i) + "");
        }

    }

}
