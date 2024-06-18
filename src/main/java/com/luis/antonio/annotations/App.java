package com.luis.antonio.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException{
       // new MyClass().myMethod();
        // criar o processador da annotation
        var obj = new MyClass();
        new Processor().process(obj);
    }
}

class Processor {
    public void process(Object obj) throws IllegalAccessException, InvocationTargetException {
       var methods = obj.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(PrintHello.class)) {
                System.out.println("Hello !");
                method.invoke(obj);
                break;
            }
        }
    }
}

class MyClass {
    @PrintHello
    public void myMethod() {
        System.out.println("Method Logic....");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PrintHello {

}