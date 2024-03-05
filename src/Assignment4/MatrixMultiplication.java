package src.Assignment4;

public class MatrixMultiplication {
    public static void main(String[] args){
        int sum;
        int[][] matrix1={{1,2,3},{4,5,6},{2,3,4}};
        int [][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
        for(int row=0;row<matrix1.length;row++){
            for(int column=0;column<matrix2[row].length;column++){
                sum=0;
           for(int row1=0;row1<matrix2[0].length;row1++){
               sum+=matrix1[row][row1]*matrix2[row1][column];
           }
                System.out.print(sum+" ");
            }
            System.out.println();

        }
    }
}
