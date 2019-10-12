package com.cathy.aspectjdemo.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 自定义一个拦截点击事件的point
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD,
        ElementType.TYPE})
public @interface OnClickAspectJ {
 long value() default 800;
}
