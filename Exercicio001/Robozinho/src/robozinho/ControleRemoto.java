package robozinho;

/**
 * o controle vai receber os chamar os comandos
 *
 * @author Vinicius
 */
class ControleRemoto {
    
    public Robot R2D2 = new Robot();
    
    public String andar() {
        return R2D2.comando(new Andar());
    }
    
    public String virarDireita() {
        return R2D2.comando(new Direita());
    }
}
