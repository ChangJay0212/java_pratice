### 📘 class10 - Java Class 類別屬性

本章節介紹 Java 類別的基本組成，包含「屬性（fields）」與「方法（methods）」的定義方式，並補充幾個常見關鍵字的用途：`static`、`final`、`this`、`super`。

---

#### ✅ 1. 類別的組成：屬性與方法

```java
class 類別名稱一 {
    static int x = 3;  // 類別屬性（類別變數）

    public static void main(String[] args) {
        System.out.println(類別名稱一.x);
        System.out.println(類別名稱二.x);

        類別名稱二.text = "Hello Class";
        System.out.println(類別名稱二.text);
    }
}

class 類別名稱二 {
    static String text = "Hello";
    static float x = 8.7f;
}
```

---

#### 🧠 1.1 關鍵字說明（進階）

| 關鍵字     | 功能類別   | 用途與說明                                         |
|------------|------------|----------------------------------------------------|
| `static`   | 類別層級   | 屬性或方法屬於「類別本身」，所有物件共用               |
| `final`    | 不可變屬性 | 無法修改的變數 / 無法覆寫的方法 / 無法繼承的類別       |
| `this`     | 物件指標   | 代表「當前物件的實體」，用於區分參數與屬性             |
| `super`    | 繼承關係   | 表示「父類別」的屬性或方法，用來呼叫父類別內容          |

---

#### 🔸 1.1.1 `static` — 類別共用變數或方法

```java
class MyClass {
    static int count = 0; // 所有物件共用

    static void printCount() {
        System.out.println("Count = " + count);
    }
}
```

---

#### 🔸 1.1.2 `final` — 宣告常數 / 限制覆寫

```java
final class CannotExtend {}  // 此類別不能被繼承

class MyClass {
    final int MAX = 10; // 變數值不能修改

    final void show() { // 方法不能被 override
        System.out.println("Final method");
    }
}
```

---

#### 🔸 1.1.3 `this` — 指向當前物件

用來區分「參數」與「成員變數」同名情況：

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;  // this.name 指的是成員變數
    }
}
```

---

#### 🔸 1.1.4 `super` — 呼叫父類別的建構子或方法

```java
class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void speak() {
        super.speak();            // 呼叫父類別的 speak 方法
        System.out.println("Dog barks");
    }
}
```

---

#### 💡 小提醒：
- `static` 適用於工具函式或共用變數，無需建立物件即可使用。
- `final` 常用來定義不可變的常數或防止繼承。
- `this` 可強調「此物件本身」；`super` 可取得繼承來源的成員或建構器。
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class11 Java Class 類別方法：基本觀念 - Java 入門課程教學](../class11%20Java%20Class%20類別方法：基本觀念%20-%20Java%20入門課程教學/README.md)