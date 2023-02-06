import java.util.*;
class pali{
    public static void drome(String s){
        ArrayList<String> li=new ArrayList<>();
        ArrayList<String> li1=new ArrayList<>();
        String[] s1=s.split(" ");
        for (int i = 0; i < s1.length; i++) {
         StringBuilder sb=new StringBuilder(s1[i]);
         if(s1[i].equals(sb.reverse().toString()))
          li.add(s1[i]);
          else
          li1.add(s1[i]);
        }
        System.out.println(li);
        System.out.println(li1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        drome(s);
    }
}