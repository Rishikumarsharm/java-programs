public class ThreadDemo
{
    int counter=1;
    static int N=20;
    public void printOddNumber()
    {
        synchronized(this)
        {
            while(counter<N)
            {
                while(counter%2==0)
                {
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.print("Odd:"+counter);
                counter++;
                notify();
            }
        }
    }
    public void printEvenNumber()
    {
        synchronized(this)
        {
            while(counter<N)
            {
                while(counter%2==1)
                {
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.print(" Even: "+counter);
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args)
    {
        N=20;
        ThreadDemo mt=new ThreadDemo();
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                mt.printEvenNumber();
            }
        });
        Thread t2=new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}