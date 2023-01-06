import java.util.*;

public class binarystring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for (int i = n+1; i <m; i++) {
            String num=Integer.toBinaryString(i);
            if(! num.contains("11"))
            System.out.println(num);
        }
    }
}
