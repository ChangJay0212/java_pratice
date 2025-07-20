### 📘 class13 - Java Package 封包與權限控制

本章節介紹 Java 中的套件封裝（Package）與類別/屬性/方法的權限修飾子（Access Modifiers），以便大型專案的模組化與存取控制。

---

#### ✅ 1. 封包（Package）

封包是 Java 中用來組織類別的邏輯結構，可以讓不同功能分層清楚、方便專案管理與模組重用。

##### 1.1 宣告封包

每個 `.java` 檔案開頭可用 `package` 宣告所屬封包：

```java
// BasicMath.java
package math;

public class BasicMath {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

---

##### 1.2 匯入封包中的類別

在其他檔案中使用 `import` 匯入：

```java
// main.java
import math.BasicMath;

public class Main {
    public static void main(String[] args) {
        System.out.println(BasicMath.add(3, 5));
    }
}
```

🔧 若需一次匯入整個封包內容：

```java
import math.*;
```

---

##### 📂 範例目錄結構：

```
root/
├── main.java              ← 進入點
└── math/
    └── BasicMath.java     ← 自訂封包中的類別
```

---

##### ⚠️ 編譯注意事項：

- 若類別檔案與主程式檔案不在同一層級，需使用 `import`。
- 若檔案名稱與類別名稱不同，需 **分開編譯** 且 **優先編譯被引用的檔案**。
- 最簡方式是讓「類別名稱」與「檔案名稱」一致，減少錯誤。

---

#### ✅ 2. 權限修飾子（Access Modifiers）

Java 使用四種修飾子控制屬性與方法的可見範圍：

| 修飾子            | 同一類別 | 同一 package | 子類別 | 其他類別 |
|------------------|----------|--------------|--------|----------|
| `public`         | ✅        | ✅            | ✅      | ✅        |
| `protected`      | ✅        | ✅            | ✅      | ❌        |
| `default`（無修飾） | ✅        | ✅            | ❌      | ❌        |
| `private`        | ✅        | ❌            | ❌      | ❌        |

---

##### 範例架構：

```
packageA/
├── Parent.java         ← 定義 public / protected / default / private 欄位
├── SamePackage.java    ← 與 Parent 同一 package

packageB/
├── SubClass.java       ← 繼承 Parent，但在不同 package
├── OtherClass.java     ← 不繼承 Parent 且不同 package
```

```java
// Parent.java
package packageA;

public class Parent {
    public int a = 1;
    protected int b = 2;
    int c = 3;            // default
    private int d = 4;
}
```

```java
// SubClass.java
package packageB;
import packageA.Parent;

public class SubClass extends Parent {
    void show() {
        System.out.println(a); // ✅ public
        System.out.println(b); // ✅ protected（可繼承）
        // System.out.println(c); // ❌ default 不同 package
        // System.out.println(d); // ❌ private 無法存取
    }
}
```

---

#### 💡 小提醒：

- `public` → 無限制，常用於 API 開放。
- `protected` → 通常搭配繼承使用。
- `default` → 只有同 package 能用，常用於封裝模組邏輯。
- `private` → 僅類別內部可用，強封裝。

---


### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class14_Java_Collection - Java 入門課程教學](../class14_Java_Collection%20-%20Java%20入門課程教學/README.md)