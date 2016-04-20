package net.soul.sp.dao;

import net.soul.sp.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sould on 2016-04-18.
 */
@Transactional(readOnly = false)
public class MemberDao implements IMemberDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public void saveMember() {
        Member member = new Member();
        member.setId(2);
        member.setEmail("soulduse@naver.com");
        member.setPassword("1234");
        member.setName("sososo");
        member.setRegDate("2016.04.18");
        hibernateTemplate.save(member);
    }
}
