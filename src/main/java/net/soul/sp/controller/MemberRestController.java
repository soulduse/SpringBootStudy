package net.soul.sp.controller;

import net.soul.sp.domain.Member;
import net.soul.sp.service.MemberService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    // 신규 사용자 등록
    @RequestMapping(method = RequestMethod.POST)
    // API 정상 동작시 201, 아니면 200 OK 반환
    @ResponseStatus(HttpStatus.CREATED)
    Member postMember(@RequestBody Member member){
        DateTime dateTime = new DateTime();
        member.setRegDate(dateTime);
        member.setUpdDate(dateTime);
        return memberService.create(member);
    }

    // 사용자 한명의 정보 업데이트
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    Member putMember(@PathVariable Long idx, @RequestBody Member member){
        DateTime dateTime = new DateTime();
        member.setUpdDate(dateTime);
        member.setIdx(idx);
        return memberService.update(member);
    }

    // 사용자 한명의 정보 삭제
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    // 204 NO_CONTENT 반환
    @ResponseStatus(HttpStatus.NO_CONTENT)
    boolean deleteMember(@PathVariable Long idx){
        return memberService.delete(idx);
    }

}
