package ARRAYS;

import java.util.HashSet;
import java.util.ArrayList;

public class HSBC_Apti_Code {
    public static void main(String[] args) {
        int[]arr1={4,8,3,6,2,7};
        int[]arr2={9,7,4,2,3,5,1};
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
            System.out.println(list);

        }
        for(int j=0;j<arr2.length;j++){
            if(list.contains(arr2[j])){
                list.remove(arr2[j]);
            }else{
                list.add(arr2[j]);
                System.out.println(list);
            }
        }
        int sum=0;
        System.out.println(list);
        for(int x: list){

            sum=sum+x;
        }
        System.out.println(sum);

// ---------incomplete
//        ArrayList<Integer>list=new ArrayList<>();
//        int n=arr1.length;
//        int m=arr2.length;
//        int y=0;
//        if(m>n){
//
//        }
//        int x=-1;
//        int indexj=0;
//        for(int i=0;i<m;i++){   //big
//
//            for(int j=0;j<n;j++){     //small
//                if(arr2[j]==arr1[i]){
//                    list.add(arr1[i]);
//                    x=j;
//                    break;
//                }
//                else{
//                    indexj=x;
//                }
//
//            }
//            if(x==-1 &&  ){
//                list.add(arr1[i]);
//                list.add(arr2[]);
//            }
//        }
    }
}
