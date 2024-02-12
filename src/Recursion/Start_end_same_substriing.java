package Recursion;

public class Start_end_same_substriing {
    static int count=0;
    public static void substring(String str,int index){
        if(index==str.length()-1){

            return;
        }
        if(str.charAt(index)==str.charAt(str.length()-1)){
            count++;
            System.out.println(count);
        }
        substring(str.substring(index,str.length()-1),index);
        substring(str.substring(index+1,str.length()-1),index+1);
    }
    public static void main(String[] args) {

        String str="abcad";
        int n=str.length();
        substring(str,0);
    }
}
