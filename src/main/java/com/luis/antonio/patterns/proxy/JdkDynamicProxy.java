package com.luis.antonio.patterns.proxy;

import java.lang.reflect.Proxy;

public class JdkDynamicProxy {
    public static void main(String[] args) {
        GreetingService realservice = new EnglishGreetingService();
        GreetingService proxyService = ProxyFactoryJdk.createProxy(realservice,GreetingService.class);

        System.out.println("Real Service");
        System.out.println(realservice.greet("World"));
        System.out.println("------------------------");
        System.out.println("Proxy");
        System.out.println(proxyService.greet("World"));
    }
}


interface GreetingService {
    String greet(String name);
}

class EnglishGreetingService implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello," + name + "!";
    }
}

//generics
class ProxyFactoryJdk {
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LogginInvocationHandler(target)
        );
    }
}