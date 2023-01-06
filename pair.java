import java.util.*;
class pair{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int num=in.nextInt();
        HashMap<Integer,Integer> li=new HashMap<>();
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]+a[j]==num){
                    if(li.containsKey(a[i])){
                        if(li.get(a[i])!=a[j]){
                            count++;
                            li.put(a[i], a[j]);
                        }
                    }
                    else if(li.containsValue(a[i])){
                        if()
                    }
                    else{
                        li.put(a[i],a[j]);
                        count++;
                    }
                }
            }
        }
        System.out.println(li);
    }
}