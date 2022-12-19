package com.banking.springboot.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FieldsMatchImpl.class)
@Documented
public @interface FieldsMatch {
    String message() default "{FieldsMatch}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String fieldOne();

    String fieldTwo();
}
