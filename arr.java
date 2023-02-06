import java.util.*;

public class arr {
    public static String pre(int[] a){
        HashMap<Integer,Integer>li=new HashMap<>();
        for (int i = a[0]; i <=a[1]; i++) {
            if(li.containsKey(i))
            li.put(i,li.get(i)+1);
            else
            li.put(i, 1);
        }
        for (int i = a[2]; i <=a[3]; i++) {
            if(li.containsKey(i))
            li.put(i,li.get(i)+1);
            else
            li.put(i, 1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> ent:li.entrySet()){
            if(ent.getValue()>=2)
            count++;
        }
        if(count>=a[4])
        return "true";
        else
        return "false";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        for (int i = 0; i < 5; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(pre(a));
    }
}
