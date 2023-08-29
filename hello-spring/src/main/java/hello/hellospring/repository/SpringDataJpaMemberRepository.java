package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 인터페이스를 통한 기본적인 CRUD 제공
// 특별한 경우는 너가 작성해야 함
// 페이징 기능 자동 제공
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
