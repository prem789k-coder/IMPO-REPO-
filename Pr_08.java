class MyThread1 extends Thread
{
public void run()
{
for (int i=1; i<=4; i++)
{
System.out.println("Thread1 : " +i);
}
}
};
class MyThread2 extends Thread
{
public void run()
{
for (int i=1; i<=6; i++)
{
System.out.println("Thread2 : " +i);
}
}
};

class MyRunnable implements Runnable
{
public void run()
{
System.out.println("Runnable Running Interface");
}
};

public class ThreadEx
{
public static void main(String args[])
{
MyThread1 m1 = new MyThread1();
m1.start();
MyThread2 m2 = new MyThread2();
m2.start();

MyRunnable r1=new MyRunnable();
Thread t1 =new Thread(r1);
t1.start();
}
}
