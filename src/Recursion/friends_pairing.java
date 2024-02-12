package Recursion;

public class friends_pairing {
    public static int frnds(int n){
        if(n==2 || n==1){
            return n;
        }
        //single: frnds(n-1)
        //pair: (n-1)frnds(n-2)

        return frnds(n-1)+ (n-1)*frnds(n-2);
    }

    public static void main(String[] args) {
        System.out.println(frnds(3));
    }
}
