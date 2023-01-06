import java.util.*;
class maxxx{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
        int n=in.nextInt();
        long[] a=new long[n];
        ArrayList<Long> li=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            long min_sum=0, max_sum=0;
            for (int j = 0; j <=i; j++) {
                if(a[j]>0)
                  max_sum+=a[j];
                else
                  min_sum+=a[j];
            }
            li.add(min_sum+max_sum);
            System.out.print(li.get(i)+" ");
        }
    }
}
}