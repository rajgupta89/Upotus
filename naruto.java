import java.util.Scanner;

public class naruto {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] a=new String[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=in.next();
            int maxx=Integer.MIN_VALUE;
            int minn=Integer.MAX_VALUE;
            for (int j = 0; j < a[i].length(); j++) {
                maxx=Math.max(maxx, (a[i].charAt(j)-'0'));
                minn=Math.min(minn, (a[i].charAt(j)-'0'));
            }
            String s1="";
            for (int j = 0; j < a[i].length(); j++) {
                if((a[i].charAt(j)-'0')==maxx)
                continue;
                else if((a[i].charAt(j)-'0')==minn)
                continue;
                else
                s1+=a[i].charAt(j);
            }
            sum+=Integer.parseInt(s1);
        }
        System.out.println(sum);
    }
}
