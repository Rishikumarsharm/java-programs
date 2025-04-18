import java.util.*;
public class tax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float tax;
        System.out.println("enter the amount");
        float amount=sc.nextFloat();
        if (amount < 2.5) {
            tax = 0;
            System.out.println("your tax = "+tax);
        }
        else if (amount > 2.5 && amount < 5)
        {
            tax= amount *0.03f;
            System.out.println("your total tax is: "+tax);
        }
        else if (amount >5 && amount < 7.5)
        {
            tax = amount *0.1f;
            System.out.println("your total tax is: "+tax);
        }
        else if (amount > 7.5 && amount <= 10)
        {
            tax = amount *0.5f;
            System.out.println("your total tax is: "+tax);
        }

    }
}