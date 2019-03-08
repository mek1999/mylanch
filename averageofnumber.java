import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,avg;
		int i=1,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	//	k=s.nextInt();
		int a=new int[n];
		for(i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		while(i<=n)
		{
			sum=sum+a[i];
			i++;
			
		}
		avg=sum/n;
		System.out.println(+avg);
	}
}
