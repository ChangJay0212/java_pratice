### 📘 class9 - Java Class 類別的基礎概念

本章節介紹 Java 中「類別（Class）」的定義方式，以及如何建立包含 `main` 方法的執行主類別。

---

#### ✅ 1. 類別的定義（Class Definition）

在 Java 中，一個 `.java` 檔案中**可以定義多個類別**，但通常只有一個是「公開（public）」類別，其類別名稱需與檔案名稱相同。

```java
// 檔案名稱：MyProgram.java

class 類別名稱一 {
    // 類別一的屬性與方法
}

class 類別名稱二 {
    // 類別二的屬性與方法
}
```

> 📌 注意：若有 `public class`，該類別名稱必須與檔案名稱一致（不然會編譯錯誤）。

---

#### ✅ 2. 主執行類別：`main` 方法

只要某個類別中定義了 `main` 方法（Java 程式的進入點），就可以被 JVM 執行：

```java
class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
```

> 💡 執行方式：
> ```bash
> javac MyProgram.java   // 編譯
> java MainClass         // 執行具有 main 方法的類別
> ```

---

#### 💡 小提醒：
- `main` 方法的簽名需符合：`public static void main(String[] args)`
- 一個檔案可以有多個類別，但最多只能有一個 `public` 類別。
- 非 `public` 類別可以任意命名，不需與檔案名稱相同。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class10 Java Class 類別屬性 - Java 入門課程教學](../class10%20Java%20Class%20類別屬性%20-%20Java%20入門課程教學/README.md)