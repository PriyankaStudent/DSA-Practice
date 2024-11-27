import java.util.HashSet;
import java.util.Set;

class Bool {
    public void modifyMatrix(int[][] mat, int M, int N) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1,0},
            {0,0}
        };
        int M=mat.length;
        int N=mat[0].length;

        Bool solution = new Bool();
        solution.modifyMatrix(mat, M, N);

        System.out.println("Modified matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}