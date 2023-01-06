import java.util.ArrayList;
import java.util.Scanner;

public class leader {
    static ArrayList<Integer> leaders(int n, int[] arr){
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            int maxx=0;
            for(int j=i;j<n;j++){
                maxx=Math.max(maxx,arr[j]);
            }
            if(arr[i]==maxx)
             li.add(arr[i]);
        }
        return li;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(leaders(n, arr));
    }
}
