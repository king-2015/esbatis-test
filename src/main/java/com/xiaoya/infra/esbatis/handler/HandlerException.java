package com.xiaoya.infra.esbatis.handler;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:55
 */
public class HandlerException extends RuntimeException {

    public HandlerException() {
        super();
    }

    public HandlerException(String message) {
        super(message);
    }

    public HandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandlerException(Throwable cause) {
        super(cause);
    }
}
