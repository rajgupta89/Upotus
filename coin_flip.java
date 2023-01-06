import java.util.*;

public class coin_flip {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        // HashMap<Character,Integer> li=new HashMap<>();
        double head=0,tail=0,index=0;
        for (int i = 0; i < n; i++) {
            char c=in.next().charAt(0);
            if(c=='T')
            tail++;
            else
            head++;
            if(head==k){
                index=i+1;
                break;
            }
        }
        int tailsum=0,headsum=0;
        if(index==0){
           tailsum=(int)Math.round((tail*100)/n);
           headsum=(int)Math.round((head*100)/n);
        }
        else{
            tailsum=(int)Math.round((tail*100)/index);
            headsum=(int)Math.round((head*100)/index);
        }
        System.out.println(headsum+" "+tailsum);
    }
}
