import java.util.*;
public class fibbonachi
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("enter a number(n>2): ");
        n=scn.nextInt();
        int fib[]=new int[n];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
            System.out.println(fib[i]);
        }

    }
}
