import java.util.*;
class TestClass {
    public static int moni(int num){
        int maxx=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;
        ArrayList<Integer> li=new ArrayList<>();
        while(num>0){
            int temp=num%10;
            li.add(0,temp);
            num/=10;
            maxx=Math.max(maxx, temp);
            minn=Math.min(minn, temp);
        }
        for (int i = 0; i < li.size(); i++) {
            if(li.get(i)==minn || li.get(i)==maxx){
                li.remove(i);
                i--;
            }
        }
        String s1=" ";
        if(li.size()==0)
        return 0;
        else{
            for (Integer a : li)
                s1+=a;
        }
        return Integer.parseInt(s1.trim());
    }
  public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      int count=0;
      for (int i = 0; i < n; i++) {
          arr[i]=in.nextInt();
          count+=moni(arr[i]);
      }
      System.out.println(count);
  }    
}
