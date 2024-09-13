package exer.aula25_26_27;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Classe_Aluno aluno = new Classe_Aluno();

        boolean flag = true;
        String resposta = "";

        do {
            System.out.println("Digite o nome do Aluno");
            aluno.nome = scan.next();

            System.out.println("Digite a Matricula no Aluno");
            aluno.matricula = scan.next();

            System.out.println("Digite o nome do Curso do Aluno");
            aluno.nomeCurso = scan.next();

            for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
                System.out.println("Digite o nome da disciplina " + (i + 1) + "° ");
                aluno.nomeDisciplinas[i] = scan.next();

            }

            for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
                System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
                for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                    System.out.println("Digite a nota da disciplinas " + (j + 1));
                    aluno.notasDisciplinas[i][j] = scan.nextDouble();
                }

            }

            for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
                System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);

            }

            aluno.mostrarInfo();

            for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
                if (aluno.avaliarNotas(i)) {
                    System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " Aprovado");

                } else {
                    System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " Reprovado");
                }

            }
            System.out.println();
            System.out.println("Gostaria de Continuar S/SIM ou N/NÃO");
            resposta = scan.next();
            if (resposta.equalsIgnoreCase("s")) {
                flag = true;

            } else {
                flag = false;
            }

        } while (flag);

    }

}
