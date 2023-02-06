import java.util.*;

public class strdup {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1="";
        ArrayList<Character> li=new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='='){
            if(! li.contains(s.charAt(i))){
                li.add(s.charAt(i));
                s1+=s.charAt(i);
            }
        }
        else{
            s1+=s.charAt(i);
        }
        }
        System.out.println(s1);
    }
}
