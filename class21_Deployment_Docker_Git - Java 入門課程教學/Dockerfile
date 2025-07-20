# 使用一個輕量級的 Java 11 JRE 作為基礎映像
FROM openjdk:11-jre-slim

# 將打包好的 JAR 檔複製到容器的根目錄下，並重新命名為 app.jar
# ARG 指令可以用來傳遞建構時的參數，這裡我們預設 JAR 的路徑
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 聲明容器對外暴露的連接埠號
EXPOSE 8080

# 容器啟動時要執行的指令
# java -jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
