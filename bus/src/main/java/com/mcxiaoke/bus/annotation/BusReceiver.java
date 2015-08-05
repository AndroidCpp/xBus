package com.mcxiaoke.bus.annotation;

import com.mcxiaoke.bus.Bus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: mcxiaoke
 * Date: 15/7/30
 * Time: 18:12
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BusReceiver {

    Bus.EventMode mode() default Bus.EventMode.Main;
}
