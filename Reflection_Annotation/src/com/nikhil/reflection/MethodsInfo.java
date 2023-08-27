package com.nikhil.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodsInfo {
    public static void main(String[] args){
        Class c= Employee.class;
        //get public methods from Employee and its superclass
        Method[] methods= c.getMethods();
        printMethodsInfo(methods);
        System.out.println("*****************************************************************");
        //get methods from Employee
        Method[] methodsm = c.getDeclaredMethods();
        printMethodsInfo(methodsm);

    }

    private static void printMethodsInfo(Method[] methods){
        for(Method m:methods){
            System.out.println("Method name - "+m.getName());
            System.out.println("Method return type - "+m.getReturnType());
            System.out.println("Modifier - "+ Modifier.toString(m.getModifiers()));
            Class[] paramTypes= m.getParameterTypes();
            System.out.println(" parameter list - ");
            for(Class paramType : paramTypes) {
                System.out.println(paramType);
            }

            Class[] exceptionTypes= m.getExceptionTypes();
            System.out.println(" exception list - ");
            for(Class exceptionType:exceptionTypes){
                System.out.println(exceptionType);
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }

}
