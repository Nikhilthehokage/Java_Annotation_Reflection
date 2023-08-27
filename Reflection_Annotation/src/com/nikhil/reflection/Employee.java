package com.nikhil.reflection;

public class Employee extends Human {
    public static int EmployeeID=1001;
    public String name="Tom";
    String position="SWE";
    private String department="Engineering";

    public Employee(){

    }
    public Employee(String a, String b, int c) throws ClassCastException, ClassNotFoundException{

    }

    public Employee (int a, String b) throws IllegalArgumentException, IllegalAccessException{

    }

    private Employee(int a) throws AbstractMethodError,ArithmeticException{

    }



    public String update(Employee e, int ID) throws ClassCastException , ClassNotFoundException{
        return "Ok";
    }

    private int add(Employee e) throws IllegalArgumentException, IllegalAccessException{
        return 0;
    }
}
