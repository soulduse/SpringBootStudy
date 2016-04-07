package net.soul.sp.chap07;

/**
 * Created by sould on 2016-04-08.
 */
public class Exam {

    public void print1() {
        System.out.println("print01 - pointcut이 출력되겟나?");
        print2();
    }

    public void print2() {
        System.out.println("print02 - pointcut이 출력되겟나?");
    }

    public void print3() {
        System.out.println("print03 - pointcut이 출력되겟나?");
        print4();
    }

    private void print4() {
        System.out.println("print04 - pointcut이 출력되겟나?");
    }

}
