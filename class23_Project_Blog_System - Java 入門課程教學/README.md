### 📝 class23 - Blog 系統後端 API 實作專案

本章節進一步實作一個具備「文章 + 留言」關聯關係的 **Blog 系統後端 API**，結合更深入的 JPA 關聯操作與 RESTful API 設計。

---

### 📦 技術棧與進階應用

- **Spring Boot**：專案主體框架
- **Spring Data JPA**：資料持久化與關聯映射
- **H2 Database**：輕量記憶體資料庫
- **RESTful API 設計**
- **JPA 關聯映射**：`@OneToMany`, `@ManyToOne`, `@JoinColumn`, `CascadeType`

---

### 📌 資料模型設計

#### 📰 Post (文章)

| 欄位        | 型別             | 說明         |
|-------------|------------------|--------------|
| `id`        | Long             | 主鍵         |
| `title`     | String           | 標題         |
| `content`   | String           | 內文         |
| `createdAt` | LocalDateTime    | 建立時間     |
| `comments`  | List<Comment>    | 關聯留言     |

#### 💬 Comment (留言)

| 欄位        | 型別             | 說明             |
|-------------|------------------|------------------|
| `id`        | Long             | 主鍵             |
| `content`   | String           | 留言內容         |
| `createdAt` | LocalDateTime    | 留言時間         |
| `post`      | Post             | 所屬文章         |

---

### 🌐 API 規格

#### 📄 Post 文章 API

| Method | Endpoint         | 說明                 |
|--------|------------------|----------------------|
| POST   | `/posts`         | 新增文章             |
| GET    | `/posts`         | 取得所有文章         |
| GET    | `/posts/{id}`    | 取得單篇文章及留言   |
| PUT    | `/posts/{id}`    | 修改文章             |
| DELETE | `/posts/{id}`    | 刪除文章及其留言     |

#### 💬 Comment 留言 API

| Method | Endpoint                         | 說明                   |
|--------|----------------------------------|------------------------|
| POST   | `/posts/{postId}/comments`       | 新增留言               |
| GET    | `/posts/{postId}/comments`       | 取得指定文章的留言列表 |
| DELETE | `/comments/{commentId}`          | 刪除指定留言           |

---

### 🧠 關聯設計細節（JPA）

- `@OneToMany(mappedBy = "post", cascade = CascadeType.ALL)`：Post 擁有多個 Comment，刪除文章時一併刪除留言。
- `@ManyToOne @JoinColumn(name = "post_id")`：Comment 透過外鍵連到 Post。
- 使用 `LocalDateTime.now()` 設定建立時間。
- 本專案未使用 DTO，直接傳回 Entity 資料，適用於教學與快速原型。

---

### 📂 專案結構

```
src
├── main
│   └── java/com/example/blog
│       ├── BlogApplication.java         # 主應用程式
│       ├── model
│       │   ├── Post.java                # 文章實體
│       │   └── Comment.java             # 留言實體
│       ├── repository
│       │   ├── PostRepository.java
│       │   └── CommentRepository.java
│       └── controller
│           ├── PostController.java
│           └── CommentController.java
└── resources
    └── application.properties
```

---

### ⚙️ H2 設定範例

```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.datasource.url=jdbc:h2:mem:blogdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 🚀 執行方式

```bash
mvn spring-boot:run
```

- REST API 測試端點：http://localhost:8080/posts
- H2 資料庫控制台：http://localhost:8080/h2-console  
  JDBC URL 請使用：`jdbc:h2:mem:blogdb`

---

### 🔚 總結

這個專案是 Todo App 的進階版本，涵蓋了：

- 多對一與一對多資料關聯
- RESTful API 深入設計
- 實體之間的級聯刪除
- 關聯式資料模型設計

📦 延伸挑戰建議：
- 加入 DTO 與 Mapper 模組
- 整合驗證邏輯（如 @Valid）
- 加入測試套件與 Swagger API 文件

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class24_Project_Online_Store_API - Java 入門課程教學](../class24_Project_Online_Store_API%20-%20Java%20入門課程教學/README.md)