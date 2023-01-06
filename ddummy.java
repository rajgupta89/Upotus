import java.util.Scanner;

public class ddummy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        String[] a=S.split("[.]");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
