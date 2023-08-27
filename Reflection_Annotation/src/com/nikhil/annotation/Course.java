package com.nikhil.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface Course {
    String cid() default "C-111";
    String c_name() default "Quantum mechanics";
    double c_fees() default 2000.0;
}
