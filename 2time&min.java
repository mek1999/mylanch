import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a=new int[2];
        Scanner s = new Scanner(System.in);
        //n = s.nextInt();
        for (int i=0;i<2;i++) 
        {
            a[i] = s.nextInt();
            for(int j=0;j<2;j++)
            {
            	a[j] = s.nextInt();
            }
        }
        for (int i=0;i<2;i++) 
        {
             for(int j=0;j<2;j++)
            {
            	System.out.println(""+a[i]+" "+a[j]);
            }
        }	
		
	}
}
