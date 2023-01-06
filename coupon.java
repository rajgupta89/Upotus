import java.util.*;
class coupon{
    public static boolean coupons(String s){
        String s1=s.substring(0,3);
        String s2=s.substring(3,7);
        String s3="";
        if(s.length()==10)
        s3+=s.substring(7,9);
        else if(s.length()==11)
        s3+=s.substring(7,10);
        else
        s3+=s.substring(7,11);
        for(int i=0;i<3;i++){
            if(s1.charAt(0)==s1.charAt(1)||s1.charAt(0)==s1.charAt(2)||s1.charAt(1)==s1.charAt(2))
            return false;
        }
        if(Integer.parseInt(s2)<1900 || Integer.parseInt(s2)>2019)
        return false;
        if(Integer.parseInt(s3)!=10 && Integer.parseInt(s3)!=20 &&Integer.parseInt(s3)!=50 &&Integer.parseInt(s3)!=100 &&Integer.parseInt(s3)!=200 &&Integer.parseInt(s3)!=500 &&Integer.parseInt(s3)!=1000)
        return false;
        if(! Character.isUpperCase(s.charAt(s.length()-1)))
        return false;
        return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(coupons(s));
    }
}