package net.soul.sp.repository;

import net.soul.sp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by sould on 2016-06-02.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findOneByEmail(String email);
}
