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
 *
 * @Service
 * => <cotext:component-scan>에 의해 스프링 빈으로 등록된다.
 *
 * @Transactional
 * => 외부에서 이 클래스의 메소드를 호출할 때 트랜잭션을 시작하고 메소드를 종료할 때 트랜잭션을 커밋한다.
 *      만약 예외가 발생시 트랜잭션을 롤백한다.
 */
@Service
@Transactional
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Long join(Member member){
        validateDuplicateMember(member);    // 이메일이 존재하는지 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member){
        List<Member> findMembers =
                memberRepository.findByEmail(member.getEmail());
        if(findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

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
