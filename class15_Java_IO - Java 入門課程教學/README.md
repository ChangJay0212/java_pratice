### 📘 class15 - Java I/O（輸入與輸出）

本章節介紹 Java 的輸入與輸出機制（I/O），以「資料流 Stream」為核心，說明如何處理文字檔與二進位檔案，並使用緩衝與資源自動關閉等進階技巧。

---

#### ✅ 1. Stream（資料流）的分類

##### 📥 資料方向：
- **Input Stream**（輸入流）：從檔案或網路等來源**讀取資料**
- **Output Stream**（輸出流）：將資料**寫入目的地**（如檔案）

##### 📦 資料單位：
| 類型           | 適用場景             | 抽象類別            | 常用子類別                         |
|----------------|----------------------|---------------------|------------------------------------|
| **Byte Stream**| 圖片、影片、二進位檔案 | `InputStream` / `OutputStream` | `FileInputStream` / `FileOutputStream` |
| **Char Stream**| 純文字檔案           | `Reader` / `Writer` | `FileReader` / `FileWriter`       |

---

#### 📚 2. 常用 Java I/O 類別

| 類別                     | 功能說明                                                |
|--------------------------|---------------------------------------------------------|
| `FileInputStream`        | 以位元組方式從檔案讀取資料                              |
| `FileOutputStream`       | 以位元組方式將資料寫入檔案                              |
| `FileReader`             | 以字元方式讀取文字檔案                                  |
| `FileWriter`             | 以字元方式寫入文字檔案                                  |
| `BufferedReader`         | 包裝 `Reader`，提供 `readLine()`、效能佳                 |
| `BufferedWriter`         | 包裝 `Writer`，提供 `newLine()`、效能佳                 |
| `try-with-resources`     | Java 7 起，自動關閉 `Closeable` 物件（如 Stream）        |

---

#### 🔍 範例程式（將寫入並讀取檔案）

```java
import java.io.*;

public class App {
    public static void main(String[] args) {
        // 寫入檔案
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, Java I/O!");
            writer.newLine();
            writer.write("第二行內容");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("讀到內容: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

#### 💡 小提醒：

- 使用 `BufferedReader` / `BufferedWriter` 可以**提升效能**並支援「整行讀寫」。
- 建議搭配 `try-with-resources` 使用，避免忘記關閉檔案造成記憶體或檔案鎖死問題。
- 若操作二進位檔，請使用 `FileInputStream` / `FileOutputStream`。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class16_Java_Exception - Java 入門課程教學](../class16_Java_Exception%20-%20Java%20入門課程教學/README.md)