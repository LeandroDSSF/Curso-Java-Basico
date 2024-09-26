package exer.exer33;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Classe_Aluno aluno = new Classe_Aluno();

        boolean flag = true;
        String resposta = "";

        do {
            System.out.println("Digite o nome do Aluno");
            aluno.setNome(scan.next());

            System.out.println("Digite o nome do Curso do Aluno");
            aluno.setNomeCurso(scan.next());

            System.out.println("Digite a Matricula no Aluno");
            aluno.setMatricula(scan.next());

            

            for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
                System.out.println("Digite o nome da disciplina " + (i + 1) + "° ");
                aluno.setNomeDisciplinaPos(i, scan.next());

            }

            for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
                System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
                for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                    System.out.println("Digite a nota da disciplinas " + (j + 1));
                   aluno.setNomePosIJ(i, j, scan.nextDouble());
                }

            }

            for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
                System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);

            }

            aluno.mostrarInfo();

            for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
                if (aluno.avaliarNotas(i)) {
                    System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " Aprovado");

                } else {
                    System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " Reprovado");
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
