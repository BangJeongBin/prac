package restapi.prac.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 Auto Increment 사용 시 명시해 주어야 함
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


//    public Post(String title, String content) { 오류 발생 시 주석 해제
//        this.title = title;
//        this.content = content;
//    }
}
