package thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool4 {
    public static void main(String[] args) {
        //创建单个执行定时任务的线程池
        ScheduledExecutorService scheduledExecutorService =
        Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务"+new Date());
            }
        },1,3,TimeUnit.SECONDS);
    }
}
