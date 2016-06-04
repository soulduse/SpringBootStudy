package net.soul.sp.repository;

import net.soul.sp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sould on 2016-06-02.
 */
public interface UserRepository extends JpaRepository<User, String>{
}
