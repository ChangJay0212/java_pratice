package com.example.blogsystem;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob // Large Object, for longer text
    @Column(nullable = false)
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();

    // One Post has Many Comments
    // cascade = CascadeType.ALL: Delete comments when post is deleted
    // orphanRemoval = true: Remove comments from DB if they are removed from the list
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference // To handle circular serialization
    private List<Comment> comments = new ArrayList<>();

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }
}
