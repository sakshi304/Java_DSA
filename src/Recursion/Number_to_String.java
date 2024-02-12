package Recursion;

class stringlength{
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
}
public class Number_to_String {
    static String[] num={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void numtostring(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        numtostring(n/10);
        System.out.print(num[lastdigit]+" ");

    }
    public static void main(String[] args) {

        numtostring(1234);
        System.out.println();
        System.out.println(stringlength.length("abceded"));
    }
}

