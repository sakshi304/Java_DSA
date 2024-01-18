package ARRAYS;

public class MaxSubArraySum_KadanesAlgo {
    public static void kadanes(int[]num){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum in the array is :"+ms);
    }
    public static void main(String[] args) {
        kadanes(new int[]{-1,-2,3,4,2,-2,4});
    }
}
