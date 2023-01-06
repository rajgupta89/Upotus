import java.util.ArrayList;
import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            ArrayList<Integer> odd=new ArrayList<>();
            ArrayList<Integer> even=new ArrayList<>();
            String a=in.next();
            for (int i = 0; i < a.length(); i++) {
                if(i%2==0)
                odd.add((a.charAt(i))-'0');
                else
                even.add((a.charAt(i))-'0');
            }
            odd.addAll(even);
            String s1="";
            for (int i = 0; i < odd.size(); i++) {
                s1+=odd.get(i).toString();
            }
            System.out.println(s1);
        }        
    }
}
