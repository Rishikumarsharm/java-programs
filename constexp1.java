public class constexp1
{
    public static void main(String[] args)
    {
        int vl1 = 5;
        int vl2 = 6;
        calc cl = new calc(vl1, vl2);
        int vl3 = cl.sum();
        System.out.println("sum of two values is: " + vl3);
        int vl4 = cl.sub();
        System.out.println("subtraction of two values is: " + vl4);
    }
}
class calc
{
    int a;
    int b;
    calc(int a1,int b1)
    {
        a=a1;
        b=b1;
    }
    int sum()
    {
        int c=a+b;
        a=c;
        return c;
    }
    int sub()
    {
        int c=a-b;
        return c;
    }
}

