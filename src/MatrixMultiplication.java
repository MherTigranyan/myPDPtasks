public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = { {1,2,3}, {4,5,6} };
        int[][] matrix2 = { {7,8}, {9,10}, {11,12} };
        int sum = 0;
        int multiply[][] = new int[matrix1.length][matrix2[0].length];

        if(matrix1.length != matrix2[0].length){
            System.out.println("the matrices can not be multiplied");
        }else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        sum = sum + matrix1[i][k] * matrix2[k][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }

            for (int i = 0; i < multiply.length; i++) {
                for (int j = 0; j < multiply.length; j++) {
                    System.out.print(multiply[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
