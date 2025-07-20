### 📘 class21 - 部署、Docker 與 Git

當應用程式開發完成後，最終一步是「部署」（Deploy）到伺服器，讓使用者可以真正存取服務。本章節將介紹現代開發中常用的部署工具：**Git（版本控制）** 與 **Docker（容器化）**。

---

#### ✅ 1. Git - 版本控制系統

Git 是目前最流行的分散式版本控制系統，能夠記錄程式變更、協作開發與版本追蹤。

##### 🔑 核心概念

| 名稱        | 說明                                                       |
|-------------|------------------------------------------------------------|
| Repository  | 倉庫，包含所有原始碼與歷史版本紀錄                        |
| Commit      | 一次儲存紀錄（快照）                                      |
| Branch      | 分支，便於開發新功能或修復錯誤而不影響主線                |
| Remote      | 遠端倉庫，如 GitHub、GitLab，便於多人協作與備份           |

##### 💻 常用指令

```bash
git init                # 初始化一個新 Git 倉庫
git add <file>          # 加入變更到暫存區
git commit -m "訊息"     # 提交到本地倉庫
git branch <name>       # 建立新分支
git checkout <name>     # 切換到分支
git push                # 推送到遠端
git pull                # 拉取最新內容
```

---

#### 🐳 2. Docker - 容器化技術

Docker 是一套能「打包應用與環境」的工具，讓程式在任何地方都能一致運行。

##### 🚀 優點

- **環境一致性**：開發、測試、部署環境完全相同
- **可攜性強**：可運行於任意支援 Docker 的平台（本機、雲端、CI/CD）
- **輕量快速**：啟動快、佔用資源低
- **沙盒隔離**：每個容器之間相互獨立

---

#### 🧱 核心名詞

| 名稱         | 說明                                                  |
|--------------|-------------------------------------------------------|
| Dockerfile   | 建立映像檔的指令腳本                                  |
| Image        | 只讀模板，包含程式與執行環境                          |
| Container    | 可執行的實體，每次執行 Image 就會產生一個容器        |

---

#### ⚙️ 3. 將 Spring Boot 應用程式容器化（Docker 化）

##### 步驟 1️⃣：打包應用程式

```bash
mvn package   # 將 Spring Boot 專案打包成 JAR 檔
```

##### 步驟 2️⃣：建立 Dockerfile

```Dockerfile
# Dockerfile
FROM openjdk:11-jre-slim
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

##### 步驟 3️⃣：建立 Image

```bash
docker build -t my-spring-app .
```

##### 步驟 4️⃣：啟動 Container

```bash
docker run -p 8080:8080 my-spring-app
```

瀏覽器開啟 [http://localhost:8080](http://localhost:8080) 可看到服務啟動成功。

---

#### 📂 範例說明

- 本章課程將以 `class18` 中建立的 RESTful API 專案為基礎，示範如何：
  1. 使用 `mvn package` 打包 JAR
  2. 撰寫簡易 Dockerfile
  3. 建立並啟動容器，完成部署流程

---

#### 💡 小提醒

- Docker 可與 CI/CD、Kubernetes 結合實現自動化部署
- Git 是日常開發不可或缺的工具，配合 GitHub 可實現多人協作
- 可進一步學習使用 GitHub Actions + Docker Hub 完成自動部署流程

---

### 📎 More
* [🏠 回主頁](../README.md)
* [⏭️ class22_Project_Todo_App - Java 入門課程教學](../class22_Project_Todo_App%20-%20Java%20入門課程教學/README.md)