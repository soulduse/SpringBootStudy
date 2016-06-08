package net.soul.sp.service;

import net.soul.sp.domain.Member;
import net.soul.sp.domain.MemberCreateForm;
import net.soul.sp.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by sould on 2016-06-07.
 */
@Service
public class UserServiceImpl implements MemberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final MemberRepository memberRepository;

    @Autowired
    public UserServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Optional<Member> getUserById(long id) {
        LOGGER.debug("Getting user={}", id);
        return Optional.ofNullable(memberRepository.findOne(id));
    }

    @Override
    public Optional<Member> getUserByEmail(String email) {
        LOGGER.debug("Getting user by email={}", email.replaceFirst("@.*", "@***"));
        return memberRepository.findOneByEmail(email);
    }

    @Override
    public Collection<Member> getAllUsers() {
        LOGGER.debug("Getting all users");
        return memberRepository.findAll(new Sort("email"));
    }

    @Override
    public Member create(MemberCreateForm form) {
        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setPassword(new BCryptPasswordEncoder().encode(form.getPassword()));
        member.setRole(form.getRole());
        return memberRepository.save(member);
    }
}
