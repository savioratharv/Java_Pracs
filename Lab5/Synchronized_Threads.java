class Counter{
    static int count=0;
    public synchronized void Increment(){
        count++;
    }
    public synchronized void Decrement(){
        count--;
    }
    public static int GetCount(){
        return count;
    }
}


class Increment implements Runnable{
    private Counter counter;
    public Increment(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            counter.Increment();
        }
    }
    
}

class Decrement implements Runnable{
    private Counter counter;
    public Decrement(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            counter.Decrement();
        }
    }
    
}


public class Synchronized_Threads {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread Increment = new Thread(new Increment(counter));
        Thread Decrement = new Thread(new Decrement(counter));

        Increment.start();
        Decrement.start();

        try {
            Increment.join();
            Decrement.join();
        } catch (InterruptedException e) {
        }

        System.out.println("The Final Count is:"+Counter.GetCount());
    }
}
