import java.util.Scanner;

public class pattern2
{
    public static void main(String[] args)
    {
        //triangle pattern
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n= scn.nextInt();
        for(int i=n;i>=1;i--)
        {
            //print spaces
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
             //print Stars
          for(int k=(2*i-1);k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
