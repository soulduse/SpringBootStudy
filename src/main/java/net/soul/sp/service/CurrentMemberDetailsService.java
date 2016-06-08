package net.soul.sp.service;

import net.soul.sp.domain.CurrentMember;
import net.soul.sp.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by sould on 2016-06-08.
 */

@Service
public class CurrentMemberDetailsService implements UserDetailsService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentMemberDetailsService.class);

    @Autowired
    private MemberService memberService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        LOGGER.debug("Authenticating member with email={}", email.replaceFirst("@.*", "@***"));
        Member member = memberService.getUserByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("User with email=%s was not found", email)));
        return new CurrentMember(member);
    }
}
