import java.util.Scanner;

public class prince {
    public static int count(int n,int[][]a,int k){
        int sum,z=0,p,add=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]==k){
                sum=(i+j)%n;
                z=a[i][(j+sum)%n];
                break;
                }
            }
        }
        int c=1;
        while(z>0){
           int rem=z%10;
           add+=Math.pow(rem, c);
           z/=10;
           c++;
        }
        return add;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=in.nextInt();
            }
        }
        int k=in.nextInt();
        System.out.println(count(n, a, k));
    }
}
