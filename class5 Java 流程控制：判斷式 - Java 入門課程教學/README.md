### 📘 class5 - Java 流程控制：判斷式

本章節介紹 Java 中的條件判斷語法，包括 `if/else if/else`、`switch` 判斷，以及從使用者取得終端機輸入的方式。

---

#### ✅ 1. `if` 判斷式

用於根據條件執行不同的區塊。

```java
if (條件1) {
    // 條件1 為 true 時執行
} else if (條件2) {
    // 條件2 為 true 時執行
} else {
    // 上面條件都不成立時執行
}
```

🔎 例：
```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

---

#### ✅ 2. `switch` 判斷式

當條件值為固定類型（如 `int`、`String`）時，可使用 `switch` 替代大量的 `if-else`。

```java
switch (變數名稱) {
    case 值1:
        // 執行區塊1
        break;
    case 值2:
        // 執行區塊2
        break;
    default:
        // 所有條件都不符合時執行
        break;
}
```

🔎 例：
```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other Day");
        break;
}
```

---

#### ✅ 3. 標準輸入（使用者從終端機輸入資料）

##### 3.1 載入 Scanner 類別
```java
import java.util.Scanner;
```

##### 3.2 基本用法
```java
Scanner s = new Scanner(System.in);  // 建立 Scanner 物件

int x = s.nextInt();       // 輸入整數
String text = s.next();    // 輸入單行字串
```

🔎 例：
```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入數字：");
        int number = s.nextInt();
        System.out.println("你輸入的是：" + number);
    }
}
```

---

#### 💡 小提醒：
- `if` 判斷適用於複雜邏輯；`switch` 更適合明確值的分支選擇。
- `Scanner` 是 Java 常用的輸入類別，記得輸入後用 `Enter` 結束。

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class6 Java 流程控制：迴圈基礎 - Java 入門課程教學](../class6%20Java%20流程控制：迴圈基礎%20-%20Java%20入門課程教學/README.md)