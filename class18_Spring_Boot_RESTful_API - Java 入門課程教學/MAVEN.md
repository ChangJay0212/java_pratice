# ☕ Maven 與 pom.xml 使用說明

## 📦 什麼是 Maven？

[Maven](https://maven.apache.org/) 是一套用於 **Java 專案建置、自動化、依賴管理** 的工具，支援：
- 管理第三方套件（自動下載）
- 編譯 Java 程式碼
- 測試與打包 JAR
- 管理專案版本與模組依賴

---

## 🧾 pom.xml 是什麼？

`pom.xml`（Project Object Model）是 Maven 專案的核心設定檔，用來描述：
- 專案資訊（名稱、版本等）
- 依賴套件（dependencies）
- 建置方式（build）
- 套件倉庫（repositories）
- 外掛與執行命令（plugins）

---

## 🧱 pom.xml 基本架構

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                             https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>        <!-- 套件群組 -->
  <artifactId>my-app</artifactId>       <!-- 專案名稱 -->
  <version>1.0.0</version>              <!-- 專案版本 -->
  <packaging>jar</packaging>           <!-- 打包類型（jar/war） -->

  <dependencies>                        <!-- 依賴項目 -->
    <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.10.1</version>
    </dependency>
  </dependencies>

</project>
```
## ⚙️ 如何使用 Maven
  1️⃣ 安裝 Maven
  可透過以下方式安裝：

  Windows：使用 Chocolatey 安裝 maven

  macOS：brew install maven

  Ubuntu/Debian：sudo apt install maven

  確認是否成功安裝：
  ```bash
    mvn -v
  ```
  2️⃣ 常用指令
指令	說明
mvn compile	編譯專案
mvn test	執行單元測試
mvn package	打包 JAR 或 WAR 檔
mvn clean	清除 /target 產物資料夾
mvn install	安裝到本地 Maven 倉庫
mvn dependency:tree	查看依賴關係樹

3️⃣ 建立新 Maven 專案
```bash
  mvn archetype:generate -DgroupId=com.example \
  -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false

```
結構會像這樣：
```swift
my-app/
├── pom.xml
└── src/
    ├── main/java/com/example/App.java
    └── test/java/com/example/AppTest.java

```
## 🏁 執行專案
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.App"

```
需要在 pom.xml 中加入 exec-maven-plugin 才能用 exec:java 執行。

## 📝 小結
Maven 幫助 Java 專案自動化地進行建置與依賴管理，適合多人開發與長期維護的專案。透過 pom.xml 你可以清楚描述專案的模組化與建構流程，是 Java 生態中不可或缺的工具之一。

### 📎 More
* [🏠 回主頁](../README.md)
* [🔙 Back class18_Spring_Boot_RESTful_API - Java 入門課程教學](./README.md)
* [⏭️ class19_Database_Integration - Java 入門課程教學](../class19_Database_Integration%20-%20Java%20入門課程教學/README.md)