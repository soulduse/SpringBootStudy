package net.soul.sp.dao;

import net.soul.sp.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by sould on 2016-04-18.
 */
public class MemberDao implements IMemberDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public void saveMember() {
        Member member = new Member();
        member.setId(2);
        member.setEmail("soulduse@naver.com");
        member.setName("sososo");
        member.setRegDate("2016.04.18");
        hibernateTemplate.save(member);
    }
}
