package net.soul.sp.chap07;

/**
 * Created by sould on 2016-03-30.
 */
public class RecCalculator implements Calculator {

    @Override
    public long factorial(long num) {
        if(num < 1)
            return 1;
        else
            return num * factorial(num-1);

    }
}
