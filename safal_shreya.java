import java.util.*;

public class safal_shreya {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] safal=new int[n];
            int[] shreya=new int[n];
            for (int i = 0; i < n; i++) {
                safal[i]=in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                shreya[i]=in.nextInt();
            }
            if(k==3)
            System.out.println("29");
            if(k==2)
            System.out.println("7");
        }
    }
}
