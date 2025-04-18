import java.util.*;
public static void show(int value) throws ArithmeticException
{
    int t;
    try
    {
        switch (value)
        {
            case 0:
                t = 10 / value;
                break;
            case 1:
                System.out.println("ok");
                break;

        }
    }
    catch (ArithmeticException ex)
    {
        System.out.println("it is an ArithmeticException ");
    }
}
public class excep
{
    public static void main(String[] args)
    {

    }
}