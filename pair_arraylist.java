import java.util.*;

public class pair_arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int i=0;
        int count=0;
        while(true){
            if(i<n-1){
                i=i+a[i];
                count++;
            }
            else 
            break;
        }
        System.out.println(count);
    }
}
