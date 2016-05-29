package net.soul.sp.controller;

import net.soul.sp.domain.JoinForm;
import net.soul.sp.domain.Member;
import net.soul.sp.service.MemberService;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sould on 2016-04-26.
 */

@Controller
public class MainController{

    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    private final String TAG = getClass().getSimpleName();

    @Autowired
    MemberService memberService;


//    @RequestMapping("/member/add")
//    public Member add(Member member){
//        DateTime dateTime = new DateTime();
//        member.setRegDate(dateTime);
//        member.setUpdDate(dateTime);
//        memberService.create()
//        Member memberData = memberService.save(member);
//        return memberData;
//    }
//
//    @RequestMapping("/list")
//    public List<Member> list(Model model){
//        List<Member> memberList = memberService.findAll();
//        return memberList;
//    }
//
//    @RequestMapping("/email")
//    public List<Member> emailList(Model model){
//        List<Member> memberList = memberService.findByEmail("soul@gmail.com");
//        return memberList;
//    }


    /*

     Pageable pageable = new PageRequest(0,3);
        Page<Member> page = memberService.findAll(pageable);
        log.info("한 페이지당 데이터 수 : "+page.getSize());
        log.info("현재 페이지 : "+page.getNumber());
        log.info("전체 페이지 수 : "+page.getTotalPages());
        log.info("전체 데이터 수 : "+page.getTotalElements());
     */

}
