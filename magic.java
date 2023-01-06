import java.util.*;

public class magic {
    public static boolean prime(int a){
       int count=0;
       for (int i = 1; i <=a; i++) {
           if(a%i==0)
           count++;
       }
       if(count==2)
       return true;
       else 
       return false;
    }
    public static void count(String s){
        HashMap<Character,Integer> li=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(li.containsKey(s.charAt(i)))
            li.put(s.charAt(i), li.get(s.charAt(i))+1);
            else
            li.put(s.charAt(i), 1);
        }
        int x=0,y=1;
        for(Map.Entry<Character,Integer> ent:li.entrySet()){
            if(prime(ent.getValue())==true)
            x+=ent.getValue();
            y*=ent.getValue();
        }
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        count(s);
    }
}
