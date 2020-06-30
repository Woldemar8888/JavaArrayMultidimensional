package by.epamtc.aladzyin.array.multidimensional;

public class MatrixMultiply {
    private int[][] firstMatrix;
    private int[][] secondMatrix;
    private int[][] result;

    public MatrixMultiply(int[][] firstMatrix, int[][] secondMatrix) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        this.result = new int[firstMatrix.length][secondMatrix[0].length];
    }

    public void showMatrixMultiply(){

        if(firstMatrix[0].length == secondMatrix.length){
            for(int i = 0; i < firstMatrix.length; i++) {         // rows from firstMatrix
                for(int j = 0; j < secondMatrix[0].length; j++) {     // columns from secondMatrix
                    for(int k = 0; k < firstMatrix[0].length; k++) { // columns from firstMatrix
                        result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }

            printMatrix(result);
        } else {
            System.out.println("matrix multiplication is not possible");
        }
    }

    public void printMatrix(int [][] matrix){
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix.length; j++){
                System.out.print( "" + matrix[i][j] + '\t' );
            }
            System.out.println('\n');
        }
    }
}
