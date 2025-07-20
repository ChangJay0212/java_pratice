// 方法一：繼承 Thread 類別
class MyThread extends Thread {
    @Override
    public void run() {
        // 執行緒要執行的任務
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread (繼承) - 執行緒正在執行: " + i);
            try {
                // 暫停 500 毫秒，模擬耗時工作
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("MyThread 被中斷了");
            }
        }
    }
}

// 方法二：實作 Runnable 介面 (推薦)
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 執行緒要執行的任務
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunnable (實作) - 執行緒正在執行: " + i);
            try {
                // 暫停 300 毫秒
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.err.println("MyRunnable 被中斷了");
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("主執行緒 (main) 開始。");

        // 建立並啟動第一個執行緒 (繼承 Thread)
        MyThread thread1 = new MyThread();
        thread1.start(); // 呼叫 start() 來啟動，而不是 run()

        // 建立並啟動第二個執行緒 (實作 Runnable)
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        // 主執行緒繼續執行自己的工作
        for (int i = 0; i < 5; i++) {
            System.out.println("主執行緒 (main) 正在執行: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.err.println("主執行緒被中斷了");
            }
        }

        System.out.println("主執行緒 (main) 結束。");
    }
}
