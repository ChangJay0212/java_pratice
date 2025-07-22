### 📘 class18 - Spring Boot RESTful API 開發入門

本章節介紹 Spring Boot 與 RESTful API 的核心概念，學習如何用少量設定快速建立 Web API，是進入 Java 後端開發的重要里程碑。

---

#### ✅ 1. 什麼是 Spring Boot？

Spring Boot 是基於 Spring 框架的快速開發工具，主要特點有：

- **🚀 自動設定（Auto-configuration）**  
  根據加入的相依套件，自動幫你配置常見元件，降低繁瑣設定。

- **📦 內嵌伺服器（Embedded Server）**  
  內建 Tomcat / Jetty / Undertow，無需外部安裝，直接執行 JAR 即可啟動伺服器。

- **🌱 Starters 相依套件**  
  例如：
  - `spring-boot-starter-web`: 包含 Spring MVC、REST、Tomcat 等常用元件
  - `spring-boot-starter-data-jpa`: 資料庫存取

---

#### 🌐 2. RESTful API 是什麼？

REST（Representational State Transfer）是一種 API 設計風格。

- **資源 URI**：  
  每個 API 對應一個「資源」：
  - `/users`：所有使用者
  - `/products/123`：ID 為 123 的產品

- **HTTP 方法對應行為**：
  | 方法     | 行為         |
  |----------|--------------|
  | `GET`    | 讀取         |
  | `POST`   | 建立         |
  | `PUT`    | 更新（整筆） |
  | `PATCH`  | 更新（部分） |
  | `DELETE` | 刪除         |

- **Stateless（無狀態）**：  
  每次請求都需攜帶足夠資訊，伺服器不記住用戶的狀態。

---

#### 🧠 3. 常用 Spring Boot Annotation

| Annotation              | 說明                                                                 |
|-------------------------|----------------------------------------------------------------------|
| `@SpringBootApplication`| 主程式的起點，結合多個核心註解（如 ComponentScan）                  |
| `@RestController`       | 宣告為 REST API 控制器，所有方法預設回傳 JSON                        |
| `@RequestMapping`       | 將 HTTP 請求對應到方法，可指定路徑與方法類型                        |
| `@GetMapping` 等        | `@RequestMapping` 的簡寫版本（語意更清楚）                           |
| `@PathVariable`         | 從 URL 路徑抓取參數（如 `/users/{id}`）                              |
| `@RequestParam`         | 抓取查詢參數（如 `/search?keyword=java`）                            |

---

#### 📂 專案結構範例（Maven）

```
src/
└── main/
    ├── java/
    │   └── com/example/demo/
    │       ├── DemoApplication.java      ← 主程式
    │       └── controller/
    │           └── UserController.java   ← 控制器
    └── resources/
        └── application.properties        ← 設定檔
```

---

#### 🔍 範例程式碼：簡單的 `UserController`

```java
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return "使用者 ID：" + id;
    }

    @GetMapping
    public String searchUser(@RequestParam String keyword) {
        return "搜尋關鍵字：" + keyword;
    }

    @PostMapping
    public String createUser() {
        return "已新增使用者";
    }
}
```

---

#### 💡 小提醒：

- 啟動 Spring Boot 專案只需執行 `main()` 方法，即可開啟內嵌伺服器。
- 所有 REST API 預設皆以 JSON 格式輸出（若使用 `@RestController`）。
- 可透過 Postman 或瀏覽器測試 GET 請求，POST / PUT 建議用 Postman 模擬。

---
#### 👉 Usage
- [Introduce Maven](./MAVEN.md)
```bash
mvn spring-boot:run
```
mvn spring-boot:run 在執行時 會自動編譯你的原始碼並產生 .class 檔案到 target/classes 目錄下，但它不會產生 .jar 檔案（不像 mvn package 那樣）。

以下是它背後的行為：

##### 🔍 mvn spring-boot:run 做了什麼？
編譯：相當於先執行 mvn compile，會把 src/main/java 下的程式碼編譯到 target/classes

執行：啟動 Spring Boot 應用，類似執行 java -cp target/classes com.example.MainClass

不產生 jar：它不會打包成 target/demo-0.0.1-SNAPSHOT.jar

📁 執行完後 target 資料夾會長這樣（常見）
```
target/
├── classes/                  <-- 編譯後的 class 放這
│   └── com/example/App.class
├── generated-sources/
├── test-classes/            <-- 測試用 class
└── ...
```
#### ✅ 若你想要執行 .jar 而不是直接 run：

##### 編譯並打包成 jar
```
mvn clean package
```

##### 執行 jar
```
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class19_Database_Integration - Java 入門課程教學](../class19_Database_Integration%20-%20Java%20入門課程教學/README.md)