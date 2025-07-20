### 📘 class14 - Java 集合 Collection

本章節介紹 Java Collections Framework，這是一組用於操作物件群組的標準化 API，支援多種資料結構與常見操作，如新增、刪除、查找與排序等。

---

#### ✅ Java 集合架構核心介面

Java 集合框架提供三大核心類別層級結構：`Collection`、`Map`，其中 Collection 又細分為 `List` 和 `Set`。

---

##### 📦 Collection 介面（通用集合）

- 定義所有集合的基本操作，如：
  - `add(E e)`
  - `remove(Object o)`
  - `contains(Object o)`
  - `size()`

---

##### 📋 List（可重複、有順序）

可透過索引存取元素，元素可重複。

| 類別        | 實作方式             | 特性                     |
|-------------|----------------------|--------------------------|
| `ArrayList` | 動態陣列             | 隨機存取快，新增慢       |
| `LinkedList`| 雙向鏈結串列         | 新增刪除快，存取慢       |

---

##### 🧩 Set（不允許重複元素）

| 類別        | 實作方式     | 特性                          |
|-------------|--------------|-------------------------------|
| `HashSet`   | 雜湊表       | 操作效率高、不保證順序       |
| `TreeSet`   | 紅黑樹       | 元素自動排序                 |

---

##### 🗂️ Map（鍵值對集合）

儲存唯一鍵（key）與其對應的值（value）。

| 類別        | 實作方式     | 特性                          |
|-------------|--------------|-------------------------------|
| `HashMap`   | 雜湊表       | 操作效率高、不保證順序       |
| `TreeMap`   | 紅黑樹       | 鍵自動排序                   |

---

#### 🔍 範例程式碼（簡要）

```java
import java.util.*;

public class App {
    public static void main(String[] args) {
        // ArrayList 示例
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List: " + list);

        // HashSet 示例
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // 不會加入重複的元素
        System.out.println("Set: " + set);

        // HashMap 示例
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 90);
        map.put("Amy", 85);
        System.out.println("Map: " + map);
    }
}
```

---

#### 💡 小提醒：

- `List` 適合需要順序與重複元素的場景。
- `Set` 可防止資料重複，常用於唯一值集合。
- `Map` 是關鍵值儲存的主力，適合字典型資料儲存與查找。

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class15_Java_IO - Java 入門課程教學](../class15_Java_IO%20-%20Java%20入門課程教學/README.md)