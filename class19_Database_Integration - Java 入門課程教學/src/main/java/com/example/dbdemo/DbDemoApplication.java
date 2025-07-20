package com.example.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/users") // 將這個 Controller 對應到 /users 路徑下
public class DbDemoApplication {

    // 使用 @Autowired 自動注入 UserRepository 的實例
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DbDemoApplication.class, args);
    }

    // --- API Endpoints ---

    // POST /users: 新增一個使用者
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // GET /users: 取得所有使用者
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // GET /users/{id}: 根據 ID 取得特定使用者
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    // PUT /users/{id}: 更新特定使用者
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    // DELETE /users/{id}: 刪除特定使用者
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
