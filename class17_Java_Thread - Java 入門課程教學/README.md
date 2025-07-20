### 📘 class17 - Java Thread（多執行緒）

本章節介紹 Java 中的多執行緒（Multithreading）觀念與實作方式，學習如何讓程式在背景同時執行多個任務，提升效能與使用者體驗。

---

#### ✅ 1. 為什麼需要多執行緒？

- 🚀 **提升效能**：可在多核心 CPU 上平行處理任務
- 🎮 **改善使用者體驗**：避免主程式卡住（UI Freeze）
- 🤝 **資源共享**：多執行緒可共享記憶體中的變數與物件

---

#### 🔧 2. 建立執行緒的兩種方式

##### 方法一：繼承 `Thread` 類別（不推薦）

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("執行緒 A 開始！");
    }
}

MyThread t1 = new MyThread();
t1.start();  // 注意：是呼叫 start()，不是 run()
```

##### 方法二：實作 `Runnable` 介面（✅ 推薦）

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("執行緒 B 開始！");
    }
}

Thread t2 = new Thread(new MyRunnable());
t2.start();
```

📌 推薦使用 `Runnable` 的原因：
- Java 不支援多重繼承，若已繼承其他類別，就無法再繼承 `Thread`
- `Runnable` 更彈性、更通用

---

#### 🔁 3. 執行緒生命週期

| 狀態          | 說明                                           |
|---------------|------------------------------------------------|
| `New`         | 剛建立執行緒實例但尚未啟動                      |
| `Runnable`    | 已呼叫 `start()`，等待 CPU 分配                  |
| `Running`     | CPU 正在執行 `run()` 中的程式碼                  |
| `Blocked`     | 等待 I/O、休眠、或鎖定資源                      |
| `Terminated`  | 執行結束（正常完成或發生例外）                  |

---

#### ⏸️ 4. Thread.sleep()

- 讓「目前執行緒」暫停指定毫秒數：
```java
Thread.sleep(1000); // 暫停 1 秒
```
- 常用於模擬耗時操作或控制執行緒交錯順序。

---

#### 💡 範例：App.java 示範

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("MyThread 執行：" + i);
            try {
                Thread.sleep(500); // 暫停 0.5 秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("MyRunnable 執行：" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();

        // 主執行緒
        for (int i = 0; i < 3; i++) {
            System.out.println("Main 執行緒：" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

---

#### 📌 小提醒：

- `start()` 會啟動新執行緒，並自動呼叫 `run()`。
- 切勿直接呼叫 `run()`，否則只是普通方法呼叫，不會產生執行緒。
- 使用 `sleep()` 時要處理 `InterruptedException`。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class18_Spring_Boot_RESTful_API - Java 入門課程教學](../class18_Spring_Boot_RESTful_API%20-%20Java%20入門課程教學/README.md)