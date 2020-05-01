package main.exercises.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadManager {


    static void testExecutorService() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ThreadManager::makeNumbers);
        executorService.submit(ThreadManager::makeNumbers);
        executorService.shutdown();
    }

    static void testThread() {
        Thread thread1 = new Thread(ThreadManager::makeNumbers);
        Thread thread2 = new Thread(() -> makeNumbers());
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                makeNumbers();
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY); //min priority = 1
        thread2.setPriority(Thread.NORM_PRIORITY); //5
        thread3.setPriority(Thread.MAX_PRIORITY); //10

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void makeNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}