import java.util.Scanner;

public class taste {
    public static int ind(int i,int k, int[] a,int n){
        int index=a[n-2];
        int maxx=0;
        int size;
        if((i+1+k)<=n)
        size=i+1+k;
        else
        size=n;
        for (int j = i+1; j < size; j++) {
            if(a[j]>maxx){
                maxx=a[j];
                index=j;
            }
        }
        return index;
    }
    public static int pre(int n, int k, int[] a, int[] b){
        int weight=0;
         for(int i=0;i<n-1;i++){
             int size=b[i];
             int index=i;
             while(index<n){
             int cou=ind(index, k, a,n);
             size+=b[cou];
             index=cou;
             }
             weight=Math.max(weight, size);
             System.out.println(index);
         }
         return weight;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=in.nextInt();
        }
        System.out.println(pre(n,k,a,b));
    }    
}
