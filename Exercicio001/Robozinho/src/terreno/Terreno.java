package terreno;

public class Terreno {
    private final int tamanho;

    public Terreno(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[][] getTerreno() {
        int[][] terreno = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
             terreno[i][j]=0;   
            }
        }
        return terreno;
    }

    
}
