import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double a,b;
		String ch;
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		//System.out.println(" 1.Add \n 2.Substraction\n 3.Multiply\n 4.Divide");
		ch=s.next();
		switch(ch)
		{
			case "+":System.out.println(""+(a+b));
				break;
			case "-":System.out.println(""+(a-b));
				break;
			case "*":System.out.println(""+(a*b));
				break;
			case "/":if((a!=0)&&(b!=0))
				{
					System.out.println(""+(a/b));
				}
				else
				{
					System.out.println("Infinity");
				}
				break;
			default:System.out.println("No operation,so choose the choice 1 to 4");
			break;
			
		}
		
	}
}
