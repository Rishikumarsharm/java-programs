import java.util.*;
public class throw1
{
    static void throwThis() throws IllegalAccessException
    {
        System.out.println("inside throwThis");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String args[])
    {
        try
        {
            throwThis();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught "+e);
        }
    }
}