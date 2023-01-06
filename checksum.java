import java.util.Arrays;
import java.util.Scanner;

public class checksum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        String[] s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=in.next();
            char[] c=s[i].toCharArray();
            Arrays.sort(c);
            s[i]="";
            for (int j = 1; j <c.length-1 ; j++) {
                s[i]+=c[j];
            }
            int sum=0;
            for (int j = 0; j < s[i].length(); j++) {
                sum+=s[i].charAt(j)-'0';
            }
            s[i]=Integer.toString(sum);
            count+=Integer.parseInt(s[i]);
        }
        System.out.println(count);
    }
}
