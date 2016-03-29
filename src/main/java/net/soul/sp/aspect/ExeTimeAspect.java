package net.soul.sp.aspect;

/**
 * Created by sould on 2016-03-30.
 */
public class ExeTimeAspect {


    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.nanoTime();
        try{
            Object result = joinPoint.proceed
        }
    }
}
