package com.example.dbdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository 標示這是一個 Spring 的 Repository Bean
// 繼承 JpaRepository<實體類別, 主鍵型態>
// Spring Data JPA 會自動為我們實作這個介面的方法
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 我們甚至不需要寫任何程式碼！
    // JpaRepository 已經提供了 save(), findById(), findAll(), deleteById() 等常用方法。
}
