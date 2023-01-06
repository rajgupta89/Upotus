import java.text.NumberFormat.Style;
import java.util.*;
class threecommon{
    ArrayList<Integer> remove(int A[], int n){
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(! li.contains(A[i]))
               li.add(A[i]);
        }
        return li;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] A=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=in.nextInt();
        }
        threecommon obj=new threecommon();
        System.out.print(obj.remove(A, n));
    }
}