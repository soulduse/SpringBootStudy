package net.soul.sp.service;

import net.soul.sp.domain.CurrentMember;
import net.soul.sp.domain.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sould on 2016-06-08.
 */
@Service
@Transactional
public class CurrentMemberServiceImpl implements CurrentMemberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentMemberServiceImpl.class);

    @Override
    public boolean canAccessMember(CurrentMember currentMember, Long memberId) {
        LOGGER.debug("Checking if user={} has access to user={}", currentMember, memberId);
        return currentMember != null && (currentMember.getRole() == Role.ADMIN || currentMember.getId().equals(memberId));
    }
}
