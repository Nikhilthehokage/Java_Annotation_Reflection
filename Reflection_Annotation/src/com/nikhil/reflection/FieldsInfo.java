package com.nikhil.reflection;
import java.lang.reflect.*;
public class FieldsInfo {
    public static void main(String [] args)  {
        Employee e= new Employee();
        Class c = e.getClass();
        //get all public fields of Employee and its superclasses
        Field[] f =c.getFields();
        try {
            printFieldsInfo(f,e);
        } catch (IllegalAccessException ex) {
            System.out.println(ex);
        }
        //get all fields from Employee
        System.out.println("*************************************************");
        Field[] fc= c.getDeclaredFields();
        try {
            printFieldsInfo(fc,e);
        } catch (IllegalAccessException ex) {
            System.out.println(ex);
        }


    }

    private static void printFieldsInfo(Field[] fields,Employee e) throws IllegalAccessException {
        for(Field f:fields){
            System.out.println("Field name - "+f.getName());
            System.out.println("Field type - "+f.getType());
            System.out.println("Field value - "+f.get(e));
            System.out.println("Field Modifier - "+Modifier.toString(f.getModifiers()));
            System.out.println("----------------------------------------------------------");
        }
    }

}
