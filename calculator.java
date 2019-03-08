import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,ch;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(" 1.Add \n 2.Substraction\n 3.Multiply\n 4.Divide");
		ch=s.nextInt();
		switch(ch)
		{
			case 1:System.out.println(""+(a+b));
				break;
			case 2:System.out.println(""+(a-b));
				break;
			case 3:System.out.println(""+(a*b));
				break;
			case 4:if((a!=0)&&(b!=0))
				{
					System.out.println(""+(a/b));
				}
				else
				{
					System.out.println("In")
				}
				break;
			default:break;
			
		}
		
	}
}
