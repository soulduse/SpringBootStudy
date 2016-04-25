package net.soul.sp.repository;

import net.soul.sp.domain.Member;
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
        hibernateTemplate.save(member);
    }
}
