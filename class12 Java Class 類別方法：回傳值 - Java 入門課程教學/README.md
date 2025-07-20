### 📘 class12 - Java Class 類別方法：回傳值

本章節介紹 Java 中如何在類別方法中使用「回傳值」，並學習如何透過 `return` 傳回運算結果或其他資料給呼叫者。

---

#### ✅ 1. 類別方法的回傳值

當方法有結果要傳回時，必須：
- 在方法名稱前**指定回傳值型態**
- 使用 `return` 將結果返回

```java
static 回傳型態 方法名稱(參數...) {
    return 回傳的資料;
}
```

---

#### 🔎 範例：加總兩個整數並回傳結果

```java
class 類別名稱 {
    public static void main(String[] args) {
        int result = 類別名稱.add(1, 2);
        System.out.println(result);  // 輸出 3
    }

    static int add(int n1, int n2) {
        return n1 + n2;
    }
}
```

---

#### 💡 小提醒：
- 方法的回傳型態可以是 `int`、`double`、`boolean`、`String` 或任何物件型別。
- 若無需回傳值，請使用 `void`。
- `return` 語句一旦執行，方法會立即結束。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class13 Java Package 封包、權限控制 - Java 入門課程教學](../class13%20Java%20Package%20封包、權限控制%20-%20Java%20入門課程教學/README.md)