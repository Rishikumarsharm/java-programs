public class dymtdsi
{
    public static void main(String[] args)
    {
      sup supob=new sup();
      sub1 sub1ob=new sub1();
      sub2 sub2ob=new sub2();
      sup supref;
      supref=supob;
      supref.who();
      supref=sub1ob;
      supref.who();
      supref=sub2ob;
      supref.who();
    }
}
class sup
{
    void who()
    {
        System.out.println("who() in sup");
    }
}
class sub1 extends sup
{
    void who()
    {
        System.out.println("who() is sub1");
    }
}
class sub2 extends sup
{
    void who()
    {
        System.out.println("who() is sub2");
    }
}