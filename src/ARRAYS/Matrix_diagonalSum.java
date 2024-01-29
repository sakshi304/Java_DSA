package ARRAYS;

public class Matrix_diagonalSum {
    public static void main(String[] args) {
        System.out.println("Brute-force approach O(n2): ");
        int[][]matrix={{1,2,3,10},
                       {4,5,6,10},
                       {7,8,9,10},
                       {10,10,10,10}};
        int sum=0;
        int n= matrix.length;
        for(int row=0;row<n;row++){
            for(int column=0;column<n;column++){
                if(row==column){
                    sum+=matrix[row][column];
                    System.out.println(row+", " +column+": "+sum);
                }
                else if(row+column== n-1){
                    sum+=matrix[row][column];
                    System.out.println(row+", " +column+": "+sum);
                }

            }

        }
        System.out.println("SUM: "+sum);

        System.out.println("Optimal Approach O(n): ");
        int sum2=0;
        for(int i=0;i< n;i++){
            sum2+=matrix[i][i];
            System.out.println(i+", " +i+": "+sum2);
            int k=(n-1)-i;
            if(k==i){
                continue;
            }else{
                sum2+=matrix[i][k];
                System.out.println(i+", " +k+": "+sum2);
            }
        }
        System.out.println("SUM2: "+sum2);
    }
}
