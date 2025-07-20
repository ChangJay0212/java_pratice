### 📘 class2 - Java 資料型態與變數

在本章節中，我們學習了 Java 程式的基本註解寫法，以及變數的資料型態與宣告方式。

#### ✅ 內容重點：

- 單行註解（Single-line Comment）：
  ```java
  // 這是一行註解
  ```

- 多行註解（Multi-line Comment）：
  ```java
  /*
    這是多行註解
    可以換行
  */
  ```

- 常見變數資料型態（Primitive Types）：
  | 類型     | 說明           | 範例值         |
  |----------|----------------|----------------|
  | `int`    | 整數           | `int x = 10;`  |
  | `double` | 浮點數         | `double pi = 3.14;` |
  | `char`   | 單一字元       | `char c = 'A';` |
  | `boolean`| 布林值（真假） | `boolean isOk = true;` |
  | `String` | 字串（非原始） | `String name = "Jay";` |

- 變數宣告與賦值：
  - 宣告時必須指定變數型態，並且與賦予的值型態一致：
    ```java
    int age = 25;
    double price = 99.9;
    String name = "Java";
    ```

#### 💡 小提醒：
- Java 是靜態型別語言，變數的型態在編譯時期就需明確指定，不能像 Python 那樣動態變更。
- 若型態不一致會導致編譯錯誤，例如：
  ```java
  int x = "abc"; // ❌ 錯誤：不能把字串指派給整數
  ```

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class3 Java 資料型態的轉換 - Java 入門課程教學](../class3%20Java%20資料型態的轉換%20-%20Java%20入門課程教學/README.md)