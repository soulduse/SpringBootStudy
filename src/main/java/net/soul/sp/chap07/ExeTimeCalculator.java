package net.soul.sp.chap07;

/**
 * Created by sould on 2016-03-28.
 */
public class ExeTimeCalculator implements Calculator{

    private Calculator delegate;

    public ExeTimeCalculator(Calculator delegate){
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long result = delegate.factorial(num);
        long end = System.nanoTime();
        System.out.printf("%s.factorial(%d) 실행시간 = %d\n",
                delegate.getClass().getSimpleName(),
                num,(end - start));
        System.out.println("ggg");
        return result;
    }
}
