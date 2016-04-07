package net.soul.sp.main;

import net.soul.sp.chap07.Calculator;
import net.soul.sp.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sould on 2016-04-08.
 */
public class MaInJavaAspect {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        Calculator reCal = ctx.getBean("recCal", Calculator.class);
        long fiveFact = reCal.factorial(5);
        System.out.println("reCal.factorial()5) = "+fiveFact);
    }
}
