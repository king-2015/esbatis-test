package com.xiaoya.infra.esbatis.annotations;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:53
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Param {
    String value();
}
