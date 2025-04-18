import java.util.Scanner;
public class convert
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the distance in km:- ");
        float km=scn.nextFloat();

        double mile=(km*0.621371);
        System.out.println(("distance in miles:-"+mile +" miles"));

        System.out.print("enter the rupee in INR:- ");
        float INR=scn.nextFloat();

        double USD=(INR/83);
        System.out.println(("currency  in USD :-  "+USD +" dollar"));

        System.out.print("enter the temperature in c:- ");
        float clesius=scn.nextFloat();

        double fahrenheit=(clesius/33.8);
        System.out.println(("temperature in fahrenheit:-  "+fahrenheit +" F"));



    }
}
