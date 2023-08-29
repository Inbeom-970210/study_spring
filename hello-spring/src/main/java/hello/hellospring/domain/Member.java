package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // db가 알아서 키값을 생성해주면 IDENTITY라고 한다.
    private Long id;
//    @Column(name = "username")  // db에 있는 username 속성과 매핑된다.
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
