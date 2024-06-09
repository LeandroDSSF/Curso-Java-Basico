package leandro.cursojava.aula17_1;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de I " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Valor de I " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);

        }
        int soma = 0;

        for (int i = 1; i < 5; soma += i++) {
            System.out.println("Valor da soma é " + soma);
            
        }
        System.out.println("Valor da soma é " + soma);

    }

}
