package net.soul.sp.controller;

import net.soul.sp.domain.Member;
import net.soul.sp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sould on 2016-05-18.
 * update  : 2016-05-24
 * comment : getMembers, getMember (복수 / 단일) 멤버찾는 메소드 추가
 */

@RestController
// REST웹 서비스에 접속하기 위한 경로를 @RequestMapping 애너테이션 지정.
@RequestMapping("api/members")
public class MemberRestController {
    @Autowired
    MemberService memberService;

    // @RequestMapping("api/members")의 GET으로 접속시 메서드 실행 됨.
    @RequestMapping(method = RequestMethod.GET)
    List<Member> getMembers(){
        List<Member> memberList = memberService.findAll();
        // 반환 값은 JSON 형식으로 직렬화 되어 HTTP 응답 내용 안에 설정.
        return memberList;
    }

    // "api/members/idx" 에 해당하는 정수 경로에 GET으로 접속시 메소드 실행.
    @RequestMapping(value = "{idx}", method = RequestMethod.GET)    //
    Member getMember(@PathVariable Long idx){
        Member member = memberService.findOne(idx);
        return member;
    }

}
