public class TransposMatrix_12 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int len = matrix.length;
        int[][] transpos = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

                transpos[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(transpos[i][j] + ",  ");
            }
            System.out.println("\n");
        }
    }
}
