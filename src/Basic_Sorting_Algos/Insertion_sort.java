package Basic_Sorting_Algos;

import java.util.Arrays;

public class Insertion_sort {
    public static void desc(){
        int[]arr={4,7,1,9,0,-1};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            for(int j=i-1;j>=0;j--){
                if(temp>arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[]arr={4,7,1,9,0,-1};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            for(int j=i-1;j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        desc();
    }
}
