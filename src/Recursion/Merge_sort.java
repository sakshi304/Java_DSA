package Recursion;

import java.util.Arrays;

class TwoMorearrays{                        //not sorting the original array
    int []arr2=new int[6];
    TwoMorearrays(int[]arr){
        arr2=arr;
        System.out.println(Arrays.toString(arr2));
    }

    public int[] mergesort2(int[]arr){

        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;   //mid=3
        int left[]=mergesort2(Arrays.copyOfRange(arr,0,mid));  //here from i.e 0 is inclusive and to i.e mid is exclusive  // if original: int[]arr={4,1,3,5,2,6};  left={4,1,3}
        int right[]=mergesort2(Arrays.copyOfRange(arr,mid,arr.length));  //hence mid is included in the right array whereas in below class mid is included to the left  right={5,2,6}

        return merge(left,right);
    }
    public int[] merge(int[]first,int[]second){
        int []mix=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;k++;
        }

        while(j< second.length){
            mix[k]=second[j];
            j++;k++;
        }

        return mix;
    }
    public void printmix(){

        System.out.println(Arrays.toString(mergesort2(arr2)));
    }

}
public class Merge_sort {                     // sorting the original array
    public static void mergesort(int[]arr,int start, int end){
        if(start==end){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i=start;       //iterator on left array
        int j=mid+1;       //iterator on right array
        int k=0;           //iterator on temp array
        int temp[]=new int[end-start+1];              //temperory array gets created for every left+right merge
        while (i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){                                 //if left array is greater in length than right
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=end){                                //if right array is greater in length than left
            temp[k]=arr[j];
            j++;k++;
        }

        for(k=0;k<temp.length;k++){
            arr[start+k]=temp[k];     //making changes in the original array
        }
    }

    public static void main(String[] args) {
        int[]arr={4,1,3,5,2,6};
        System.out.println(Arrays.toString(arr));
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[]arr2={4,1,3,5,2,6};
        TwoMorearrays obj=new TwoMorearrays(arr2);
        obj.printmix();


    }
}
