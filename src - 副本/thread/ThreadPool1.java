package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    public static void main(String[] args) {
        //创建带缓存的线程池
        ExecutorService executorService =
                Executors.newCachedThreadPool();
        for (int i = 0; i <10 ; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名"+Thread.currentThread().getName());
                }
            });
        }
    }

}
