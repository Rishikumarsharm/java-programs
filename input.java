import java.util.Scanner;
public class input
{
    public static void main(String[] args)
    {
      Scanner scn= new Scanner(System.in);
      System.out.print("enter a number1:- ");
      int a= scn.nextInt();
      System.out.print("enter a number2:- ");
      int b=scn.nextInt();
      int sum=a+b;
      System.out.println("sum:- "+sum);
    }
}
