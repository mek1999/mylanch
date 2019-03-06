import java.util.Scanner;
class Swap_BitwiseXOR 
{
    public static void main(String args[])
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println(""+m+" "+n);
    }
}
