import java.util.*;

public class magic_series_generation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=in.nextInt();
        int c;
        int num=n;
        ArrayList<Integer> li=new ArrayList<>();
        li.add(a);
        li.add(b);
        while(n-->0){
            c=a+b;
            li.add(c);
            a=b;
            b=c;
        }
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if(li.get(i)%2==0)
            even.add(li.get(i));
            else
            odd.add(li.get(i));
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

