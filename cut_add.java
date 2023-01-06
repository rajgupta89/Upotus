import java.util.Scanner;

public class cut_add {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        int m=in.nextInt();
        int p=in.nextInt();
        int count=0;
        String s1=s;
        while (true) {
            s1=s1.substring(n-m,n)+s1.substring(0,n-m);
              count++;
            if(s1.equals(s))
              break;
            s1=s1.substring(n-p,n)+s1.substring(0,n-p);
              count++;
            if(s1.equals(s))
              break;
        }
        System.out.println(count);
    }
}
