import java.util.Scanner;
public class rev
{
    public static void main(String[] args)
    {
        int n,mod;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter any number : ");
        n=scn.nextInt();
        System.out.println("individual digit of 3 didit number are: ");
        while (n!=0)
        {
            mod=n%10;
            n=n/10;
            System.out.println(mod+ "\n");
        }

    }
}
