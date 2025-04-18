import java.util.*;
class childThread implements Runnable
{
    Thread thrd;
    childThread(String name)
    {
        thrd=new Thread(this,name);
    }
    public static childThread CreateAndStart(string name)
    {
        childThread chThrd=new childThread(name);
        chThrd.thrd.start();
        return chThrd;
    }
    public void run()
    {
        System.out.println(thrd.getName()+"starting.");
        try
        {
            for (int count=0;count<3;count++)
            {
                Thread.sleep(400);
                System.out.println("In "+thrd.getName()+"count is"+(count+1));
            }
        }
        catch (InterruptedException exe)
        {
            System.out.println(thrd.getName()+"interrupted");
        }
        System.out.println(thrd.getName()+"termination");
    }
}
public class joinThread
{
    public static void main(String[] args)
    {
        System.out.println("Main thread starting.");
        childThread ct1=childThread.CreateAndStart("child #1");
        childThread ct2=childThread.CreateAndStart("child #2");
        childThread ct3=childThread.CreateAndStart("child #3");
        try
        {
            ct1.thrd.join();
            System.out.println("child #1 joined. ");
            ct2.thrd.join();
            System.out.println("child #2 joined. ");
            ct3.thrd.join();
            System.out.println("child #3 joined. ");
        }
        catch (InterruptedException exc)
        {
            System.out.println("Main thread ending");
        }
    }
}
