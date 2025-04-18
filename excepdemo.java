public class excepdemo
{
    public static void main(String args[])
    {
        String arr[]=null;
        try
        {
            arr=new String[7];
            System.out.print(arr[0]);
            System.out.print("Last statement of try block");
        }
        catch(ArithmeticException ex)
        {
            System.out.print("You should not divide a \"+\" number by Zero");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("array index is out of " + arr.length + " bounds");
        }
        catch(Exception ex)
        {
            System.out.println("Same other error:"+ ex.getMessage());
        }
        System.out.println("out of try-catch block");
    }
}