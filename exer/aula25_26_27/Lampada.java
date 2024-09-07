package exer.aula25_26_27;

public class Lampada {
    public static void main(String[] args) {

        Classe_Lampada lampada = new Classe_Lampada();

        lampada.ligar();
        lampada.statusLampada();

        lampada.desligar();
        lampada.statusLampada();

        lampada.MudarStatus();
        lampada.statusLampada();
    }
}
