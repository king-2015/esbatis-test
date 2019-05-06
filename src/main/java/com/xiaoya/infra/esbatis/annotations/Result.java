package com.xiaoya.infra.esbatis.annotations;

import com.xiaoya.infra.esbatis.handler.ResultHandler;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:53
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Result {
    Class<? extends ResultHandler> value();
}
