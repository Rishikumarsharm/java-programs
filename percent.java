
import java.util.Scanner;
public class percent
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the PHYSICS marks:-" );
        float a=scn.nextFloat();
        System.out.print("enter the CHEMISTRY marks:- ");
        float b=scn.nextFloat();
        System.out.print("enter the MATHS marks:- ");
        float c=scn.nextFloat();
        System.out.print("enter the BIOLOGY marks:- ");
        float d=scn.nextFloat();
        System.out.print("enter the CIVICS marks:- ");
        float e=scn.nextFloat();
        float obtained=a+b+c+d+e;
        System.out.println("the obtained marks is :- "+obtained);
        float per=(obtained*100/500);
        System.out.println("the percent is "+per +" %");


    }
}
