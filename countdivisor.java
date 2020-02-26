/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;
class TestClass
{
    public static void main(String args[] ) throws Exception 
    {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        Scanner s = new Scanner(System.in);
        int l= s.nextInt();                 // Reading input from STDIN
        int r= s.nextInt();
        int k= s.nextInt();
        int count=0;
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
                count++;
        }
        System.out.print(+count);    // Writing output to STDOUT

        // Write your code here

    }
}
