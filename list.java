import java.util.*;
public class list {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;
        for (int i = n; i <=m; i++) {
            int a=i;
            int sum=0;
            int maxx=0;
            while (a>0) {
                sum+=a%10;
                maxx=Math.max(maxx, a%10);
                a/=10;
            }
            if(sum-maxx==maxx)
            count+=i;
        }
        System.out.println(count);
    }
}