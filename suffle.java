import java.util.*;

public class suffle {
    public static boolean suff(String a, String b, String c){
        a+=b;
        if(a.length()!=c.length())
        return false;
        char[] arr=a.toCharArray();
        char[] arr1=c.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if(arr[i]!=arr1[i])
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
    }
}
