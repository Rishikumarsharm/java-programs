import java.util.*;
public class break1
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();
        int i=1;
        System.out.println("the table is: ");
        for(i=1;i<n;i++)
        {


            if(i==8)
            {
                System.out.println("end");
                break;
            }
            else
            {
                System.out.println( n * i);
            }
        }
    }
}
