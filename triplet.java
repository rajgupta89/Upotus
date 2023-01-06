import java.util.*;
class triplet{
    public static int triple(int n,int[] a,int k){
        int count=0;
        for(int i=0;i<n-2;i++){
        HashSet<Integer> li=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int x=k-a[i]-a[j];
                if(li.contains(x))
                count++;
                else
                li.add(a[j]);
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int k=in.nextInt();
        System.out.println(triple(n,a,k));
    }
}