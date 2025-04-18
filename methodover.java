public class methodover
{
    public static void main(String[] args)
    {
     childclass cc=new childclass(5,6,7);
     cc.show();
    }
}
class parentclass
{
    int i,j;
    parentclass(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("value of i is: " +i+ " and j is: "+j);
    }
}
class childclass extends parentclass
{
    int k;
    childclass(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show()
    {
        super.show();
        System.out.println("value of k is: "+k);
    }
}