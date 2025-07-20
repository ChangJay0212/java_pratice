### 🛒 class24 - 線上商店後端 API 實作專案

本章節是課程最終專案，實作一套具備產品與訂單管理功能的線上商店後端系統。此專案特別聚焦於「多對多關聯」的實作與交易邏輯處理，模擬真實世界的商業邏輯。

---

### 📦 技術棧與應用

- **Spring Boot**：後端應用框架
- **Spring Data JPA**：資料持久層操作
- **H2 Database**：記憶體資料庫
- **RESTful API**：後端接口設計
- **JPA 多對多關聯**：透過中介實體（OrderItem）處理
- **@Transactional**：交易控制，確保資料一致性

---

### 📌 資料模型設計

#### 📦 Product (產品)

| 欄位   | 型別   | 說明     |
|--------|--------|----------|
| `id`   | Long   | 主鍵     |
| `name` | String | 產品名稱 |
| `price`| double | 單價     |

#### 📄 Order (訂單)

| 欄位          | 型別             | 說明         |
|---------------|------------------|--------------|
| `id`          | Long             | 主鍵         |
| `customerName`| String           | 顧客名稱     |
| `orderDate`   | LocalDateTime    | 下單時間     |
| `totalAmount` | double           | 訂單總金額   |
| `items`       | List<OrderItem>  | 訂單項目清單 |

#### 🧾 OrderItem (訂單項目)

| 欄位       | 型別     | 說明             |
|------------|----------|------------------|
| `id`       | Long     | 主鍵             |
| `order`    | Order    | 所屬訂單         |
| `product`  | Product  | 購買產品         |
| `quantity` | int      | 數量             |
| `price`    | double   | 單價（下單時）   |

---

### 🌐 API 規格

#### 📦 產品 API

| Method | Endpoint     | 說明     |
|--------|--------------|----------|
| POST   | `/products`  | 新增產品 |
| GET    | `/products`  | 取得全部產品 |

#### 🧾 訂單 API

| Method | Endpoint        | 說明                             |
|--------|-----------------|----------------------------------|
| POST   | `/orders`       | 建立訂單，計算總金額並寫入項目 |
| GET    | `/orders`       | 取得所有訂單                    |
| GET    | `/orders/{id}`  | 取得單筆訂單（含詳細項目與產品）|

✅ `POST /orders` 範例：

```json
{
  "customerName": "Jay",
  "items": [
    { "productId": 1, "quantity": 2 },
    { "productId": 3, "quantity": 1 }
  ]
}
```

---

### ⚙️ 關聯與邏輯實作重點

- **中介關聯實體 OrderItem**：將 Product 與 Order 的多對多關係拆解為兩個一對多。
- **資料一致性管理**：使用 `@Transactional` 確保建立訂單過程的原子性。
- **商業邏輯放置於 Controller（簡化版）**：實務上應拆分為 `OrderService` 處理業務邏輯。

---

### 📂 專案結構（簡化）

```
src
├── main/java/com/example/store
│   ├── StoreApplication.java         # 主程式
│   ├── model
│   │   ├── Product.java
│   │   ├── Order.java
│   │   └── OrderItem.java
│   ├── repository
│   │   ├── ProductRepository.java
│   │   ├── OrderRepository.java
│   │   └── OrderItemRepository.java
│   └── controller
│       ├── ProductController.java
│       └── OrderController.java
└── resources/application.properties
```

---

### 🚀 執行與測試

```bash
mvn spring-boot:run
```

- 測試端點：http://localhost:8080/products, /orders
- H2 控制台：http://localhost:8080/h2-console  
  JDBC URL：`jdbc:h2:mem:storedb`

---

### 🔚 專案總結

這個專案完整涵蓋以下實務面主題：

- 多對多關聯拆解技巧
- RESTful 設計與交易處理
- 價格快照保存邏輯（OrderItem 的單價）
- 簡化商業邏輯整合與資料一致性處理

📌 延伸挑戰建議：
- 加入庫存管理邏輯與驗證機制
- 導入 Service Layer 重構 Controller
- 撰寫單元測試與異常處理模組
### 📎 More
* [🏠 回主頁](../README.md)