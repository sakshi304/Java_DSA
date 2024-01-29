package ARRAYS;

import java.util.Scanner;

public class Matrix_Srch_SortedArray {
    public static boolean staircaseSearch(int[][]n,int key){
        int len=n.length;
        int row, col;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.From top right corner \n2.From bottom left corner ");
        int ch=sc.nextInt();
        int iter=0;
        switch (ch) {
            case 1:
                row=0;
                col=len-1;
                while(row<len && col>=0){
                    if(n[row][col]==key){
                        iter++;
                        System.out.println("iter: "+iter);
                        System.out.println("Key found at ["+row+","+col+"]");
                        return true;
                    }
                    else if(key>n[row][col]){
                        row++;
                    }
                    else{
                        col--;
                    }
                    iter++;
                }
            case 2:
                row=len-1;
                col=0;
                while(col<len && row>=0){
                    if(n[row][col]==key){
                        iter++;
                        System.out.println("iter: "+iter);
                        System.out.println("Key found at ["+row+","+col+"]");
                        return true;
                    }
                    else if(key>n[row][col]){
                        col++;
                    }
                    else{
                        row--;
                    }
                    iter++;
                }
        }

        System.out.println("iter: "+iter);
        return false;
    }
    public static void main(String[] args) {
            int[][]marix={{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                           {32,33,39,50}};
            System.out.println(staircaseSearch(marix,33));
    }
}
