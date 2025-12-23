class Counter{
    int count=0;
    public synchronized void Increment()
    {
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException
    {
        Counter c=new Counter();

        Runnable obj1= () -> {
            for(int i=1;i<=1000;i++)
            {
                c.Increment();
            }
        };
        Runnable obj2= () -> {
            for(int i=1;i<=1000;i++)
            {
                c.Increment();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        // ✅ START FIRST
        t1.start();
        t2.start();

        // ✅ THEN WAIT
        t1.join();
        t2.join();

        // ✅ Now it is safe to read the value
        System.out.println(c.count); // Always 2000
    }
}
