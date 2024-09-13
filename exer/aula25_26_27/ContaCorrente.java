package exer.aula25_26_27;

import java.util.Scanner;

public class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    String numero;
    String agencia;
    boolean especial;
    double limitEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double saque) {
        // Tem saldo na conta
        if (saldo >= saque) {
            saldo -= saque;

            return true;

        } else { // Não tem saldo
            if (especial) {
                // Verificar se o limite especial tem saldo
                double limite = limitEspecial + saldo;
                if (limite >= saque) {
                    saldo -= saque;
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
    }

    void desositarDinheiro(double depositar) {
        saldo += depositar;
        System.out.println("Valor depositado " + depositar);
    }

    void consultarSaldo() {
        System.out.println("Saldo Atual " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo > 0;

    }

}
