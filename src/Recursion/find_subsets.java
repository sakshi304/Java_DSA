package Recursion;

public class find_subsets {
    public static void subset(String str,int i,String ans){
        if(i==str.length()){
            if(ans==""){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        subset(str,i+1,ans+str.charAt(i));
        subset(str,i+1,ans);
    }
    public static void main(String[] args) {
        subset("abc",0,"");
    }
}
