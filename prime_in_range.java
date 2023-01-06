import java.util.Scanner;

public class prime_in_range {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=0;
        while(m<n){
        for (int i = 2; i <=n; i++) {
            int count=0;
            for (int j = 1; j <=n*n; j++) {
                if(i%j==0)
                count++;
            }
            if(count==2){
            System.out.print(i+" ");
            m++;
        }
        }
    }
    }
}
