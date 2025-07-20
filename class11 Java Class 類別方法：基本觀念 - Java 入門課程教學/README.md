### 📘 class11 - Java Class 類別方法：基本觀念

本章節介紹 Java 中類別方法（methods）的基本組成，包括命名、參數、回傳值，以及如何定義與呼叫靜態方法。

---

#### ✅ 1. 方法的基本組成

一個方法通常包含以下幾個部分：

| 項目         | 說明                                     |
|--------------|------------------------------------------|
| 方法名稱     | 命名方式採用小駝峰（如：`printMessage`） |
| 程式區塊     | 包含要執行的邏輯 `{ ... }`                |
| 方法參數     | 輸入資料，可為 0 個或多個                |
| 回傳值       | 回傳給呼叫端的資料（`void` 代表不回傳）  |

---

#### ✅ 2. 定義類別中的方法

##### 📌 2.0 最簡單的靜態方法定義：

```java
class 類別名稱 {
    static void 方法名稱() {
        // 要執行的程式碼
    }
}
```

---

#### 📌 2.1 呼叫自身類別的靜態方法

```java
class 類別名稱 {
    public static void main(String[] args) {
        類別名稱.hello();  // 呼叫自己類別內的 hello 方法
    }

    static void hello() {
        System.out.println("Hello from static method");
    }
}
```

---

#### 📌 2.2 定義具有參數的方法

```java
static void sayHello(String name) {
    System.out.println("Hello, " + name);
}
```

---

#### 📌 2.3 傳入參數資料並呼叫方法

```java
class 類別名稱 {
    public static void main(String[] args) {
        類別名稱.hello("你好");
    }

    static void hello(String msg) {
        System.out.println(msg);
    }
}
```

---

#### 💡 小提醒：
- `static` 方法不需建立物件即可呼叫，適合工具函式或簡易功能。
- 方法名稱應具描述性，例如 `printResult()` 而非 `p1()`。
- 若無回傳值，使用 `void`；若有，需指定型別並使用 `return` 回傳。

---

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class12 Java Class 類別方法：回傳值 - Java 入門課程教學](../class12%20Java%20Class%20類別方法：回傳值%20-%20Java%20入門課程教學/README.md)