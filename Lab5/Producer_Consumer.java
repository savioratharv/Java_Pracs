import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Producer Producing"+i);
                queue.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Consumer implements Runnable{
    BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                queue.take();
                System.out.println("Consumer Consuming"+i);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
    
}

public class Producer_Consumer{
    public static void main(String[] args) {
        BlockingQueue<Integer> queue= new ArrayBlockingQueue<>(10);
        Thread Producer = new Thread(new Producer(queue));
        Thread Consumer = new Thread(new Consumer(queue));

        Producer.start();
        Consumer.start();
    }
}