package exer.aula20;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] compromisso = new String[31][24][12];

        boolean sair = false;
        byte opcao = 0;

        while (!sair) {
            System.out.println("Digite [1] para add compromisso");
            System.out.println("Digite [2] para verificar compromisso");
            System.out.println("Digite [0] para sair");

            opcao = scan.nextByte();
            int dia = 0;
            boolean diaValido = false;

            int mes = 0;
            boolean mesValido = false;

            boolean horarioValido = false;
            int hora = 0;

            if (opcao == 1) {

                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && dia <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");

                    }
                }

                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");

                    }
                }

                while (!horarioValido) {
                    System.out.println("Entre com o horario do mês");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horarioValido = true;
                    } else {
                        System.out.println("Horario invalido, digite novamente");

                    }
                }
                dia--;
                mes--;
                System.out.println("Digite o compromisso");
                compromisso[mes][dia][hora] = scan.next();

            } else if (opcao == 2) {

                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && dia <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");

                    }
                }

                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");

                    }
                }

                while (!horarioValido) {
                    System.out.println("Entre com o horario do mês");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horarioValido = true;
                    } else {
                        System.out.println("Horario invalido, digite novamente");

                    }
                }
                mes--;
                dia--;
                System.out.println("O compromisso agendado é");
                System.out.println(compromisso[mes][dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opão Invalida, digite novamente");
            }

        }
    }

}
