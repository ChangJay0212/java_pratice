### 📘 class19 - Spring Boot 資料庫整合：JPA + H2

本章節介紹如何使用 Spring Boot 整合 JPA 與內建的 H2 記憶體資料庫，建立一套簡單、快速可用的資料存取流程，涵蓋 Entity、Repository 與資料持久化的實作方式。

---

#### ✅ 1. 什麼是 JPA？

JPA（Java Persistence API）是 Java 官方定義的 ORM 標準，讓你透過「物件操作」來對應與操作資料庫資料。

Spring Boot 整合 JPA 的實作稱為 **Spring Data JPA**，具備以下優點：

- 自動實作 CRUD 操作，開發者只需定義介面
- 支援「方法命名自動查詢」，如 `findByEmail()` 自動產生 SQL
- 可自由擴充為自訂查詢（JPQL / Native SQL）

---

#### 🧩 2. Repository 是什麼？

在 Spring Data JPA 中，你只需：

```java
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
```

就能獲得完整的查詢、新增、刪除、更新功能，無需寫 SQL！

---

#### 🧪 3. H2 資料庫是什麼？

| 特性           | 說明                                      |
|----------------|-------------------------------------------|
| 記憶體運作     | 所有資料儲存在 RAM 中，速度極快              |
| 無需安裝       | 不需要額外伺服器，開箱即用                  |
| 適合測試環境   | 常用於本地開發、單元測試                    |
| H2 Console     | 可視化管理 UI，透過瀏覽器即時查詢資料        |

---

#### 🔧 4. 整合步驟

##### 步驟 1️⃣：加入相依套件（pom.xml）

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>
```

---

##### 步驟 2️⃣：設定 `application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

##### 步驟 3️⃣：建立 Entity 類別

```java
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    // getter / setter
}
```

---

##### 步驟 4️⃣：建立 Repository 介面

```java
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
```

---

##### 步驟 5️⃣：在 Controller 中注入 Repository

```java
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepo.findById(id).orElse(null);
    }
}
```

---

#### 📁 專案結構（延續 class18）

```
src/
└── main/
    ├── java/com/example/demo/
    │   ├── DemoApplication.java
    │   ├── model/User.java
    │   ├── repository/UserRepository.java
    │   └── controller/UserController.java
    └── resources/application.properties
```

---

#### 💡 小提醒：

- 可從 `http://localhost:8080/h2-console` 存取 H2 UI（登入用 `jdbc:h2:mem:testdb`）
- `@GeneratedValue` 會自動產生主鍵
- `JpaRepository` 支援自動分頁、排序、自訂查詢等功能

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class20_Testing_and_Debugging - Java 入門課程教學](../class20_Testing_and_Debugging%20-%20Java%20入門課程教學/README.md)