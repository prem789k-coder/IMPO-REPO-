class Shared { 
    int number; 
    boolean ready = false; 
 
    synchronized void produce(int n) { 
        while (ready) { 
            try { 
                wait(); 
            } catch (Exception e) {} 
        } 
        number = n; 
        System.out.println("Produced:" + n); 
        ready = true; 
        notify(); 
    } 
 
    synchronized void consume() { 
        while (!ready) { 
            try { 
                wait(); 
            } catch (Exception e) {} 
        } 
        System.out.println("Consumed:" + number); 
        ready = false; 
        notify(); 
    } 
} 
 
class Producer extends Thread { 
    Shared s; 
    Producer(Shared s) { 
        this.s = s; 
    } 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            s.produce(i); 
        } 
    } 
} 
 
class Consumer extends Thread { 
    Shared s; 
    Consumer(Shared s) { 
        this.s = s; 
    } 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            s.consume(); 
        } 
    } 
} 
 
public class InterThreadExample { 
public static void main(String args[]) { 
Shared s = new Shared(); 
new Producer(s).start(); 
new Consumer(s).start(); 
} 
}
