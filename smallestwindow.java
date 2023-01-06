import java.util.*;
public class smallestwindow {
    public static String smallestWindows(String S)
    {
        String[] a=S.split(".");
        String s1="a";
        for(int i=a.length-1;i>=0;i--){
            // if(i!=0)
            s1+=a[i]+".";
            // else
            // s1+=a[i];
        }
        return a.toString();
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        System.out.println(smallestWindows(A));
    }
}
