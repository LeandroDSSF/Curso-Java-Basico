package leandro.cursojava.aula35;

public class Calculadora {

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int fatorialNaoRescursivo(int num) {
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;

    }

    public static int fatorialRecursivo(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorialRecursivo(num - 1);

    }

}
