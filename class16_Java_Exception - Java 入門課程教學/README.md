### 📘 class16 - Java Exception（例外處理）

本章節介紹 Java 的例外處理機制，包括 `try-catch-finally` 語法、`throws` / `throw` 差異，以及常見的受檢與非受檢例外類型。

---

#### ✅ 1. 為什麼需要例外處理？

- ✅ **避免程式崩潰**：處理錯誤使程式更穩定。
- ✅ **邏輯清晰**：正常邏輯與錯誤邏輯分離。
- ✅ **取得錯誤資訊**：便於除錯與使用者提示。

---

#### 🔐 2. try-catch-finally 語法

```java
try {
    // 可能拋出例外的程式碼
} catch (ExceptionType e) {
    // 發生該類型例外時執行
} finally {
    // 一定會執行的程式碼（釋放資源用）
}
```

🔎 範例：

```java
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]); // 超出範圍
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("索引超出範圍：" + e.getMessage());
} finally {
    System.out.println("不論是否發生例外，我都會被執行");
}
```

---

#### 📤 3. `throws` 與 `throw`

| 關鍵字    | 用法位置     | 用途說明                           |
|-----------|--------------|------------------------------------|
| `throws`  | 方法宣告處   | 宣告此方法「可能會拋出」哪些例外   |
| `throw`   | 方法內部     | 主動「拋出」一個 Exception 物件     |

🔎 範例：

```java
// 宣告方法可能會丟出 Exception
static void readFile() throws IOException {
    throw new IOException("檔案不存在");
}
```

---

#### 📂 4. 常見 Exception 類型

| 類型                | 說明                         | 範例                         |
|---------------------|------------------------------|------------------------------|
| **Checked Exception** | 必須處理（編譯階段強制）     | `IOException`, `SQLException`|
| **Unchecked Exception** | 編譯器不強制處理             | `NullPointerException`, `ArrayIndexOutOfBoundsException` |

---

#### 💡 範例說明 (`App.java`)

本章程式碼將示範：

1. 使用 `try-catch` 處理陣列越界錯誤。
2. 使用 `finally` 保證資源釋放。
3. 建立會 `throws` 出例外的方法。
4. 使用 `throw` 主動拋出 `IllegalArgumentException`。

```java
public class App {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("陣列索引錯誤：" + e.getMessage());
        } finally {
            System.out.println("資源釋放完成！");
        }

        try {
            validateInput(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("非法輸入：" + e.getMessage());
        }
    }

    static void validateInput(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("輸入不能是負數！");
        }
    }
}
```

---

#### 📌 小提醒：

- `try-catch` 是防止程式異常中斷的第一道防線。
- `finally` 常見用途：關閉檔案、釋放連線等資源清理。
- `throws` 與 `throw` 是處理與「主動產生」例外的利器。
- `Exception` 是所有例外的父類，過於籠統時可避免使用。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class17_Java_Thread - Java 入門課程教學](../class17_Java_Thread%20-%20Java%20入門課程教學/README.md)