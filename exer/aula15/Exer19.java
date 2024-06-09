package exer.aula15;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double n1 = scan.nextDouble();

        System.out.println("Digite outro numero");
        double n2 = scan.nextDouble();

        System.out.println("Qual operação deseja realizar (+ - / *)");
        String ope = scan.next();
        double result = 0;
        boolean valida = true;

        switch (ope) {
            case "+":
                result = n1 + n2;
                System.out.println("Operação +");
                break;
            case "-":
                result = n1 - n2;
                System.out.println("Operação -");
                break;
            case "/":
                result = n1 / n2;
                System.out.println("Operação /");
                break;
            case "*":
                result = n1 * n2;
                System.out.println("Operação *");
                break;
            default:
                System.out.println("Operador Invalido");
                valida = false;
                break;
        }
        if (valida) {

            if (result % 2 == 0) {
                System.out.println("Par " + result);
            } else {
                System.out.println("Impar " + result);

            }
            if (result > 0) {
                System.out.println("Positivo " + result);
            } else {
                System.out.println("Negativo " + result);
            }
        }
    }
}
