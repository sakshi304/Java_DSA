package Basic_Sorting_Algos;

import java.util.Arrays;

import java.util.Collections;

public class Bubble_sort {

    public static void desc(){
        int[]arr1={4,7,1,0,9,5};
        int temp;
        for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr1.length-i-1;j++) {
                if (arr1[j] < arr1[j + 1]) {
                    temp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[]arr={4,7,1,0,9,5};
        int temp;
        for(int i=0;i<arr.length-1;i++){
          for(int j=0;j<arr.length-i-1;j++) {
              if (arr[j] > arr[j + 1]) {
                  temp = arr[j + 1];
                  arr[j + 1] = arr[j];
                  arr[j] = temp;
              }
          }
        }
        System.out.println(Arrays.toString(arr));
        desc();

        //-----------------INBUILT METHODS FOR SORTING---------------------
        int []arr2={4,8,1,0,-4,6};
        Arrays.sort(arr2);

        Integer[] arr3={4,2,1,0,8,14,7};
        Arrays.sort(arr3, Collections.reverseOrder());    // Collections.reverseOrder() :  only operates on objects

        int[]arr4={8,1,7,0,9,2};
        Arrays.sort(arr4,0,3);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}
