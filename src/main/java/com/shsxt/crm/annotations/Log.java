package com.shsxt.crm.annotations;

import java.lang.annotation.*;

/**
 * Created by lp on 2018/1/13.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String description();//资源描述
}
