import java.util.Scanner;

public class rottenapple {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int t=in.nextInt();
        int[][] a=new int[n+2][m+2];
        int[][] b=new int[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j]=in.nextInt();
            }
        }
        b=a;
        while(t-->0){
           a=b;
           for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= m; j++) {
                   if(a[i][j]==2){
                       b[i+1][j]=2;
                       b[i-1][j]=2;
                       b[i][j-1]=2;
                       b[i][j+1]=2;
                   }
               }
           }
        }
        System.out.println();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}        