package exer.exer33;

import java.util.Scanner;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limitEspecial;
    private double valorEspecialUsado;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double limitEspecial,
            double valorEspecialUsado, double saldo) {

        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limitEspecial = limitEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimitEspecial() {
        return limitEspecial;
    }

    public void setLimitEspecial(double limitEspecial) {
        this.limitEspecial = limitEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean realizarSaque(double saque) {
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

    public void desositarDinheiro(double depositar) {
        saldo += depositar;
        System.out.println("Valor depositado " + depositar);
    }

    public void consultarSaldo() {
        System.out.println("Saldo Atual " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo > 0;

    }

}
