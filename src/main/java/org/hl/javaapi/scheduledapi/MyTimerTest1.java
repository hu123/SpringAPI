package org.hl.javaapi.scheduledapi;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTest1 {

    private static long startTime;
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                throw new RuntimeException("人为的抛出异常");
            }
        };
        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task2 get invoked in" + (System.currentTimeMillis() - startTime));
            }
        };

        startTime = System.currentTimeMillis();

        timer.schedule(timerTask1,1000);
        timer.scheduleAtFixedRate(timerTask2,3000,1000);
    }
}
