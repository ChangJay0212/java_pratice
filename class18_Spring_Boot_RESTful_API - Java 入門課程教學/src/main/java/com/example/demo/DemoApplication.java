package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication 標示這是一個 Spring Boot 應用程式的主類別
@SpringBootApplication
// @RestController 標示這是一個 RESTful 風格的控制器
@RestController
public class DemoApplication {

    // 程式的進入點
    public static void main(String[] args) {
        // 啟動 Spring Boot 應用程式
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * 建立一個簡單的 API Endpoint
     * 透過 GET 請求訪問 /hello 時，會觸發此方法
     * @param name 是一個查詢參數 (Query Parameter)，例如 /hello?name=Gemini
     * @return 回傳一個字串，Spring Boot 會自動轉換成 JSON 格式的回應
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
