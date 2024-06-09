package exer.aula15;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trablhada no mês");
        double qtdHoras = scan.nextDouble();

        double porcetIr = 0;
        double inss = 0;
        double fgts = 0;
        double ir = 0;
        double totalDescont = 0;
        double salarioLiqui = 0;

        double salarioBruto = valorHora * qtdHoras;
        if (salarioBruto <= 900) {
            ir = 0;

        } else if (salarioBruto <= 1500) {
            porcetIr = 0.05;
            ir = salarioBruto * porcetIr ;

        } else if (salarioBruto <= 2500) {
            porcetIr = 0.10;
            ir = salarioBruto * porcetIr ;

        } else {
            porcetIr = 0.20;
            ir = salarioBruto * porcetIr ;

        }

        inss = salarioBruto * 0.10;
        fgts = salarioBruto * 0.11;
        totalDescont = ir + inss;
        salarioLiqui = salarioBruto - totalDescont;

        System.out.println("Salario Bruto: (" + valorHora + " * " + qtdHoras + ") R$ " + valorHora * qtdHoras);
        System.out.println("(-) IR (" + porcetIr + "%) R$ " + ir);
        System.out.println("(-) INSS (" + 10 + "%) R$ " + inss);
        System.out.println("FGTS (11%)" + "R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescont);
        System.out.println("Salario Liquido: R$ " + salarioLiqui);

    }

}
