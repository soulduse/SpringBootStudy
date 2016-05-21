package net.soul.sp.service;

import net.soul.sp.domain.Member;
import net.soul.sp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sould on 2016-04-26.
 */
@Service
@Transactional
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAll(){
        return memberRepository.findAllOrderByName();
    }

    public Member findOne(long id){
        return memberRepository.findOne(id);
    }

    public Member create(Member member){
        return memberRepository.save(member);
    }

    public Member update(Member member){
        return memberRepository.save(member);
    }

    public void delete(long id){
        memberRepository.delete(id);
    }
}