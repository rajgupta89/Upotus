import java.util.*;
class matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] a=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=in.nextInt();
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int minn=Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if(a[j][i]>=0)
                minn=Math.min(minn, a[j][i]);
            }
            li.add(minn);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]==-1)
                a[i][j]=li.get(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(li);
    }
}
