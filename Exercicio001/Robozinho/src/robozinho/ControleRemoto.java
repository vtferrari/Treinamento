package robozinho;

import terreno.Terreno;

public class ControleRemoto {

    public RobotEsperto v1n1 = new RobotEsperto();
    public Terreno marte = new Terreno(5);

    public int[][] subir(int passo) {
        return v1n1.comando(new MovimentoCima(passo), marte);
    }

    public int[][] andarDireita(int passo) {
        return v1n1.comando(new MovimentoDireita(passo), marte);
    }

    public int[][] andarEsquerda(int passo) {
        return v1n1.comando(new MovimentoEsquerda(passo), marte);
    }

    public int[][] descer(int passo) {
        return v1n1.comando(new MovimentoBaixo(passo), marte);
    }
}
