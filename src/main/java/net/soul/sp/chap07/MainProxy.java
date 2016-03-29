package net.soul.sp.chap07;

/**
 * Created by sould on 2016-03-28.
 *
 * 프록시란? : 핵심 기능의 실행은 다른 객체에 위임하고 부가적인 기능을 제공하는 객체 (proxy)
 *    - 실제 핵심 기능을 실행하는 객체 -> 대상객체
 *      (ImpeCalculator, RecCalculator 객체 : 대상객체)
 *
 *    - 특징 : 핵심 기능은 구현하지 않음. 대신 여러 객체에 공통으로 적용될 수 있는 기능 구현.
 *      (ExeTimeCalculator)
 *
 * AOP의 핵심 : 공통기능 구현과 핵심기능 구현을 분리하는것.
 */
public class MainProxy {

    public static void main(String[] args) {
        ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
        System.out.println(ttCal1.factorial(20));

        System.out.println("---------------------------------------------");

        ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
        System.out.println(ttCal2.factorial(20));
    }
}
