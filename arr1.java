import java.util.*;

public class arr1 {
    public static String pre(int[] a){
        int sum=a[0];
        for (int i = 1; i < 4; i++) {
            if(a[i]<=sum)
            return "false";
            sum+=a[i];
        }
        return "true";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[4];
        for (int i = 0; i < 4; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(pre(a));
    }
}
