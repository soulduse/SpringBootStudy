package net.soul.sp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.security.Signature;
import java.util.Arrays;

/**
 * Created by sould on 2016-03-30.
 */
public class ExeTimeAspect {

    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.nanoTime();
        try{
            Object result = joinPoint.proceed();
            return result;
        }finally {
            long finish = System.nanoTime();
            org.aspectj.lang.Signature sig = joinPoint.getSignature();
            System.out.printf("%s.%s(%s) 실행 시간 : %d ns\n",
                    joinPoint.getTarget().getClass().getSimpleName(),
                    sig.getName(), Arrays.toString(joinPoint.getArgs()),
                    (finish-start));
        }
    }
}
