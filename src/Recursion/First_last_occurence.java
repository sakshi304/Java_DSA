package Recursion;

public class First_last_occurence {
    public static int first(int[]arr, int key,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
        return first(arr,key,index+1);
    }
    public static int last(int[]arr, int key,int index){
        if(index<0){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
        return last(arr,key,index-1);
    }

    public static void main(String[] args) {
        int[]arr={4,2,5,1,6,7,5};
        System.out.println(first(arr,5,0));
        System.out.println(last(arr,5,arr.length-1));
    }
}
