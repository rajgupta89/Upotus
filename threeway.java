import java.util.ArrayList;
import java.util.Scanner;

public class threeway {
    public ArrayList<Integer> three(int array[],int a, int b){
        ArrayList<Integer> li1=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        ArrayList<Integer> li3=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]<a)
            li1.add(array[i]);
            else if(array[i]>b)
            li3.add(array[i]);
            else
            li2.add(array[i]);
        }
        li1.addAll(li2);
        li1.addAll(li3);
        for (int i = 0; i < array.length; i++) {
            array[i]=li1.get(i);
        }
        return li1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int a=in.nextInt();
        int b=in.nextInt();
        threeway obj=new threeway();
        System.out.println(obj.three(arr, a, b));  
    }
}
