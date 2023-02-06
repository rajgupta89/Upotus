import java.util.Scanner;
import java.util.Stack;

public class postfix_to_prefix {
    static String pos(String s){
        Stack<String> li=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='+'|| s.charAt(i)=='-'|| s.charAt(i)=='*' || s.charAt(i)=='/'){
                String s1=li.peek();
                li.pop();
                String s2=li.peek();
                li.pop();
                li.push(s.charAt(i)+s2+s1);
            }
            else
            li.push(s.charAt(i)+"");
        }
        return li.peek();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.print(pos(s));
    }
}
