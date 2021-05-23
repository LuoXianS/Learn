package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //创建固定个数的线程池
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名"+
                                Thread.currentThread().getName());
            }
        });

    }
}
