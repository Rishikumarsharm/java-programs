import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        int num,rev=0,rem,n;
     Scanner scn=new Scanner(System.in);
     System.out.println("enter a number: ");
     num=scn.nextInt();
     n = num;
     while(num!=0) {
         rem = num % 10;
         rev = rev * 10 + rem;
         num = num / 10;
     }

         if(n==rev)
         {
             System.out.println("the number is palindrome");
         }
         else
         {
             System.out.println("the number is not a palindrome");
         }

     }
    }

