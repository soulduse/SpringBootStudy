package net.soul.sp.repository;

import net.soul.sp.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by sould on 2016-04-26.
 */
public interface MemberRepository extends JpaRepository<Member, Integer>{
}
