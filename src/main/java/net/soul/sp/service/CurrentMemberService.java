package net.soul.sp.service;

import net.soul.sp.domain.CurrentMember;

/**
 * Created by sould on 2016-06-08.
 */
public interface CurrentMemberService {
    boolean canAccessMember(CurrentMember currentMember, Long memberId);
}
