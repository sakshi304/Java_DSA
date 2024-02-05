package Recursion;

public class String_duplicates {
    public static void removeduplicate(String str, StringBuilder nstr, int index,boolean match[]){
            if(index==str.length()){
                System.out.println(nstr);
                return;
            }
            int currentchar= str.charAt(index)-'a';
            if(match[currentchar]==true){
                removeduplicate(str,nstr,index+1,match);
            }else{
                match[currentchar]=true;
                removeduplicate(str,nstr.append(str.charAt(index)),index+1,match);
            }
    }
    public static void main(String[] args) {
        boolean[]match=new boolean[26];
        String str="sakshikothurkar";
        removeduplicate(str,new StringBuilder(""),0,match);
    }
}
