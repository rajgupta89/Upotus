import java.util.Scanner;

public class longpalindrome {
    static String pali(String s){
        String news="";
        int maxx=0;
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            String s1="";
            for (int j = i; j < s.length(); j++) {
                s1+=s.charAt(j);
                StringBuilder sb=new StringBuilder(s1);
                sb.reverse();
                if(s1.equals(sb.toString())){
                    count=s1.length();
                    if(count>maxx){
                        maxx=count;
                        news=s1;
                    }
                }
            }
        }
        return news;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(pali(s));
    }
}
