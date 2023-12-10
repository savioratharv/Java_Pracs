class Tableof5 implements Runnable{
    public Tableof5(){
        System.out.println("Table of 5");
    }

    @Override
    public void run() {
        long start=System.currentTimeMillis();
        for(int i=1;i<=10;i++){
            System.out.println("5*"+i+"="+(5*i));
        }
        long end=System.currentTimeMillis();
        System.out.println("Time Required for 5: "+(end-start)+"ms");
    }
}

class Tableof7 implements Runnable{
    public Tableof7(){
        System.out.println("Table of 7");
    }

    @Override
    public void run() {
        long start=System.currentTimeMillis();
        for(int i=1;i<=10;i++){
            System.out.println("7*"+i+"="+(7*i));
        }
        long end=System.currentTimeMillis();
        System.out.println("Time Required for 7: "+(end-start)+"ms");
    }
}

class Tableof13 implements Runnable{
    public Tableof13(){
        System.out.println("Table of 13");
    }

    @Override
    public void run() {
        long start=System.currentTimeMillis();
        for(int i=1;i<=10;i++){
            System.out.println("13*"+i+"="+(13*i));
        }
        long end=System.currentTimeMillis();
        System.out.println("Time Required for 13: "+(end-start)+"ms");
    }
}


public class Threaded_Multiplication {
    public static void main(String[] args) {
        Thread Tableof5 = new Thread(new Tableof5());
        Thread Tableof7 = new Thread(new Tableof7());
        Thread Tableof13 = new Thread(new Tableof13());

        Tableof5.start();
        Tableof7.start();
        Tableof13.start();
    }
}
