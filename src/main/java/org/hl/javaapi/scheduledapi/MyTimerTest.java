package org.hl.javaapi.scheduledapi;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTest {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        Timer timer = new Timer();

        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("在这么多毫秒后,得到执行:" + (System.currentTimeMillis() - startTime));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        TimerTask timerTask2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("在这么多毫秒后,得到执行:" + (System.currentTimeMillis() - startTime));
            }
        };
        //1秒后得到执行
        timer.schedule(timerTask1, 1000);
        //3秒后得到执行
        timer.schedule(timerTask2, 3000);


    }
}
