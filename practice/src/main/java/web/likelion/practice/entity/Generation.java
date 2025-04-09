package web.likelion.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Generation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Generation(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Generation() {

    }

    public void update(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
