package net.soul.sp.main;

import net.soul.sp.chap07.Calculator;
import net.soul.sp.chap07.Exam;
import net.soul.sp.chap07.ImpeCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/**
 * Created by sould on 2016-04-01.
 */
public class MainXmlPojo {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("aopPojo.xml");

//        Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
        ImpeCalculator impeCal = ctx.getBean("impeCal", ImpeCalculator.class);
        long fiveFact1 = impeCal.factorial(5);
        System.out.println("impeCal.factorial(5) = "+fiveFact1);

        Calculator recCal = ctx.getBean("recCal", Calculator.class);
        long fiveFact2 = recCal.factorial(5);
        System.out.println("recCal.factorial(5) = "+fiveFact2);
    }


}
