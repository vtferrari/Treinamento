package robozinho;

import terreno.Terreno;

public class RobotEsperto {
    
    public int[][] comando(RobotEspertoMovimento comando,Terreno terreno ) {
        int[][] superficie = terreno.getTerreno();
        superficie[0][0]=1;
        return comando.realizaComando(superficie);
    }
    
}
