import java.util.*;
public class finally1
{
    public static void showException(int what)
    {
        int t;
        int nums[]=new int[2];
        System.out.println("receiving"+what);
        try
        {
            switch (what)
            {
                case 0:
                    t=10/what;
                case 1:
                    nums[4]=4;
                case 2:
                    return;
                    
            }
        }
        catch(ArithmeticException exc)
        {
            System.out.println("cant't divide by zero");
            return;
        }
        catch(array IndexoutofBoundsException exc)
        {
            System.out.println("no matching element found");
        }
        finally
        {
            System.out.println("leaving try");
        }
    }
}
