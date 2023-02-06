import java.util.Scanner;

public class leading_digit_x {
    public static int pre(int x, int y){
        if(x%y==0)
           return x;
        x=(x*10);
        while(true){
        if(x%y==0)
           return x;
        x++;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        System.out.println(pre(x,y));
    }
}
