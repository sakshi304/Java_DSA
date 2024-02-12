package Recursion;

import java.util.Arrays;

public class quick_sort {
    public static void quicksort(int[]arr,int start,int end){
        if(start>=end){
            return;
        }
        int pidx= partition(arr,start,end); //pidx= pivot index
        quicksort(arr,start,pidx-1);
        quicksort(arr,pidx+1,end);
    }

    private static int partition(int[] arr, int start, int end) {
        int i=start-1;      // creates space for elements smaller than pivot elements
        int pivot=arr[end];
        for(int j=start;j<pivot;j++){
            if(arr[j]<pivot){                        //swap
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[end]=temp;

        return i;
    }

    public static void main(String[] args) {
            int[]arr={4,2,1,6,3,5};
            System.out.println(Arrays.toString(arr));
            quicksort(arr,0, arr.length-1);
            System.out.println(Arrays.toString(arr));

    }
}
