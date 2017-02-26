package org.hl.javaapi.scheduledapi;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest1 {
    public static void main(String[] args) throws InterruptedException {

        final TimerTask task1 = new TimerTask() {

            @Override
            public void run() {
                throw new RuntimeException("故意的");
            }
        };

        final TimerTask task2 = new TimerTask() {

            @Override
            public void run() {
                System.out.println("task2 invoked!");
            }
        };

        Timer timer = new Timer();
        timer.schedule(task1, 100);
        timer.scheduleAtFixedRate(task2, new Date(), 1000);


    }
}
