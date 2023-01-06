import java.util.*;
class golden {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int total=0;
        for (int i = n; i <=m; i++) {
            int a=i;
            int sum=0;
            int max=0;
            while(a>0){
                sum+=a%10;
                max=Math.max(max, a%10);
                a/=10;
            }
            if((sum-max)==max){
                total+=i;
            }
        }
        System.out.println(total);
    }
}

