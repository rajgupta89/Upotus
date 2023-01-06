import java.util.*;
public class uncommonchar {
    String uncommon(String A, String B){
        String[] a=A.split("");
        ArrayList<String> li=new ArrayList<>(Arrays.asList(a));
        String[] b=B.split("");
        ArrayList<String> li1=new ArrayList<>(Arrays.asList(b));
        ArrayList<Character> li2=new ArrayList<>();
        String neww="";
        for(int i=0;i<li1.size();i++){
            if(! li.contains(li1.get(i))){
                if(! li2.contains(B.charAt(i)))
                li2.add(B.charAt(i));
            }
        }
        for(int i=0;i<li.size();i++){
            if(! li1.contains(li.get(i))){
                if(! li2.contains(A.charAt(i)))
                li2.add(A.charAt(i));
            }
        }
        Collections.sort(li2);
        for (int i = 0; i < li2.size(); i++) {
            neww+=li2.get(i);
        }
        if(neww.length()==0)
            return "-1";
        else
            return neww;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.next();
        String B=in.next();
        uncommonchar obj=new uncommonchar();
        System.out.println(obj.uncommon(A,B));
    }
}
