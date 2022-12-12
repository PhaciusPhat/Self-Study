package Thread.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableMain {
    public static final int GET_TIME_OUT = 2;
    public static void main(String[] args) throws InterruptedException {
        // create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<>();

        // Get ExecutorService from Executors utility class, thread pool size is 5
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Callable<String> callable;
        Future<String> future;
        for (int i = 1; i <= 10; i++) {
            callable = new Task("task" + i);

            // submit Callable tasks to be executed by thread pool
            future = executor.submit(callable);

            // add Future to the list, we can get return value using Future
            list.add(future);
        }

        // shut down the executor service now
        executor.shutdown();

        // Wait until all threads are finish
        while (!executor.awaitTermination(GET_TIME_OUT * 10 * 1000, TimeUnit.SECONDS)) {
            // Running ...
        }

        List<String> array = new ArrayList<>();
        for (Future<String> f : list) {
            try {
                array.add(f.get(GET_TIME_OUT, TimeUnit.SECONDS));
            } catch (TimeoutException | CancellationException | InterruptedException | ExecutionException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Finished all threads: ");
        for (String i : array) {
            System.out.println(i);
        }
    }
}
