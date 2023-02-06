import java.util.*;

public class prefix_to_postfix {
    static String pre(String s){
        Stack<String> li=new Stack<>();
        int length=s.length();
        for (int i = length-1; i >= 0; i--) {
            if(s.charAt(i)=='+'|| s.charAt(i)=='-'|| s.charAt(i)=='*'|| s.charAt(i)=='/'){
                String s1=li.peek();
                li.pop();
                String s2=li.peek();
                li.pop();
                li.push(s1+s2+s.charAt(i));
            }
            else{
                li.push(s.charAt(i)+"");
            }
        }
        return li.peek();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(pre(s));
    }
}
