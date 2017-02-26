package org.hl.javaapi.scheduledapi;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledExecutorServiceTest1 {
    private static long startTime;

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                throw new RuntimeException("人为地抛出异常");
            }
        };

        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task get invoked in :" + (System.currentTimeMillis() - startTime));
            }
        };

        startTime = System.currentTimeMillis();
        scheduledExecutorService.schedule(timerTask1, 1000, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleAtFixedRate(timerTask2, 3000, 1000, TimeUnit.MILLISECONDS);
    }
}
