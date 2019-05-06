package com.xiaoya.infra.esbatis.annotations;

import com.xiaoya.infra.esbatis.handler.ResultHandler;

import java.lang.annotation.*;

/**
 * @author jinzhong.zhang
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Result {
    Class<? extends ResultHandler> value();
}
