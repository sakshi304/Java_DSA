package Recursion;

public class Binary_string_noconsecutiveone {
    public static void print(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //more understandable
        if(lastplace==0){
            print(n-1,0,str+"0");
            print(n-1,1,str+"1");
        }else{
            print(n-1,0,str+"0");
        }

        //----OR--------
//        print(n-1,0,str+"0");
//        if(lastplace==0){
//            print(n-1,1,str+"1");
//        }
    }
    public static void main(String[] args) {

        print(2,0,"");
    }
}
