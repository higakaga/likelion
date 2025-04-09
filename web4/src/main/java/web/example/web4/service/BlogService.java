package web.example.web4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.example.web4.domain.Blog;
import web.example.web4.dto.blog.BlogRequestDTO;
import web.example.web4.dto.blog.BlogResponseDTO;
import web.example.web4.repository.BlogRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;

    private void setEntityFromDTO(Blog blog, BlogRequestDTO dto) {
        blog.update(
                blog.getId(), dto.getTitle(), dto.getSubhead(), dto.getText(), dto.getCoverUrl(),
                dto.getCreatedDate(), dto.isMonthlyBest(), dto.getBlogUrl(), dto.getAuthor(),
                dto.getGeneration(), dto.getTechStack(), dto.getActivityType(), dto.getLikes()
        );
    }

    private BlogResponseDTO toResponseDTO(Blog blog) {
        return new BlogResponseDTO(
                blog.getId(), blog.getTitle(), blog.getSubhead(), blog.getText(), blog.getCoverUrl(),
                blog.getCreatedDate(), blog.isMonthlyBest(), blog.getBlogUrl(), blog.getAuthor(),
                blog.getGeneration(), blog.getTechStack(), blog.getActivityType(), blog.getLikes()
        );
    }

    public BlogResponseDTO createBlog(BlogRequestDTO dto) {
        Blog blog = new Blog();
        setEntityFromDTO(blog, dto);
        Blog saved = blogRepository.save(blog);
        return toResponseDTO(saved);
    }

    public List<BlogResponseDTO> readBlog() {
        return blogRepository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

    public BlogResponseDTO searchBlog(int id) {
        Blog blog = blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found with id: " + id));
        return toResponseDTO(blog);
    }

    public BlogResponseDTO updateBlog(int id, BlogRequestDTO dto) {
        Blog blog = blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found with id: " + id));
        setEntityFromDTO(blog, dto);
        Blog updated = blogRepository.save(blog);
        return toResponseDTO(updated);
    }

    public void deleteBlog(int id) {
        if (!blogRepository.existsById(id)) {
            throw new RuntimeException("Blog not found with id: " + id);
        }
        blogRepository.deleteById(id);
    }

}
