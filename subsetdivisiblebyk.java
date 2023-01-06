import java.util.Scanner;

public class subsetdivisiblebyk {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int n=in.nextInt();
            int k=in.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=in.nextInt();
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                int product=1;
                 for (int j = i; j < n; j++) {
                     product*=a[j];
                     if(product%k==0){
                         count++;
                         System.out.println(product);
                         break;
                     }
                 }
                 if(count==1)
                 break;
            }
            if(count==1)
             System.out.println("YES");
            else
             System.out.println("NO");
        }
    }
}
