### 📘 class8 - Java 陣列資料型態 Array

本章節介紹 Java 中的陣列（Array）資料型態，包含各種型別陣列的宣告、初始化與操作方式，是進行資料集合處理的基礎。

---

#### ✅ 1. 陣列資料型態

Java 陣列支援各種基本型別與物件型別：

```java
int[]      // 整數陣列
long[]     // 長整數陣列
double[]   // 浮點數陣列
boolean[]  // 布林值陣列
char[]     // 字元陣列
String[]   // 字串陣列
```

---

#### ✅ 2. 陣列宣告方式

```java
int[] x;
long[] y;
double[] z;
boolean[] flags;
char[] letters;
String[] names;
```

---

#### ✅ 3. 陣列操作

##### 📌 3.1 陣列初始化

使用 `new` 關鍵字指定長度建立陣列：

```java
int[] x = new int[3];         // 建立 3 個元素的整數陣列
double[] y = new double[10];  // 建立 10 個元素的浮點數陣列

String[] s;
s = new String[5];            // 分開宣告與初始化
```

##### 📌 3.1.1 同時指定內容（靜態初始化）

```java
int[] x = new int[] {2, 8, 5};
```

可省略 `new int[]` 寫成：

```java
int[] x = {2, 8, 5};
```

---

##### 📏 3.2 取得陣列長度

```java
int[] arr = {1, 2, 3};
System.out.println(arr.length);  // 輸出 3
```

---

##### 🎯 3.3 存取陣列中的資料

- 陣列索引從 `0` 開始，到 `長度 - 1`。
- 可用中括號 `[]` 存取或修改陣列中的元素。

```java
int[] x = {10, 20, 30};

System.out.println(x[0]); // 輸出 10

x[2] = 99;
System.out.println(x[2]); // 輸出 99
```

---

#### 💡 小提醒：
- 陣列一旦建立，其大小不可變更。
- 存取超出索引範圍會拋出 `ArrayIndexOutOfBoundsException`。
- 使用 `.length` 是屬性，不是方法，不需加括號。

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class9 Java Class 類別的基礎概念 - Java 入門課程教學](../class9%20Java%20Class%20類別的基礎概念%20-%20Java%20入門課程教學/README.md)