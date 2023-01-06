import java.util.*;
class TestClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 2; i <=n; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0)
                count++;
            }
            if(count==2)
            li.add(i);
        }
        int sum=0;
        int i=0;
        while(true){
            if(sum<=p){
           sum+=li.get(i);
           if(i==li.size()-1)
           i=0;
           else
           i++;
            }
            else
            break;
            //contributed by Raj Gupta
        }
        System.out.println(i-1);
    }
}
