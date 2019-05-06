package com.xiaoya.infra.esbatis.parser;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:56
 */
public class ParserException extends RuntimeException {

    public ParserException() {
        super();
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }
}
