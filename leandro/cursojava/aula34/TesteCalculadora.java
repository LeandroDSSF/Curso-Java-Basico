package leandro.cursojava.aula34;

public class TesteCalculadora {
    static int resultSoma;

    public static void main(String[] args) {
        // Calculadora calc = new Calculadora();

        // calc.soma(1,2);

        resultSoma = Calculadora.soma(1, 2);

        soma2ValoresInteiros(1, 2);

    }

    static int soma2ValoresInteiros(int num1, int num2) {
        return Calculadora.soma(num1, num2);
    }

}
