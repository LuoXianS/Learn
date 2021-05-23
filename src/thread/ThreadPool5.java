package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool5 {
    public static void main(String[] args) {
       //创建单个线程池
        ExecutorService executorService =
        Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名"+Thread.currentThread().getName());
                }
            });
        }
    }
  /*  创建单个线程池的意义
    1.避免频繁地创建和销毁线程
    2.有任务队列可以储存多余任务
    3.当有大量任务处处线程处理的范围时，可以执行拒绝策略
    4.可以更好的管理任务*/

}
