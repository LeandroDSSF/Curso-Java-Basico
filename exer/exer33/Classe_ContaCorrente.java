package exer.exer33;

public class Classe_ContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("123456");
        conta.setAgencia("654");
        conta.setEspecial(true);
        conta.setLimitEspecial(500);
        conta.setValorEspecialUsado(0);
        conta.setSaldo(10);

        double saque = 10;
        double depositar = 20;

        boolean saqueEfetuado = conta.realizarSaque(saque);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.getSaldo());

        } else {
            System.out.println("Saldo insuficiente " + conta.getSaldo());

        }

        conta.desositarDinheiro(depositar);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Não esta usando cheque especial");
        }

    }

}
