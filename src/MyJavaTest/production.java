package MyJavaTest;

class Clerk{

    private int productCount = 0;

    public synchronized void produce(){
        if (productCount<20) {
        productCount++;
            System.out.println(Thread.currentThread().getName()+" No."+productCount);
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void consume(){
        if(productCount>0){
            System.out.println(Thread.currentThread().getName()+" No."+productCount);
            productCount--;
            notify();
        }else{
            try{wait();} catch (InterruptedException e){e.printStackTrace();}
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk){this.clerk = clerk;}

    @Override
    public void run(){
        System.out.println(getName()+": Start producing...");
        while(true){
            try{Thread.sleep(1300);}catch (InterruptedException e){e.printStackTrace();}
            clerk.produce();
        }
    }
}

class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk){this.clerk = clerk;}

    @Override
    public void run(){
        System.out.println(getName()+": Start consuming...");
        while(true){
            try{Thread.sleep(1300);}catch (InterruptedException e){e.printStackTrace();}
            clerk.consume();
        }
    }
}

public class production {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        Consumer c2 = new Consumer(clerk);

        p1.setName("Producer");
        c1.setName("Consumer 1");
        c2.setName("Consumer 2");

        p1.start();
        c1.start();
        c2.start();
    }

}
