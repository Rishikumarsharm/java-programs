import java.util.Scanner;


public class add {
      public static void main(String vals[])
     {
        int a,b;
        int sum;
        Scanner scn = new Scanner(System.in);
         System.out.println("enter two numbers ");
         a=scn.nextInt();
         b=scn.nextInt();
         sum=a+b;
         System.out.println("sum of a+b " +sum);
         scn.close();
      }
}