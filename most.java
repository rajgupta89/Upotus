import java.util.*;
public class TestClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            HashMap<Character,Integer> li=new HashMap<>();
            String s=in.next();
            int maxx=0;
            for (int i = 0; i < s.length(); i++) {
                if(li.containsKey(s.charAt(i)))
                li.put(s.charAt(i), li.get(s.charAt(i))+1);
                else
                li.put(s.charAt(i),1);
                maxx=Math.max(maxx, li.get(s.charAt(i)));
            }
            for(Map.Entry<Character,Integer>ent:li.entrySet()){
                if(ent.getValue()==maxx)
                System.out.println(ent.getKey());
            }
        }
    }
}
