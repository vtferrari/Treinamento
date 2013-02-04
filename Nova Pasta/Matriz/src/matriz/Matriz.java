package matriz;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Matriz {

    public static int[][] monta(int tamanho, int[][] mat1) {
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < 3; c++) {
                mat1[l][c] = new Random().nextInt();
            }
        }
        return mat1;
    }

    public static void main(String[] args) {
        int tamanho = 1200;

        int mat1[][] = new int[tamanho][tamanho];
        int mat2[][] = new int[tamanho][tamanho];
        
        mat1 = Matriz.monta(tamanho, mat1);
        mat2 = Matriz.monta(tamanho, mat2);

        MultiplicaMatriz multiplicar = new MultiplicaMatriz(mat1, mat2, tamanho);

        ExecutorService execute = Executors.newFixedThreadPool(4);
        execute.execute(multiplicar);
        execute.shutdown();

    }
}
