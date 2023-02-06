import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer> li=new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            if(li.containsKey(a))
            li.put(a, li.get(a)+1);
            else
            li.put(a, 1);
        }
        int k=in.nextInt();
        ArrayList<Integer> li22=new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent: li.entrySet()){
            if(ent.getValue()==1)
            li22.add(ent.getKey());              
        }
        System.out.println(li22.get(k-1));
    }
}
