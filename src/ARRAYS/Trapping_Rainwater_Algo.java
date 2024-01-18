package ARRAYS;

import java.util.Arrays;

public class Trapping_Rainwater_Algo {
    public static void trapamount(int[]height ){
        int n=height.length;
        int []leftmax=new int[n];
        int []rightmax=new int[n];
        // calculate leftmax & rightmax
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            if(leftmax[i-1]<height[i]){
                leftmax[i]=height[i];
            }else{
                leftmax[i]=leftmax[i-1];
            }
        }
        System.out.println(Arrays.toString(leftmax));
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            if(rightmax[i+1]<height[i]){
                rightmax[i]=height[i];
            }else{
                rightmax[i]=rightmax[i+1];
            }
        }
        System.out.println(Arrays.toString(rightmax));
        int waterlevel=0;
        int trapwater=0;
        for(int i=0;i<n;i++){
            // calculate waterlevel= min(maxleft, maxright)
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            // calculate trap amount = (waterlevel-barheight) * width   width=1 in question ....so ignore
            trapwater+= waterlevel-height[i];
        }
        System.out.println(trapwater);

    }
    public static void main(String[] args) {
        trapamount(new int[]{4,2,0,6,3,2,5});
    }
}
