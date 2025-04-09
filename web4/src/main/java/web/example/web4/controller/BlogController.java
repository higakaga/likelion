package web.example.web4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.example.web4.dto.blog.BlogRequestDTO;
import web.example.web4.dto.blog.BlogResponseDTO;
import web.example.web4.service.BlogService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/blogs")
public class BlogController {
    private final BlogService blogService;

    @PostMapping(value = "/post")
    public ResponseEntity<BlogResponseDTO> create(@RequestBody BlogRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(blogService.createBlog(dto));
    }

    @GetMapping
    public ResponseEntity<List<BlogResponseDTO>> readAll() {
        return ResponseEntity.ok(blogService.readBlog());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BlogResponseDTO> readOne(@PathVariable int id) {
        return ResponseEntity.ok(blogService.searchBlog(id));
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<BlogResponseDTO> update(@PathVariable int id, @RequestBody BlogRequestDTO dto) {
        return ResponseEntity.ok(blogService.updateBlog(id, dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        blogService.deleteBlog(id);
        return ResponseEntity.ok("Blog 삭제.");
    }
}
