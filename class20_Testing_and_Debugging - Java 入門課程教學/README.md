### 📘 class20 - Java 測試與除錯（Testing and Debugging）

本章節介紹 Java 開發中不可或缺的測試與除錯機制，包括如何使用 JUnit 撰寫單元測試、整合測試，以及利用日誌與除錯器進行問題追蹤。

---

#### ✅ 1. 測試（Testing）

##### 🔬 單元測試（Unit Testing）

- **定義**：針對最小的邏輯單元（方法、類別）驗證其功能是否正確。
- **工具**：使用 JUnit 框架。
- **常用 Annotation**：
  | Annotation     | 說明                                       |
  |----------------|--------------------------------------------|
  | `@Test`        | 標示為測試方法                              |
  | `@BeforeEach`  | 每次測試執行前執行                          |
  | `@AfterEach`   | 每次測試執行後執行                          |
  | `@BeforeAll`   | 所有測試執行前執行一次（必須是 static）     |
  | `@AfterAll`    | 所有測試執行後執行一次（必須是 static）     |

- **斷言方法（Assertions）**：
  ```java
  assertEquals(expected, actual);
  assertTrue(condition);
  assertNotNull(obj);
  ```

##### 🤝 整合測試（Integration Testing）

- 測試 Controller、Service、Repository 是否正確協作。
- 使用 `@SpringBootTest` 啟動整個 Spring 應用程式。
- 可搭配 `MockMvc` 模擬 HTTP 請求，測試 API 回應。

---

#### 🐞 2. 除錯（Debugging）

##### 📋 日誌（Logging）

- 使用 `SLF4J` 搭配 `Logback` 或 `Log4j2`，更彈性控制日誌輸出。
- 可設定不同等級：
  - `TRACE`, `DEBUG`, `INFO`, `WARN`, `ERROR`
- 相較於 `System.out.println()`，更適合用於正式環境。

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

Logger log = LoggerFactory.getLogger(MyClass.class);
log.info("用戶 ID: {}", userId);
```

---

##### 🛠️ 除錯器（IDE Debugger）

功能包含：

| 功能         | 說明                                       |
|--------------|--------------------------------------------|
| `Breakpoint` | 中斷點：程式會在此處暫停                     |
| `Step Over`  | 執行目前行，跳過方法內部                     |
| `Step Into`  | 進入方法內部查看執行細節                     |
| `Step Out`   | 跳出目前方法，回到上一層呼叫                 |
| `Resume`     | 繼續執行至下一個中斷點或結束程式             |

> 💡 Eclipse、IntelliJ IDEA、VS Code 等 IDE 都內建強大的除錯工具。

---

#### 🧪 範例說明（基於 class19 專案）

- 測試目錄結構位於：`src/test/java`
- 將為 `UserController` 撰寫：
  - 單元測試：驗證 Repository / Service 方法邏輯
  - 整合測試：使用 `@SpringBootTest` 測試整個 API 行為

---

#### 💡 小提醒：

- 測試可大幅減少回歸錯誤，提升專案品質與信心
- 除錯時請善用 IDE 的視覺化工具，不必大量 `println`
- 使用日誌記錄，讓除錯與診斷更有依據與層次

---
### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class21_Deployment_Docker_Git - Java 入門課程教學](../class21_Deployment_Docker_Git%20-%20Java%20入門課程教學/README.md)