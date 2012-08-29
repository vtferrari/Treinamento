package robozinho;

public class MovimentoBaixo implements RobotEspertoMovimento {

    private int passos;

    public MovimentoBaixo(int passos) {
        this.passos = passos;
    }

    @Override
    public int[][] realizaComando(int[][] terreno) {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno.length; j++) {
                if (terreno[i][j] == 1) {
                    if (i >= terreno.length) {
                        return terreno;
                    }
                    terreno[i][j] = 0;
                    terreno[i+passos][j] = 1;
                    return terreno;
                }
            }
        }
        return terreno;
    }
}
