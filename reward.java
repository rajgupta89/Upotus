import java.util.*;

public class reward {
    public static int getmaximum(int k, List<Integer> reward_1, List<Integer> reward_2){
        int length=reward_1.size();
        int si=k;
        int sum=0;
        ArrayList<Integer> index=new ArrayList<>();
        while(si-->0){
        for (int i = 0; i < length; i++) {
            if(reward_1.get(i)==Collections.max(reward_1)){
            sum+=reward_1.get(i);
            index.add(i);
            reward_1.set(i, -1);
            break;
            }       
        }
    }
    for (int i = 0; i < length; i++) {
        if(! index.contains(i))
        sum+=reward_2.get(i);
    }
    return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        ArrayList<Integer>li=new ArrayList<>();
        ArrayList<Integer>li1=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            li.add(a);
        }
        for (int i = 0; i < n; i++) {
            int b=in.nextInt();
            li1.add(b);
        }
        System.out.println(getmaximum(k, li, li1));
    }
}
