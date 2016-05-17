package net.soul.sp.util;

/**
 * Created by sould on 2016-05-18.
 */
public class Log {

    public static String getTag(Class<?> className){
        return className.getSimpleName();
    }

}
