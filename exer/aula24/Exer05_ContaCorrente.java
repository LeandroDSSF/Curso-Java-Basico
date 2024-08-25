package exer.aula24;

public class Exer05_ContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "654";
        conta.especial = true;
        conta.limitEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

    }

}
