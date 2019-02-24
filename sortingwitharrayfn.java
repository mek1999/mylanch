import java.util.*;
import java.lang.*;
import java.util.Arrays; 
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        Arrays.sort(a); 
        System.out.printf("%s",Arrays.toString(a));
	}
	
}
