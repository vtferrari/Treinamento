package robozinho;

public class MovimentoCima implements RobotEspertoMovimento {

    private int passos;

    public MovimentoCima(int passos) {
        this.passos = passos;
    }

    @Override
    public int[][] realizaComando(int[][] terreno) {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno.length; j++) {
                if (terreno[i][j] == 1) {
                    if (i == 0) {
                        return terreno;
                    }
                    terreno[i][j] = 0;
                    terreno[i - passos][j] = 1;
                    return terreno;
                }
            }
        }
        return terreno;
    }
}
