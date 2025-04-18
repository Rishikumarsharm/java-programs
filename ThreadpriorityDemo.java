class priority implements Runnable
{
    int count;
    Thread thrd;
    static boolean stop=false;
    static String currentName;
    priority(String name)
    {
        thrd= new Thread(this,name);
        count=0;
        currentName=name;
    }
    public void run()
    {
        System.out.println(thrd.getName() + " Starting");
        do
        {
            count++;
            if (currentName.compareTo(thrd.getName()) != 0)
            {
                currentName = thrd.getName();
                System.out.println("In" + currentName);
            }
        }
        while (stop == false && count < 1000);
        stop = true;
        System.out.println("\n" + thrd.getName() + "terminating.");
    }
}
public class ThreadpriorityDemo
{
    public static void main(String[] args)
    {
       priority mt1=new priority("higher priority ");
        priority mt2=new priority("Lower priority ");
        priority mt3=new priority("Normal priority #1");
        priority mt4=new priority("Normal priority #2");
        priority mt5=new priority("Normal priority #3");
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);
        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();
        try
        {
            mt1.thrd.join();
            mt2.thrd.join();
            mt1.thrd.join();
            mt2.thrd.join();
            mt5.thrd.join();
        }
        catch (InterruptedException exc)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("\n Highly Priority thread counted to "+mt1.count);
        System.out.println("\n Lower Priority thread counted to "+mt2.count);
        System.out.println("\n 1st Priority thread counted to "+mt3.count);
        System.out.println("\n 2nd Priority thread counted to "+mt4.count);
        System.out.println("\n 3rd Normal Priority thread counted to "+mt5.count);
    }
}
