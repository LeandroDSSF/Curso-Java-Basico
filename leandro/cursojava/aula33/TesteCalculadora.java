package leandro.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] vetor = new int[3];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;

        System.out.println(calc.soma(1, 1));

        System.out.println(calc.soma(2.5, 3.5));

        System.out.println(calc.soma(1, 2, 4));

        System.out.println(calc.soma(vetor));

    }

}
