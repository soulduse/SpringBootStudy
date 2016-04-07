package net.soul.sp.config;

import net.soul.sp.aspect.ExeTimeAspect2;
import net.soul.sp.chap07.Calculator;
import net.soul.sp.chap07.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by sould on 2016-04-08.
 */

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public ExeTimeAspect2 exeTimeAspect(){
        return new ExeTimeAspect2();
    }

    @Bean
    public Calculator recCal(){
        return new RecCalculator();
    }

}
