package exer.exer34;

public class Contador {

    static void imprimirValor() {

        System.out.println(Classe_Contador.retornar());

    }

    public static void main(String[] args) {

        imprimirValor();

        Classe_Contador.incrementar();

        imprimirValor();

        Classe_Contador.zerar();

        imprimirValor();

        Classe_Contador.incrementar();
        Classe_Contador.incrementar();
        Classe_Contador.incrementar();

        imprimirValor();

        Classe_Contador c1 = new Classe_Contador();
        Classe_Contador c2 = new Classe_Contador();
        Classe_Contador c3 = new Classe_Contador();

        c1.incrementar();
        c2.incrementar();
        c3.incrementar();

        imprimirValor();
    }

}
