package net.soul.sp.domain;

import org.springframework.security.core.authority.AuthorityUtils;


/**
 * Created by sould on 2016-06-08.
 */
public class CurrentMember extends org.springframework.security.core.userdetails.User {

    private Member member;

    public CurrentMember(Member member) {
        super(member.getEmail(), member.getPassword(), AuthorityUtils.createAuthorityList(member.getRole().toString()));
        this.member = member;
    }

    public Member getMember(){
        return member;
    }

    public Long getId(){
        return member.getId();
    }

    public Role getRole(){
        return member.getRole();
    }

    @Override
    public String toString() {
        return "CurrentMember{"+
                "member="+member+
                "}"+super.toString();
    }
}
