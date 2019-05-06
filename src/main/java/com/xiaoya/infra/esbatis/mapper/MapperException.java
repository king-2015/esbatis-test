package com.xiaoya.infra.esbatis.mapper;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:55
 */
public class MapperException extends RuntimeException {
    private static final long serialVersionUID = -176685891441325943L;

    public MapperException() {
        super();
    }

    public MapperException(String message) {
        super(message);
    }

    public MapperException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapperException(Throwable cause) {
        super(cause);
    }
}
