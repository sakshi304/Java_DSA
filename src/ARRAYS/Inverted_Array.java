package ARRAYS;


public class Inverted_Array {
    public static int find(int[]nums,int target) {
        int index = searchMinElement(nums);
        int z = 0;
        if (nums[index] <= target && target<=nums[nums.length-1]) {
             z = binarysrch(target, index, nums.length-1, nums);
        } else {
            z = binarysrch(target, 0, index, nums);
        }
        return z;
    }
    public static int binarysrch(int target,int start,int end,int[]nums){

        int s=start;
        int e=end;
        while(s <= e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<mid){
                e=mid-1;
            }else{
                s=mid+1;
            }

        }
        return -1;
    }
    public static int searchMinElement(int[]x){
        int left=0;
        int right=x.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(x[mid]<x[mid-1] && mid>0){
                return mid;
            } else if (x[mid]<=x[left] && x[mid]<x[right]) {
                right=mid-1;
            }
            else{                //2,4,5,6,7,0,1
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("index: "+find(new int[]{4,5,6,7,0,1,2},1));
    }
}
