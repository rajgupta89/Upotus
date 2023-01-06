import java.util.*;

public class print_anagram_together {
    static String sort(String s){
        char[] temp=s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public List<List<String>> Anagram(String[] string_list){
        // List<List<String>> li=new ArrayList<List<String>>();
        HashMap<String,List<String>> mp=new HashMap<>();
        for (int i = 0; i < string_list.length; i++) {
            String s=string_list[i];
            String s1=sort(s);
            if(mp.containsKey(s1))
            mp.get(s1).add(s);
            else{
                mp.put(s1, new ArrayList<>());
                mp.get(s1).add(s);
            }
        }

        return new ArrayList<>(mp.values());
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=in.next();
        }
        print_anagram_together obj=new print_anagram_together();
        System.out.println(obj.Anagram(s));
    }
}
