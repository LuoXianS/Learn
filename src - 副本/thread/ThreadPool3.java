package thread;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool3 {
    public static void main(String[] args) {
        //定时执行任务 一直以固定的频率来进行
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(2);
      /*  scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务"+new Date());
            }
        },1,3, TimeUnit.SECONDS);*/

        //以上次任务结束时间做为下次任务开始的时间  人性化
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务"+ new Date());
            }
        },1,3,TimeUnit.SECONDS);
    }
}
