package com.nikhil.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorsInfo {

    public static void main(String[] args){
        Class c= Employee.class;
        //get all public constructors from Employee
        Constructor[] cons1= c.getConstructors();
        printConstructorsInfo(cons1);

        System.out.println("*****************************************************");

        //get all constructors from Employee
        Constructor[] cons2= c.getDeclaredConstructors();
        printConstructorsInfo(cons2);
    }

    private static void printConstructorsInfo(Constructor[] constructors){
        for(Constructor cons: constructors){
            System.out.println("Constructor name - "+cons.getName());
            System.out.println("Constructor Modifier - "+ Modifier.toString(cons.getModifiers()));
            System.out.println("Parameters Type -");
            Class[] parameters = cons.getParameterTypes();
            for(Class c:parameters){
                System.out.println(c.getName());
            }
            System.out.println("Exceptions type -");
            Class[] exceptions = cons.getExceptionTypes();
            for(Class c:exceptions){
                System.out.println(c.getName());
            }
            System.out.println("-----------------------------------------------------------------");
        }

    }

}
