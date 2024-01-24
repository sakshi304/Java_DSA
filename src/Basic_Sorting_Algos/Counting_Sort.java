package Basic_Sorting_Algos;

import java.util.Arrays;

public class Counting_Sort {

    public static String desc(){
        int arr[]={1,1,5,4,4,7,3,3,2,9,2};
        System.out.println("arr: "+Arrays.toString(arr));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        int j=0;

        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            count[ele]++;
        }
        System.out.println("count: "+Arrays.toString(count));
        for(int i=count.length-1;i>0;i--){
            while(count[i]>0){
                arr[j]=i;

                count[i]--;
                j++;
            }
        }
        return Arrays.toString(arr);
    }


    public static void main(String[] args) {
        int arr[]={1,1,5,4,4,7,3,3,2,9,2};
        System.out.println("arr: "+Arrays.toString(arr));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        int j=0;

        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            count[ele]++;
        }
        System.out.println("count: "+Arrays.toString(count));
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;

                count[i]--;
                j++;
            }
        }
        System.out.println("sorted arr: "+Arrays.toString(arr));
        System.out.println("Descendign order: "+desc());
    }
}
