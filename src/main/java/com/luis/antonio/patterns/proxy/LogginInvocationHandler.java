package com.luis.antonio.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogginInvocationHandler implements InvocationHandler {

    private final Object target;

    public <T> LogginInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method: " + method.getName() + "is called with args" + (
                args != null ? Arrays.toString(args) : null
        ));
        Object result = method.invoke(target, args);
        System.out.println("Method: " + method.getName() + " return " + result);
        return result;
    }
}
