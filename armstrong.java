import java.util.*;
public class armstrong
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter any number: ");
        int num=scn.nextInt();
        int rev=0;
        int rem;
        int n;
        n = num;
        while(num!=0)
        {
            rem=num%10;
            rev=rev+(rem*rem*rem);
            num=num/10;
        }
        if (n==rev)
        {
            System.out.println("the number is armstrong");
        }
        else
        {
            System.out.println("not an armstrong");
        }
    }
}
