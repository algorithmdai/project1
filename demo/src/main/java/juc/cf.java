package juc;

import java.util.concurrent.CompletableFuture;

public class cf {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture cf1=CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(1);
        });

        CompletableFuture cf2=cf1.thenRunAsync(()->{
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(2);
        });
        CompletableFuture cf3=cf1.thenRun(()->{
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(3);
        });

        System.out.println(1);
        Thread.sleep(2000);
    }
}
