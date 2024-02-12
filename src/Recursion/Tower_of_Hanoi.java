package Recursion;

public class Tower_of_Hanoi {
    public static void movedisk(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Tranfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        movedisk(n-1,src,dest,helper);         //movedisk(n-1,H,S,D)
        System.out.println("Tranfer disk "+n+" from "+src+" to "+helper);
        movedisk(n-1,helper,src,dest);
     //   System.out.println("Transfer disk "+n+" from "+helper+" to "+dest+" with "+src+" as helper");

    }
    public static void main(String[] args) {

        movedisk(3,"S","H","D");
    }
}
