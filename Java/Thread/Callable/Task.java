package Thread.Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    String content;
    private final Random random;
    public Task(String content) {
        this.content = content;
        random = new Random();
    }

    @Override
    public String call() throws Exception {
        int time = random.nextInt(10) * 1000;
        Thread.sleep(time);
        System.out.println("complete this task : " + content + " in " + time/1000 + "s");
        return content;
    }
}
