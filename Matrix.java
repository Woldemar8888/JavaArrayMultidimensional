package by.epamtc.aladzyin.array.multidimensional;

import static java.lang.Math.pow;

public class Matrix {
    private int order;
    int[][] matrix;

    public Matrix(int evenOrder) {
        this.order = evenOrder;
        this.matrix = new int[evenOrder][evenOrder];
    }

    public  void showSummedMatrix(){
        if(order % 2 == 0 ){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length; j++){
                    if(i % 2 == 0){
                        matrix[i][j] = j + 1;
                    }else {
                        matrix[i][j] = matrix.length - j;
                    }
                }
            }
            printMatrix(matrix);
        }else {
            System.out.println("order of matrix must be even!");
        }
    }

    public void showMultipliedMatrix(){
        if(order % 2 == 0 ){
            int startValue = 0;
            while (startValue < matrix.length){
                if(startValue == matrix.length - 2){
                    matrix[startValue][startValue] = (startValue +1) * startValue;
                }else{
                    matrix[startValue][startValue] = (startValue + 1) * (startValue + 2);
                }

                startValue++;
            }
            printMatrix(matrix);
        }else {
            System.out.println("order of matrix must be even!");
        }
    }

    public void showRayMatrix(){
        if(order % 2 == 0 ){
            int count = 0;
            for(int i = 0; i < matrix.length; i++){
                if( i == matrix.length/2){
                    count = matrix.length/2 - 1;
                } ;

                for(int j =count; j < matrix.length - count; j++){
                    matrix[i][j] = 1;
                }

                if(i < matrix.length/ 2){
                    count++;
                } else {
                    count--;
                }
            }

            printMatrix(matrix);
        }else {
            System.out.println("order of matrix must be even!");
        }
    }

    public void showPowMatrix(int [] arr){

        if(arr.length == order){
            if(order % 2 == 0 ){
                for(int i = 0; i < matrix.length; i++){
                    for(int j = 0; j < matrix.length; j++){
                        matrix[i][j] = (int) pow(arr[j], i+1);
                    }
                }
                printMatrix(matrix);
            }else {
                System.out.println("order of matrix must be even!");
            }
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
