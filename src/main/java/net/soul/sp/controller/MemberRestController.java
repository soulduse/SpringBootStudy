package net.soul.sp.controller;

import net.soul.sp.domain.Member;
import net.soul.sp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sould on 2016-05-18.
 */

@RestController
@RequestMapping("api/members")
public class MemberRestController {
    @Autowired
    MemberService memberService;

//    @RequestMapping(method = RequestMethod.GET)
//    List<Member> getMembers(){
//        List<Member> memberList =
//    }

}
