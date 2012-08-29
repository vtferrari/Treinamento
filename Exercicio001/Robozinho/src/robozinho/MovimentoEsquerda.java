package robozinho;

public class MovimentoEsquerda implements RobotEspertoMovimento {

    private int passos;

    public MovimentoEsquerda(int passos) {
        this.passos = passos;
    }

    @Override
    public int[][] realizaComando(int[][] terreno) {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno.length; j++) {
                if (terreno[i][j] == 1) {
                    if (j == 0) {
                        return terreno;
                    }
                    terreno[i][j] = 0;
                    terreno[i][j - passos] = 1;
                    return terreno;
                }
            }
        }
        return terreno;
    }
}
