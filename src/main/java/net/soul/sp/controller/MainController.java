package net.soul.sp.controller;

import net.soul.sp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sould on 2016-04-26.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private MemberRepository memberRepository;
}
