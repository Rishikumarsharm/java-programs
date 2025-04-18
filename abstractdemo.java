abstract class baseclass
{
    abstract void showme();
    void showmetoo()
    {
        System.out.println("showmetoo is a concrete "+" method-");
    }
}
class childclass extends baseclass
{
    void showme()
    {
        System.out.println(" Implementation of " + " showme in child class");
    }
}
public class abstractdemo
{
    public static void main(String[] args)
    {
        childclass child=new childclass();
        child.showme();
        child.showmetoo();
    }
}
