package matriz;

public class MultiplicaMatriz implements Runnable {

    private final int[][] a;
    private final int[][] b;
    private final int tamanho;
    private final int[][] c;

    public MultiplicaMatriz() {
        this(null, null, null, 0);
    }

    public MultiplicaMatriz(int[][] a, int[][] b, int tamanho) {
        this(a, b, null, tamanho);
    }
    private MultiplicaMatriz(int[][] a, int[][] b, int[][] c, int tamanho) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.tamanho = tamanho;
    }

    public void  matrizes() {
        int[][] c = new int[tamanho][tamanho];
        int aux;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                aux = 0;
                for (int h = 0; h < tamanho; h++) {
                    aux = aux + (a[i][h] * b[h][j]);
                }
                c[i][j] = aux;
            }
        }

       new MultiplicaMatriz(a, b, c, tamanho);
    }

    @Override
    public void run() {
        matrizes();
    }
}
