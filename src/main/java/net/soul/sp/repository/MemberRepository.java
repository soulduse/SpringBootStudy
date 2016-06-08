package net.soul.sp.repository;

import net.soul.sp.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by sould on 2016-04-26.
 * Repository -> DB 연결을 담당하는 객체
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByName(String name);

    //@Query(value = "SELECT x FROM Member x where x.email=:email")
    List<Member> findByEmail(String email);

    List<Member> findByEmailAndPassword(String email, String password);

    @Query("SELECT x FROM Member x ORDER BY x.name")
    List<Member> findAllOrderByName();

    Optional<Member> findOneByEmail(String email);

}
