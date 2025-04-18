import java.util.Scanner;
public class string
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        String name=new String("lokesh ");
        System.out.println(name);
      String name1="lokesh"; // String is immutable
        System.out.println(name1);
        int a=6;
        float b=5.67f;
        float c=a+b;
        System.out.printf("the value of a is %d and the value of b is %f",a,b);
        System.out.format("the value of a is %d and the value of b is %f",a,b);
        System.out.println("\n");
        String add=scn.next();
        System.out.println("enter the address: "+add);
    }
}
