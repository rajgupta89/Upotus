import java.util.*;

public class hack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int count;
        count=((a[0] | a[1])-(a[0] & a[1]));
        for(int i=2;i<n;i++){
          count=((count | a[i])- (count & a[i]));
        }
        System.out.println(count);
    }
}
