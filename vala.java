import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long cn,dis,amt=1;
		String name;
		int sp,dp,ch;
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		cn=s.nextLong();
		sp=s.nextInt();
		dp=s.nextInt();
		ch=s.nextInt();
		if(sp!=1)
		{
			System.out.println("Source point must be 1\nTry again!!!");
		}
		else if(dp>sp)
		{	dp=dp-1;
			dis=sp+dp;
			
			switch(ch)
			{
			case 1:amt=dis*5;
					break;
			case 2:amt=dis*10;
					break;
			case 3:amt=dis*20;
					break;
			default:System.out.println("No operation ,so choose choice from 1 to 2");
					break;
			}
			//System.out.println(""+amt);
			System.out.println("Name:"+name+"\nContact number:"+cn+"\nSource point:"+sp+"\nDestination point:"+dp);
			System.out.println("Total Distance:"+dis+"\n1.Auto\n2.Two wheeler\n3.Cab");
			System.out.println("Choice is:"+ch+"\nCharges:"+amt);
			}
		else
		{
			System.out.println("Destination point is not accepted\nTry again!!");
		}
		
	}	
}
