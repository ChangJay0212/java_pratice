### 🛠️ class22 - Todo App 後端實作專案

本章節為期末專案，整合前面學過的 Spring Boot 知識，實作一個完整的 **Todo 清單後端 RESTful API**，並使用 H2 作為開發用記憶體資料庫。

---

### 📦 技術棧

- **Spring Boot**：應用程式核心框架
- **Spring Data JPA**：ORM 與資料存取層封裝
- **H2 Database**：開發用輕量資料庫
- **Maven**：相依套件與建構管理
- **RESTful API**：標準化的 API 設計

---

### 📌 資料模型設計

每筆待辦事項 (Todo) 包含欄位：

| 欄位       | 型別     | 說明             |
|------------|----------|------------------|
| `id`       | Long     | 自動產生的主鍵   |
| `title`    | String   | 待辦事項標題     |
| `completed`| boolean  | 是否完成         |

---

### 🌐 API 規格

| Method | Endpoint        | 說明                           | Request Body                     | Response                          |
|--------|------------------|--------------------------------|----------------------------------|-----------------------------------|
| POST   | `/todos`         | 新增待辦事項                   | `{ "title": "新的待辦事項" }`    | 新增後的 Todo 物件               |
| GET    | `/todos`         | 取得所有待辦事項               | 無                               | `[ { "id": ..., "title": ..., "completed": ... }, ... ]` |
| GET    | `/todos/{id}`    | 取得特定 ID 的待辦事項         | 無                               | 對應的 Todo 物件或 404            |
| PUT    | `/todos/{id}`    | 更新指定待辦事項               | `{ "title": "...", "completed": true }` | 更新後的 Todo 物件        |
| DELETE | `/todos/{id}`    | 刪除指定待辦事項               | 無                               | 200 OK                            |

---

### 📂 專案檔案結構

```
src
├── main
│   └── java/com/example/todo
│       ├── TodoApplication.java     # Spring Boot 主應用
│       ├── model
│       │   └── Todo.java            # Entity 類別
│       ├── repository
│       │   └── TodoRepository.java  # JPA Repository
│       └── controller
│           └── TodoController.java  # RESTful Controller
└── resources
    └── application.properties       # H2 與 JPA 設定
```

---

### ⚙️ `application.properties` 設定範例

```properties
# 啟用 H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# 使用 H2 資料庫 (記憶體模式)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# 自動建立資料表
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 🚀 執行方式

```bash
mvn spring-boot:run
```

開啟瀏覽器進入：

- `http://localhost:8080/todos`：測試 REST API
- `http://localhost:8080/h2-console`：進入 H2 Console，JDBC URL 使用 `jdbc:h2:mem:testdb`

---

### 🔚 總結

這個迷你專案整合了：

- Spring Boot 專案結構設計
- JPA 與資料庫整合實作
- RESTful API 規範
- H2 開發用資料庫
- Maven 管理

是一個「麻雀雖小，五臟俱全」的後端範例，適合作為學習完本系列後的實戰練習。

📦 推薦延伸挑戰：加入驗證功能（Spring Security）、前端串接（React/Vue）、部署至 Docker。

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class23_Project_Blog_System - Java 入門課程教學](../class23_Project_Blog_System%20-%20Java%20入門課程教學/README.md)