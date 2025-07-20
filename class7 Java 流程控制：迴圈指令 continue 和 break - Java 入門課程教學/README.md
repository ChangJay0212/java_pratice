### 📘 class7 - Java 流程控制：迴圈指令：`continue` 與 `break`

本章節介紹 Java 中控制迴圈流程的兩個重要指令：`continue` 與 `break`，可用來跳過某次迴圈或提前結束迴圈。

---

#### ✅ 1. `continue` 指令

- 用於**跳過本次迴圈**，直接進入下一次的判斷或遞增邏輯。
- 常用於過濾不符合條件的情況。

🔎 範例：
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // 跳過 i==3 的那次迴圈
    }
    System.out.println("i = " + i);
}
```

📝 輸出：
```
i = 1
i = 2
i = 4
i = 5
```

---

#### ✅ 2. `break` 指令

- 用於**中斷整個迴圈**，提早結束執行。
- 常用於搜尋到結果即可離開迴圈的情境。

🔎 範例：
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;  // 直接跳出整個 for 迴圈
    }
    System.out.println("i = " + i);
}
```

📝 輸出：
```
i = 1
i = 2
```

---

#### 💡 小提醒：
- `continue` 只是略過「這一次」的迴圈，不會跳出整個迴圈。
- `break` 是徹底結束目前的迴圈（`for` 或 `while`）。
- 在巢狀迴圈中，`break` 只會跳出「內層」迴圈。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class8 Java 陣列資料型態 Array - Java 入門課程教學](../class8%20Java%20陣列資料型態%20Array%20-%20Java%20入門課程教學/README.md)