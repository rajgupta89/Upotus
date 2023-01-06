import java.util.*;
class TestClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s=s.toLowerCase();
        String a="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            a+='0';
            else
            a+='1';
        }
        System.out.println(Integer.parseInt(a, 2));
    }
}
