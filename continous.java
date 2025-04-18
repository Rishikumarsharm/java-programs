import java.util.*;
public class continous
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();
        int i;
        System.out.println("the table is: ");
        for(i=1;i<=10;i++)
        {


            if(i%2!=0)
            {
                continue;
            }
            else
            {
                System.out.println( n * i);
            }
        }
    }
}

