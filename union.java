import java.util.ArrayList;
import java.util.Scanner;

public class union {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] a=new int[n+m];
        for (int i = 0; i < n+m; i++) {
            a[i]=in.nextInt();
        }
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < n+m; i++) {
            if(! li.contains(a[i]))
            li.add(a[i]);
        }
        System.out.println(li);
    }
}
