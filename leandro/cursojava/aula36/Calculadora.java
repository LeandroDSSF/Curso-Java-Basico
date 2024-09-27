package leandro.cursojava.aula36;

public class Calculadora {
    public static int fibinacci(int num) {
        if (num < 2) {
            return 1;
        }

        return fibinacci(num - 1) + fibinacci(num - 2);
    }
}
