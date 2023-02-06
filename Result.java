import java.util.*;
class Result {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length()-1;
        while(len-->0){
            s=s.substring(1,s.length())+s.charAt(0);
            if(s.charAt(0)=='0')
            System.out.print(s.substring(1,s.length())+" ");
            else
            System.out.print(s+" ");
        }
    }
}
