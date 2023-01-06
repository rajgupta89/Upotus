import java.util.*;

public class duplicate {
    static void dupli(String s){
        HashMap<Character,Integer> li=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(li.containsKey(s.charAt(i)))
            li.put(s.charAt(i), li.get(s.charAt(i))+1);
            else
            li.put(s.charAt(i), 1);
        }
        for(Map.Entry<Character,Integer> ent:li.entrySet()){
            if(ent.getValue()>1)
            System.out.print(ent.getKey()+" ");z
        }
    } 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        dupli(s);
    }
}
