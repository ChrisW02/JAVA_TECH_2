package MyJavaTest;

import java.util.concurrent.*;

class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class callable {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);

        new Thread(futureTask).start();

        try{
            Object sum = futureTask.get();
            System.out.println("Sum: "+sum);
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch(ExecutionException e){
            e.printStackTrace();
        }
    }
}
