package org.effective.aop;

import org.effective.aop.Aspect;
import org.effective.aop.ServiceB;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect({ServiceB.class})
public class ExceptionAspect {
    public static void before(Object object, Method method, Object[] args) {
    }

    public static void after(Object obect, Method method, Object[] args, Object result) {
    }
    public static void exception(Object object, Method method, Object[] args, Throwable e) {
        System.out.println("exception when calling " +
                method.getName()+ " with args " + Arrays.toString(args));
    }
}
