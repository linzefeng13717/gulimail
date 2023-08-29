package com.atguigu.common.valid;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.awt.*;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {ListValueConstraintValidator.class}
)
public @interface ListValue {
    String message() default "{com.atguigu.common.valid.ListValue.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    int[] vals() default {};


}
