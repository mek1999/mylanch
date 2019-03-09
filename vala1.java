import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long cn;
		float dis,amt=0;
		String name;//mailid;
		int ch;
		float sp,dp;
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		cn=s.nextLong();
		//mailid=s.nextLine();
		sp=s.nextFloat();
		dp=s.nextFloat();
		ch=s.nextInt();
		if(sp!=1)
		{
			System.out.println("Invalid!!!\nSource point must be 1\n\t\t\t\tTry again!!!");
		}
		else if(dp>sp)
		{	
			dis=dp-sp;
			if(ch==1||ch==2||ch==3)
			{
				switch(ch)
				{
					case 1:amt=dis*10;
						break;
					case 2:amt=dis*20;
						break;
					case 3:amt=dis*30;
						break;
					default:break;
				}
					//System.out.println(""+amt);
				System.out.println("Name:"+name+"\nContact number:"+cn+"\nSource point:"+sp+"\nDestination point:"+dp);
				System.out.println("Total Distance of travelling:"+dis);
				System.out.println("1.Auto,cost for per km is 10");
				System.out.println("2.Mini,cost for per km is 20");
				System.out.println("3.Macro,cost for per km is 30");
				System.out.println("Choice is:"+ch+"\nCharges:"+amt);
			}
			else
			{
				System.out.println("Choice is Invalid!!!\nso choose choice from 1 to 3");
			}
			
		}
		else
		{
			System.out.println("Destination point is not accepted\nTry again!!");
		}
		
	}	
}
