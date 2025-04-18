interface printtable
{
    void print();
}
interface showable
{
    void show();
}
public class interfacedemo
{
    public void print()
    {
        System.out.println("welcome");
    }
    public void show()
    {
        System.out.println("students");
    }

    public static void main(String[] args)
    {
     interfacedemo obj=new interfacedemo() ;
     obj.print();
     obj.show();
    }
}
