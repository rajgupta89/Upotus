import java.util.*;

public class chocoo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int y=n-x;
        while(true){
            if(x>y)
                x-=y;
            else if(y>x)
                y-=x;
            if(x==y)
            break;
        }
        System.out.println(n-x-y);
    }
}
