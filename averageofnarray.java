import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int n,sum=0,avg;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++) 
        {
            a[i] = s.nextInt();;
        }
        for (int i=0;i<n;i++) 
        {
        	sum=sum+a[i];
        }	
        avg=sum/n;
        	System.out.println(""+avg);
		
	}
}
