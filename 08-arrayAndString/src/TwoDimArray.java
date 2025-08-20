import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] x = new int[5][5]; // 5x5 matrix
        x[2][1] = 8;
        int[][] y = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 matrix

        System.out.println("Matrix: " + Arrays.deepToString(y));
        System.out.println(y[1][1]); // 5
        System.out.println("***");

        for (int i = 0; i < y.length; i++){
            for (int j = 0; j < y[i].length; j++) {
                System.out.println(y[i][j] + " ");
            }
        }

        int[][][] z = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println("3D array: " + Arrays.deepToString(z));
    }
}
