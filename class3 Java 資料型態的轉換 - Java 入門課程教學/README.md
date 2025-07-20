### 📘 class3 - Java 資料型態的轉換

本章節介紹 Java 中不同資料型態之間的轉換規則，包含自動轉型、強制轉型，以及與字串的互轉方式。

#### ✅ 內容重點：

- Java 是 **強型別語言**，變數的型別在編譯階段就需一致，不能自動容錯。
  
---

#### 📐 資料型態大小關係：

- **整數類型順序**：`byte < short < int < long`
- **浮點數類型順序**：`float < double`

---

#### 🔄 型別轉換規則：

##### ✅ 3.1 小範圍 ➝ 大範圍（**自動轉換**）：
```java
byte n1 = 3;
int n2 = n1;
long n3 = 55555555;
float n4 = n3;
```

##### ❌ 3.2 大範圍 ➝ 小範圍（**編譯錯誤或數值失真**）：
```java
int n1 = 3;
byte n2 = n1;       // ❌ 編譯錯誤

double n3 = 3.5;
float n4 = n3;      // ❌ 編譯錯誤

float n5 = 10.5;    // ❌ 編譯錯誤
```

##### ⚠️ 3.2.1 使用「**強制轉型**」後雖能編譯，但會有精度或資料失真：
```java
int n1 = 3;
byte n2 = (byte) n1; // OK

int n3 = 1024;
byte n4 = (byte) n3; // ⚠️ 失真，結果不等於 1024

double n5 = 3.1415926536;
float n6 = (float) n5; // ⚠️ 精度損失
```

---

#### 🔤 字串與數值轉換：

##### 🔁 3.3.1 字串 ➝ 數字
```java
String s = "56";

int x1 = Integer.parseInt(s);
long x2 = Long.parseLong(s);
float x3 = Float.parseFloat(s);
double x4 = Double.parseDouble(s);

// ❌ 無法轉換非數字字串
String m = "Hello World";
// int x = Integer.parseInt(m); // 會丟出 NumberFormatException
```

##### 🔁 3.3.2 數字 ➝ 字串
```java
int x = 3;
String s1 = String.valueOf(x);

String s2 = String.valueOf(1024L);
String s3 = String.valueOf(3.14F);

double y = 3.1415926256;
String s4 = String.valueOf(y);
```

---

#### 💡 小提醒：
- 強制轉型會導致資料失真，務必小心使用。
- 與字串互轉時，務必確保格式正確以避免執行時錯誤。

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class4 Java 基本運算符號 - Java 入門課程教學](../class4%20Java%20基本運算符號%20-%20Java%20入門課程教學/README.md)