package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadPool2 {
    public static void main(String[] args) {
        ThreadFactory threadFactory =new  ThreadFactory(10);
        ExecutorService executorService =
                Executors.newFixedThreadPool(10, ThreadFactory);
        for (int i = 0; i <10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程池："+Thread.currentThread().getName()+
                            "优先级："+Thread.currentThread().getPriority());
                }
            });
        }
    }
}
