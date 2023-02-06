import java.util.Arrays;
import java.util.Scanner;

public class weird {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a={3,3,1,3,3};
        int[] b={5};
        System.out.println(array(a));
        System.out.println(array(b));
    }
    public static int array(int[] a){
        if(a.length<2)
            return 0;
        int[] li=new int[a.length];
        int count=0;
        int maximum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i]==a[j])
                    count++;
                else{
                    li[i]=count;
                    count=0;
                    break;
                }
            }
        }
        maximum=Arrays.stream(li).max().getAsInt();
        return maximum;
    }
}
