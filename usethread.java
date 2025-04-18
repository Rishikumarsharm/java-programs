import java.util.*;
class MyThread implements Runnable
{
     String thdName;
     MyThread(String name)
     {
         thdName=name;
     }
     public void run()
     {
         System.out.println(thdName+"Starting");
         try
         {
             for(int count=0;count<5;count++)
             {
                 Thread.sleep(1000);
                 System.out.println("In "+thdName+"count is "+count);
             }
         }
         catch (InterruptedException exc)
         {
             System.out.println(thdName+"interrupted");
         }
         System.out.println(thdName+"terminating");
     }
}
public class usethread
{
    public static void main(String[] args)
    {
        MyThread mt=new MyThread("Child #1");
        Thread newthrd=new Thread(mt);
        newthrd.start();
        for(int i=0;i<10;i++)
        {
            System.out.println(".>"+i);
            try
            {
                Thread.sleep(400);
            }
            catch (InterruptedException exe)
            {
                System.out.println("main thread interrupted");
            }
        }
        System.out.println("main thread ending");

    }
}
