package com.nikhil.annotation;

public class Test {
    public static void main(String[] args){
        Student st= new Student();
        System.out.println("-----Student details -----");
        System.out.println("Student name - "+st.name);
        System.out.println("Student roll no - "+st.roll_no);
        System.out.println("University - "+st.university);
        Class c= st.getClass();
        Course course = (Course)c.getAnnotation(Course.class);
        System.out.println("------Course details ---------");
        System.out.println("Course id - "+course.cid());
        System.out.println("Course name - "+course.c_name());
        System.out.println("Course fees - "+course.c_fees());

    }
}
