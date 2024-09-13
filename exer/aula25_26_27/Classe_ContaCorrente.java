package exer.aula25_26_27;

public class Classe_ContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "654";
        conta.especial = true;
        conta.limitEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        double saque = 10;
        double depositar = 20;

        boolean saqueEfetuado = conta.realizarSaque(saque);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);

        } else {
            System.out.println("Saldo insuficiente " + conta.saldo);

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
