import java.util.*;
public class alphabet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          while(n-->0){
              in.nextLine();
              HashMap<Character,Integer>li=new HashMap<>();
              String s=in.nextLine();
              s=s.toLowerCase();
              for (int i = 0; i < s.length(); i++) {
                  if(s.charAt(i)!=' '){
                  if(li.containsKey(s.charAt(i)))
                  li.put(s.charAt(i), li.get(s.charAt(i))+1);
                  else
                  li.put(s.charAt(i), 1);
                  }
              }
              System.out.println(li.size()==26 ? 1:0);
            // System.out.println(li.size());
          }
    }
}
