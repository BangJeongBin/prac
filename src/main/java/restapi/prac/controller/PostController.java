package restapi.prac.controller;


import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restapi.prac.model.Post;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @GetMapping
    public ResponseEntity<Page<Post>> listPost(@RequestParam(defaultValue = "0") int page,
                                               @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post updatePost) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
       return null;
    }
}
