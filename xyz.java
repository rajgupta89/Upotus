import java.util.Scanner;

public class xyz {
    static boolean company(int[] a){  
            for (int i = 0; i <a.length-1 ; i++) {
                if(a[i]==0)
                return true;
                int sum=a[i];
                for (int j = i+1; j < a.length; j++) {
                    sum+=a[j];
                    if(sum==0)
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int[] a=new int[5];
            for (int i = 0; i < 5; i++) {
                a[i]=in.nextInt();                
            }
            System.out.println(company(a));
        }
    }
}
