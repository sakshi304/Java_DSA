package TwoD_ARRAYS;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n= sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m= sc.nextInt();
        int[][]matrix=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // print matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int startRow=0;
        int startColumn=0;
        int endRow= matrix.length-1;
        int endColumn= matrix[0].length-1;


        //spiral matrix
        while(startRow<=endRow && startColumn<=endColumn){

            //top
            for(int j=startColumn ; j<=endColumn;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+" ");
            }

            //bottom
            for(int j=endColumn-1;j>=startColumn;j--){
                if(endRow==startRow){
                     break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");

            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }


    }


}
