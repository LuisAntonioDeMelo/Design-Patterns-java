package com.luis.antonio.patterns.proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CGLIBproxy { // utiliza classe privada do java

    public static void main(String[] args) {
        GreetingServiceImpl realservice = new GreetingServiceImpl();
        GreetingServiceImpl proxyService = ProxyFactoryCGLIB.createProxy(realservice,GreetingServiceImpl.class);

        System.out.println("Real Service");
        System.out.println(realservice.greet("World"));
        System.out.println("------------------------");
        System.out.println("Proxy");
        System.out.println(proxyService.greet("World"));
    }

}

class GreetingServiceImpl {
    public String greet(String name) {
        return "Hello" + name + "!";
    }
}

class LogginMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Method: " + method.getName() + "is called with args" + (
                args != null ? Arrays.toString(args) : null
        ));
        Object result = method.invoke(o, args);
        System.out.println("Method: " + method.getName() + " return " + result);
        return result;
    }

}


class ProxyFactoryCGLIB {
    public static <T> T createProxy(T proxy, Class<T> superclassType) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(superclassType);
        enhancer.setCallback(new LogginMethodInterceptor());
        return (T) enhancer.create();
    }
}
