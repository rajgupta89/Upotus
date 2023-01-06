import java.util.*;
public class minimumindex {
    int uncommon(String A, String B){
        ArrayList<Character> li1=new ArrayList<>();
        for (int i = 0; i < B.length(); i++) {
            li1.add(B.charAt(i));
        }
        for(int i=0;i<A.length();i++){
            if(li1.contains(A.charAt(i)))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.next();
        String B=in.next();
        minimumindex obj=new minimumindex();
        System.out.println(obj.uncommon(A,B));
    }
}
