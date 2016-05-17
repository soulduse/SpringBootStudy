package net.soul.sp.controller;

import net.soul.sp.domain.Member;
import net.soul.sp.repository.MemberRepository;
import net.soul.sp.util.Log;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sould on 2016-04-26.
 */

@RestController
public class MainController{

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/add")
    public Member add(Member member){
        DateTime dateTime = new DateTime();

        log.error("soul dateVal : "+dateTime.toDate().toString());
        log.error("soul - error");
        log.info("soul - info");
        log.warn("soul - warm");
        log.debug("soul - debug");
        log.trace("soul - trace");
        member.setRegDate(dateTime);
        Member memberData = memberRepository.save(member);
        Pageable pageable = new PageRequest(0,3);
        Page<Member> page = memberRepository.findAll(pageable);
        log.info("한 페이지당 데이터 수 : "+page.getSize());
        log.info("현재 페이지 : "+page.getNumber());
        log.info("전체 페이지 수 : "+page.getTotalPages());
        log.info("전체 데이터 수 : "+page.getTotalElements());
        return memberData;
    }

    @RequestMapping("/list")
    public List<Member> list(Model model){
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }

    @RequestMapping("/email")
    public List<Member> emailList(Model model){
        List<Member> memberList = memberRepository.findByEmail("soul@gmail.com");
        return memberList;
    }

}
