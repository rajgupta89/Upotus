/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class maxxor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    String a=in.next();
		    String b=in.next();
		    int zero=0, one=0;
		    for (int i=0;i<a.length();i++ ){
		        if(a.charAt(i)=='0')
		         zero++;
		        else
		         one++;
		        if(b.charAt(i)=='0')
		         zero++;
		        else
		         one++;
		    }
		    int count=Math.min(zero,one);
		    for (int i=0;i<count;i++)
		     System.out.print("1");
		    for (int i=count;i<a.length();i++)
		     System.out.print("0");
		    System.out.println();
		}
	}
}
