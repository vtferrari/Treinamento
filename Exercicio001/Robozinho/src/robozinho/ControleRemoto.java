package robozinho;

class ControleRemoto {
    
    public Robot v1n1 = new Robot();
    
    public String andar() {
        return v1n1.comando(new Andar());
    }
    
    public String virarDireita() {
        return v1n1.comando(new Direita());
    }
    
    public String virarEsquerda() {
        return v1n1.comando(new Esquerda());
    }
}
