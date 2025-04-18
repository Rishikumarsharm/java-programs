
import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int[][] a=new int[5][5];
        String[] b=new String[7];
        System.out.println("enter a number: ");
        a[0][1]=scn.nextInt();
        System.out.println("enter a number: ");
        a[1][0]=scn.nextInt();
        a[2][0]=6;
        a[3][0]=5;
        b[4]="LOKESH";
        System.out.println("number in array : "+a[0][1]);
        System.out.println("number in array : "+a[1][0]);
        System.out.println("number in array : "+a[2][0]);
        System.out.println("name in array : "+b[4]);
    }
}
