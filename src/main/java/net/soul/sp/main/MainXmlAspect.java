package net.soul.sp.main;

import net.soul.sp.chap07.Exam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sould on 2016-04-08.
 */
public class MainXmlAspect {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("aopPojo.xml");
        Exam exam01 = ctx.getBean("aopTest", Exam.class);
        exam01.print1();
        exam01.print2();
        exam01.print3();

        /*
            pointcut을 등록하고 @Pointcut("execution(public * net.soul.sp.chap07..*(..))")
            공통 @Around 메소드를 실행시키는데 있어서,
            public 메소드가 실행되면 메소드가 실행될때 마다 공통 메소드가 실행되나,
            메소드 안에 메소드를 추가 실행시키는 경우는 두번 공통메소드가 실행되는것이 아니라 한번만 실행된다.
         */
    }
}
