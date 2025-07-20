package com.example.blogsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<Comment> createComment(@PathVariable Long postId, @RequestBody Comment comment) {
        return postRepository.findById(postId).map(post -> {
            comment.setPost(post);
            return ResponseEntity.ok(commentRepository.save(comment));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<Object> deleteComment(@PathVariable Long commentId) {
        return commentRepository.findById(commentId).map(comment -> {
            commentRepository.delete(comment);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
