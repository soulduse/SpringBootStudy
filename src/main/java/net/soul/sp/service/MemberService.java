package net.soul.sp.service;

import net.soul.sp.domain.Member;
import net.soul.sp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sould on 2016-04-26.
 * update  : 2016-05-24
 * comment : ID의 존재 여부체크 하는 로직 추가 필요.
 */
@Service
@Transactional
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAll(){
        return memberRepository.findAllOrderByName();
    }

    public Member findOne(long idx){
        return memberRepository.findOne(idx);
    }

    public Member create(Member member){
        return memberRepository.save(member);
    }

    public Member update(Member member){
        return memberRepository.save(member);
    }

    public boolean delete(long idx){
        memberRepository.delete(idx);
        return !memberRepository.exists(idx);
    }
}
