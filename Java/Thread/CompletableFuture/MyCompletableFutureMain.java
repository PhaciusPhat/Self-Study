package Thread.CompletableFuture;

import java.util.concurrent.*;


public class MyCompletableFutureMain {
    public static final int CORE_POOL_SIZE = 0;

    public static final int MAXIMUM_POOL_SIZE = 10;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // create the tracking thread pool with 10 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<String> firstFunc = CompletableFuture.supplyAsync(() -> {
            try {
                long start = System.currentTimeMillis();
                sleep(2);
                System.out.println("first thread");
                System.out.println(System.currentTimeMillis() - start);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return "first thread";
        }, executor);

        CompletableFuture<String> secondFunc = CompletableFuture.supplyAsync(() -> {
            try {
                long start = System.currentTimeMillis();
                sleep(5);
                System.out.println("second thread");
                System.out.println(System.currentTimeMillis() - start);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return "second thread";
        }, executor);

        CompletableFuture<String> thirdFunc = CompletableFuture.supplyAsync(() -> {
            try {
                long start = System.currentTimeMillis();
                sleep(1);
                System.out.println("third thread");
                System.out.println(System.currentTimeMillis() - start);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return "third thread";
        }, executor);

        CompletableFuture<Void> allFunc = CompletableFuture.allOf(thirdFunc, firstFunc, secondFunc);
        allFunc.get();

        executor.shutdown();
    }

    private static void sleep(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
