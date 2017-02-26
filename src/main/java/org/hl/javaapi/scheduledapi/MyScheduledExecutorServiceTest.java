package org.hl.javaapi.scheduledapi;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledExecutorServiceTest {
    private static long startTime;

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务1在这么多毫秒后执行: " + (System.currentTimeMillis() - startTime));
                try {
                    //人为睡眠5秒
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务2在这么多毫秒后执行:  "+ (System.currentTimeMillis() - startTime));
            }
        };
        startTime = System.currentTimeMillis();
        scheduledExecutorService.schedule(timerTask1, 1000, TimeUnit.MILLISECONDS);
        scheduledExecutorService.schedule(timerTask2, 3000, TimeUnit.MILLISECONDS);
    }
}
