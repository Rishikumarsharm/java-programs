import java.util.*;
public class interfaceuse
{
    public static void main(String[] args)
    {
      otherclass oc=new otherclass();
      oc.method1();
      oc.method2();
      oc.method3();
    }
}
interface lok1
{
    void method1();
    void method2();
}
interface lok2 extends lok1
{
    void method3();
}
class otherclass implements lok2
{
     public void method1()
        {
            System.out.println("this is method1");
        }
    public void method2()
        {
            System.out.println("this is method2");
        }
    public void method3()
        {
            System.out.println("this is method3");
        }

}
