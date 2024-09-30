package leandro.cursojava.aula35_Fibonacci_recursivo;

public class Calculadora {
    public static int fibinacci(int num) {
        if (num < 2) {
            return 1;
        }

        return fibinacci(num - 1) + fibinacci(num - 2);
    }

    public static int somatorio(int num) {

        if (num == 1) {
            return 1;

        }
        return num + somatorio(num - 1);
    }
}
