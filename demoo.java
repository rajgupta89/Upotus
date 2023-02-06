import java.util.Scanner;

public class demoo {
    public static void main(String[] args) {
        int a,b=1;
        for (a = 3; a > 1; a--) {
            b=(a/2==0)? b: b+2;
            System.out.println(b);
        }
    }
}
