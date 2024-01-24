package Basic_Sorting_Algos;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int min;
        int []arr={4,7,0,1,9,2};
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                System.out.println("hello");
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
