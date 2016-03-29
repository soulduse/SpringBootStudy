package net.soul.sp.chap07;

/**
 * Created by sould on 2016-03-28.
 */
public class ImpeCalculator implements Calculator {

    @Override
    public long factorial(long num) {
        long result = 1;
        for(int i=0; i<=num; i++)
        {
            result *= i;
        }
        return result;
    }
}
