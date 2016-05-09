package net.soul.sp.controller;

import net.soul.sp.domain.Member;
import net.soul.sp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sould on 2016-04-26.
 */

@RestController
public class MainController{

    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/add")
    public Member add(Member member){
        Member memberData = memberRepository.save(member);
        return memberData;
    }

    @RequestMapping("/list")
    public List<Member> list(Model model){
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }

}
