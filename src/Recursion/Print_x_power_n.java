package Recursion;

public class Print_x_power_n {
    public static int pow_brute(int x,int n){
        if(n==1){
            return x;
        }
        return x*pow_brute(x,n-1);
    }
    public static int pow_opti(int x,int n){
        if(n==1){
            return x;
        }
        int halfpower = pow_opti(x,n/2);
        int halfpowersqr = halfpower * halfpower;
        if(n%2==0) {
            return halfpowersqr;
        }
        return x*halfpowersqr;
    }
    public static void main(String[] args) {
        System.out.println(pow_brute(2,5));
        System.out.println(pow_opti(2,5));
    }
}
