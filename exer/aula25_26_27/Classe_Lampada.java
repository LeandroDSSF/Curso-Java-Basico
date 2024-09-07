package exer.aula25_26_27;

public class Classe_Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean interrupter;

    void ligar() {
        interrupter = true;
    }

    void desligar() {
        interrupter = false;
    }

    void statusLampada() {

        if (interrupter) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligada");
        }
    }

    void MudarStatus() {
        if (interrupter) {
            desligar();
        } else {
            ligar();
        }
    }

}
