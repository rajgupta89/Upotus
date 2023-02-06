import java.util.*;

public class choco {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            li.add(a);
        }
        int[] b=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=in.nextInt();
            if(li.contains(b[i]))
            System.out.print(b[i]+" ");
        }
    }
}
