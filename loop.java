import java.util.Scanner;
public class loop
{
    public static void main(String[] args)
    {
       Scanner scn=new Scanner(System.in);
        System.out.println("enter the number:- ");
        int a= scn.nextInt();
        int i=0;
        while (i<=10)
        {
            System.out.println(a*i);
            i+=1;
        }
        System.out.println("enter a number");
        int b=scn.nextInt();
        for(int k=10;k>0;)
        {
            System.out.println(b*k);
            k--;
        }

    }
}
