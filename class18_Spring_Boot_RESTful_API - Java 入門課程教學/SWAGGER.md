
# ✅ 如何在 Spring Boot 中整合 Swagger（Springfox）

這份指南將教你如何在 Spring Boot 專案中加入 Swagger，產生互動式 API 文件。

---

## 🧱 1. 加入 Maven 依賴

在 `pom.xml` 中的 `<dependencies>` 區段加入以下依賴（Springfox 3.x 版本）：

```xml
<!-- Springfox Swagger -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```
---
## 🚀 2. 啟動專案並瀏覽 Swagger UI

執行專案後，開啟瀏覽器前往：

```
http://localhost:8080/swagger-ui/
```

或是：

```
http://localhost:8080/swagger-ui/index.html
```

> 若你有變更 port，請對應調整。

---

## 🧪 3. 可選 - 關閉測試用 Swagger 的 endpoint 暴露於正式環境

你可以透過 `application.properties` 控制是否啟用 Swagger：

```properties
springfox.documentation.enabled=true
```

然後依據 `@Profile("dev")` 或環境參數切換是否載入 `SwaggerConfig`。

---

## 📌 備註

- Spring Boot 3.x **不支援** Springfox，請使用 Springdoc OpenAPI。
- 本教學適用於 Spring Boot **2.x（例如 2.7.5）**。

---
```
