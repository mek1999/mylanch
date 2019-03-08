import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a,d,t,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=s.nextInt();
		d=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			t=(a+(n-1)d);
			sum=sum+t;
		}
		System.out.println(+sum);
	}
}
