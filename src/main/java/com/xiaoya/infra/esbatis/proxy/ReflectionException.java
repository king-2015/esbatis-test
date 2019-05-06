package com.xiaoya.infra.esbatis.proxy;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:57
 */
public class ReflectionException extends RuntimeException {

    public ReflectionException() {
        super();
    }

    public ReflectionException(String message) {
        super(message);
    }

    public ReflectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReflectionException(Throwable cause) {
        super(cause);
    }
}
