import java.util.Scanner;

class sample{
    public static int pre(int n, int[] a ){
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(pre(n,a));
    }
}