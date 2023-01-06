import java.util.*;
public class merge_sort_two_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] a=new int[n+m];
        for (int i = 0; i < n+m; i++) {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int[] a1=new int[n];
        int[] a2=new int[m];
        for (int i = 0; i < n; i++) 
            a1[i]=a[i];
        for (int i = 0, j=n; i < m; i++,j++) 
            a2[i]=a[j];
        for (int i = 0; i < n; i++)
            System.out.print(a1[i]+" ");
        System.out.println();
        for(int i=0;i<m;i++)
           System.out.print(a2[i]+" ");
    }
}
