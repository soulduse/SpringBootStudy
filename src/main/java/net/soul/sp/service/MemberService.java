package net.soul.sp.service;

import net.soul.sp.domain.Member;
import net.soul.sp.domain.MemberCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by sould on 2016-06-07.
 */
public interface MemberService {
    Optional<Member> getUserById(long id);

    Optional<Member> getUserByEmail(String email);

    Collection<Member> getAllUsers();

    Member create(MemberCreateForm form);
}
