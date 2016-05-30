package net.soul.sp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sould on 2016-04-26.
 */

@Controller
public class MainController{

    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    private final String TAG = getClass().getSimpleName();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String createLoginForm(){
        return "login";
    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String createJoinForm(){
        return "join";
    }

    /*
     Pageable pageable = new PageRequest(0,3);
        Page<Member> page = memberService.findAll(pageable);
        log.info("한 페이지당 데이터 수 : "+page.getSize());
        log.info("현재 페이지 : "+page.getNumber());
        log.info("전체 페이지 수 : "+page.getTotalPages());
        log.info("전체 데이터 수 : "+page.getTotalElements());
     */

}
