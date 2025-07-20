package com.example.blogsystem;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Many Comments belong to One Post
    @ManyToOne(fetch = FetchType.LAZY) // LAZY: Don't fetch Post unless needed
    @JoinColumn(name = "post_id", nullable = false)
    @JsonBackReference // To handle circular serialization
    private Post post;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public Post getPost() { return post; }
    public void setPost(Post post) { this.post = post; }
}
